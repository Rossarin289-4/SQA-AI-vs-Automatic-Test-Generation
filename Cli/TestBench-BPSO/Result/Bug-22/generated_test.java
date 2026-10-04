package generated.algorithm;

import junit.framework.TestCase;

public class BinaryParticleSwarmGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<empty>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:5>", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"http://example.com/a?b=c", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<null>", "<sample:4>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<null>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:6>", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:5>", "<empty>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:6>", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:8>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 1), new String[][]{{"getOptionObject", "char", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "b", "true"}}), new String[][]{{"getOptionObject", "java.lang.String", "0"}, {"getOptionObject", "java.lang.String", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:9>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:2>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:5>", "<null>"}});
  assertNull(actual);
 }
 public void testGeneratedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "2020-01-01.5", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<null>", "<sample:5>"}});
  assertNull(actual);
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "0.0", "true"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<empty>", "false"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:5>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, 0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:4>", "<sample:3>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:8>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:5>"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}), new String[][]{{"getOptionValues", "java.lang.String", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<empty>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "true"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"true", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:4>", "true"}});
  assertNull(actual);
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<empty>", "true"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"1E-5", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "2020-00-", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<null>", "<sample:2>", "false"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"[1,2]tI", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "--12020-01-01", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<empty>", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:1>", "<sample:2>"}});
  assertNull(actual);
 }
 public void testGeneratedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"1.12345678901234567", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "et0", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:9>", "<sample:4>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "Hello, World", "false"}}, 2), new String[][]{{"getOptionProperties", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:4>", "true"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:4>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:1>", "<sample:8>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:3>", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "false"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:0>", "<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "100xFFFFFFFF", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "1.25", "<sample:1>"}}, 3), new String[][]{{"getOptionValues", "java.lang.String", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"-A1", "<empty>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:3>", "<sample:3>", "true"}}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "false"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "5W", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"Hello, World", "false"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "<null>", "false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:0>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.123456{7", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<null>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "23456789012345678901234567890", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:10>", "<sample:5>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"true", "false"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, null, 2), new String[][]{{"getOptionObject", "char", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 2, new String[][]{}), new String[][]{{"getOptions", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:3>", "<null>"}, false, 3, new String[][]{}, 2), new String[][]{{"getOptionObject", "java.lang.String", "0"}, {"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "00xFFFFFFFF", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:6>", "<sample:0>", "false"}}, 2), new String[][]{{"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:6>", "<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "214748348", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"a6", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:7>", "true"}});
  assertNull(actual);
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}), new String[][]{{"getArgList", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "a a", "false"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:5>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:9>", "<sample:8>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:6>", "<sample:0>"}}, 2), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "2"}, {"addOption", "java.lang.String,boolean,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0  [ARG] ::  ], =[ option:   [ARG] :: 0 ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"125", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "\u00e9", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:1>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"abc", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:9>", "<sample:7>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"5.\t", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:7>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}), new String[][]{{"getArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"I-", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:7>", "<null>", "false"}, false), new String[][]{{"getOptionValues", "char", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:10>", "true"}, false, 2, new String[][]{}), new String[][]{{"getOptions", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"1.12345678901423456", "false"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:9>", "<sample:8>", "true"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:5>", "false"}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "1.6", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "<empty>", "false"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<empty>", "<sample:1>", "false"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 1), new String[][]{{"getOption", "java.lang.String", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:7>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:8>", "<sample:2>", "<null>", "true"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:7>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:9>", "<sample:0>", "false"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:10>", "<sample:0>", "<sample:4>", "false"}}), new String[][]{{"getRequiredOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:4>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:4>", "true"}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:5>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:6>", "false"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "true"}, false, 0, null, 1), new String[][]{{"getOptionValue", "char", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:1>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<empty>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:8>", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "a /", "false"}}), new String[][]{{"hasOption", "char", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<null>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "-", "<sample:4>"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "false"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:2>", "false"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "<empty>", "false"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 1), new String[][]{{"getArgList", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<empty>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:4>", "<empty>"}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:7>", "false"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "\t", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:5>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "a ", "false"}}, 3), new String[][]{{"getOptionObject", "char", "2"}, {"getArgs", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "01:0", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.25", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:1>", "<sample:3>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<sample:0>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "5-", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:3>", "<null>"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"1.25", "false"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:3>", "<empty>", "true"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:1>", "true"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "1.5e300", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<null>", "<sample:2>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"null ", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "true"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:1>", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:12>", "<sample:4>", "false"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:5>", "false"}}, 2), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<empty>", "<null>", "false"}, false, 6, new String[][]{}, 1), new String[][]{{"getOptionValue", "char,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<null>", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:0>", "<sample:5>"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 1), new String[][]{{"getOptionProperties", "java.lang.String", "4"}, {"load", "java.io.Reader", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "<empty>", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:3>", "false"}}, 3), new String[][]{{"getArgList", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 1), new String[][]{{"getOptionProperties", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:5>", "<sample:0>", "false"}}), new String[][]{{"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<empty>", "<null>"}, false), new String[][]{{"getOptionValue", "char", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "12:30:45-1", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:0>", "<empty>"}, false, 4, new String[][]{}), new String[][]{{"getArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:4>", "<empty>"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.1234567890122456", "false"}}), new String[][]{{"getArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:4>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:8>", "<sample:1>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:3>", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "12345789012345678901234567890", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<empty>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:1>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:4>", "true"}}), new String[][]{{"hasOption", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", " 1.5e300", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<empty>", "false"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, null, 1), new String[][]{{"getOptionObject", "java.lang.String", "5"}, {"getOptionValue", "char,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:10>", "<sample:4>", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}}), new String[][]{{"getArgList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:6>", "false"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:2>"}}), new String[][]{{"indexOf", "java.lang.Object", "4"}, {"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:0>", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:4>", "false"}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, 0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<null>", "<sample:1>"}}, 2), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<null>", "false"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:0>", "<sample:3>"}}, 3), new String[][]{{"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.5d0", "false"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:2>", "<sample:4>", "true"}}, 3), new String[][]{{"set", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:9>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:8>"}, false, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:0>", "false"}}, 1), new String[][]{{"hasOption", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:4>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:0>", "<sample:1>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:4>", "false"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:10>", "<sample:9>", "<sample:3>", "true"}}, 1), new String[][]{{"hasOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:9>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:1>", "true"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 1), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "3"}, {"getRequiredOptions", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<null>"}}, 1), new String[][]{{"addOption", "org.apache.commons.cli.Option", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0 sample  :: a ]} ] [ long {sample=[ option: 0 sample  :: a ]} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:8>", "<sample:3>"}}, 1), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaabaaa", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "true"}});
  assertNull(actual);
 }
 public void testGeneratedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:4>", "<sample:1>", "true"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "2020-01-011", "true"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "214748364", "<sample:2>"}}, 2), new String[][]{{"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "-1/50", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaabaaa", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:5>", "<sample:6>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "false"}, false, 0, null, 3), new String[][]{{"hasOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:8>", "<sample:5>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<empty>", "<sample:5>", "true"}}, 3), new String[][]{{"getOptionValues", "java.lang.String", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:3>", "<null>"}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:4>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:2>"}, false, 2, new String[][]{}, 1), new String[][]{{"getOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:4>", "true"}, false, 4, new String[][]{}, 2), new String[][]{{"getArgList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:8>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 1), new String[][]{{"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:3>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:4>"}}, 1), new String[][]{{"getArgList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "<empty>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:8>", "false"}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:5>"}}, 1), new String[][]{{"getOptionValue", "char,java.lang.String", "4"}, {"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:8>", "<sample:0>"}}), new String[][]{{"getOptions", "", "7"}, {"remove", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:7>", "false"}}, 1), new String[][]{{"getOptionValue", "char,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:8>", "<null>", "<null>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:1>"}}, 3), new String[][]{{"iterator", "", "4"}, {"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<empty>", "true"}}, 1), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:4>", "true"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}), new String[][]{{"getOption", "java.lang.String", "2"}, {"getOptions", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<null>"}, false, 6, new String[][]{}, 3), new String[][]{{"hasOption", "char", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 3), new String[][]{{"getArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<empty>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:7>"}}, 3), new String[][]{{"getOptionValue", "char,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<null>", "<null>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:5>", "<sample:0>"}}, 2), new String[][]{{"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:4>", "<null>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<null>", "false"}}, 1), new String[][]{{"hasOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:5>", "false"}, false, 2, new String[][]{}, 3), new String[][]{{"getArgList", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"ht", "true"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:2>", "<sample:2>", "true"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:7>", "false"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:8>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "0x123455789", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:0>", "<sample:8>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:1>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:9>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:2>"}}, 1), new String[][]{{"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:9>", "<null>", "true"}, false, 0, null, 3), new String[][]{{"getOptionValue", "char,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:3>", "false"}}, 3), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<empty>", "true"}}, 1), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "true"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:1>", "<sample:6>"}}, 3), new String[][]{{"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<sample:4>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 3), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", " ", "true"}}, 2), new String[][]{{"hasOption", "char", "5"}, {"getOptionValue", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:5>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:2>", "<sample:3>"}}, 2), new String[][]{{"set", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<empty>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}}, 3), new String[][]{{"getOptionProperties", "java.lang.String", "4"}, {"stringPropertyNames", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:1>", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:6>", "<empty>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:3>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:3>", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "<empty>", "true"}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:5>", "true"}}, 3), new String[][]{{"getOptionValues", "java.lang.String", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:4>", "true"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "2047483648", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<sample:9>", "<sample:2>", "true"}}, 2), new String[][]{{"removeAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:8>", "<empty>", "false"}, false, 6, new String[][]{}, 3), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:1>", "true"}}, 1), new String[][]{{"getOptions", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:0>", "<sample:5>"}}, 1), new String[][]{{"getRequiredOptions", "", "7"}, {"addAll", "int,java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:1>", "<sample:2>"}}, 1), new String[][]{{"addAll", "int,java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:9>", "<sample:4>", "<sample:4>", "false"}}, 3), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:10>", "<empty>", "<null>", "true"}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<sample:7>", "<sample:5>", "false"}}, 1), new String[][]{{"getOptionValue", "char,java.lang.String", "6"}, {"getOptionObject", "char", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:3>", "<empty>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:4>", "<sample:7>", "true"}}, 1), new String[][]{{"retainAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "--", "<sample:0>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:7>"}}, 2), new String[][]{{"getOptionObject", "char", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:5>", "<null>"}, false, 5, new String[][]{}, 1), new String[][]{{"getOptionValue", "char,java.lang.String", "6"}, {"getOptionObject", "char", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:7>", "false"}, false, 7, new String[][]{}, 2), new String[][]{{"getOptionObject", "java.lang.String", "6"}, {"getArgList", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:4>"}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:1>"}}, 2), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "7"}, {"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "2020-01-01", "<empty>"}}, 2), new String[][]{{"getOptionProperties", "java.lang.String", "3"}, {"keySet", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SynchronizedSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:5>", "<sample:8>"}}, 3), new String[][]{{"hasOption", "java.lang.String", "5"}, {"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:9>", "<sample:7>", "true"}}, 1), new String[][]{{"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:1>", "<null>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}, 3), new String[][]{{"iterator", "", "6"}, {"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:0>", "<empty>"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "1eH10", "<sample:0>"}}, 1), new String[][]{{"addAll", "java.util.Collection", "7"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:4>", "<sample:3>"}}, 3), new String[][]{{"getOptions", "", "6"}, {"clear", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}}, 3), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:2>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:7>", "<empty>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:4>", "<null>", "true"}, false, 4, new String[][]{}, 2), new String[][]{{"getOptionValue", "java.lang.String", "5"}, {"getOptionObject", "java.lang.String", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<null>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:3>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:4>", "<sample:1>", "false"}}, 3), new String[][]{{"hasOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:5>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:7>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:5>", "<sample:0>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:4>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:1>"}}, 2), new String[][]{{"getOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:4>", "<null>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:4>", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "i147483648", "false"}}, 3), new String[][]{{"getOptionValue", "char", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:7>", "<empty>"}, false, 6, new String[][]{}, 3), new String[][]{{"hasOption", "char", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:4>"}}, 2), new String[][]{{"getOptionValues", "char", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "<empty>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:5>", "false"}}, 2), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:4>"}}), new String[][]{{"getOptions", "", "4"}, {"iterator", "", "2"}});
  assertNotNull(actual);
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:2>", "<sample:1>"}}, 1), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "4"}, {"hasOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:8>", "<sample:0>", "<null>", "false"}}, 2), new String[][]{{"addAll", "int,java.util.Collection", "2"}, {"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<sample:8>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "Title", "false"}}, 2), new String[][]{{"hasOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<null>", "<null>", "false"}, false, 1, new String[][]{}, 2), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:2>", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:4>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "Ti", "<sample:1>"}}, 3), new String[][]{{"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:3>", "<sample:2>"}}, 2), new String[][]{{"addAll", "java.util.Collection", "5"}, {"ensureCapacity", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "<null>", "true"}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1e10", "true"}}, 2), new String[][]{{"getArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:0>"}}, 3), new String[][]{{"hasOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}}, 2), new String[][]{{"getRequiredOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<empty>", "<null>"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:3>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<null>"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 1), new String[][]{{"getOptionValue", "char,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:7>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<sample:2>", "<sample:3>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:8>", "<null>"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<sample:7>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:6>", "<sample:3>", "true"}}, 1), new String[][]{{"getOptions", "", "0"}, {"iterator", "", "2"}});
  assertNotNull(actual);
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<null>"}}, 3), new String[][]{{"getRequiredOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:2>", "<sample:4>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:4>", "<sample:5>", "true"}}), new String[][]{{"hasOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:8>", "<empty>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<empty>", "<sample:5>", "false"}}, 3), new String[][]{{"getRequiredOptions", "", "6"}, {"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"b", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:5>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<empty>", "true"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "aaaaaaFaaaaaaaaaaaaaaaaaaaaaa", "true"}}, 3), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"b", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "false"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:5>", "<sample:2>", "true"}}, 2), new String[][]{{"getOption", "java.lang.String", "3"}, {"hasOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}}, 2), new String[][]{{"getOptions", "", "4"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}, 2), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<empty>", "<sample:0>", "false"}}, 2), new String[][]{{"getRequiredOptions", "", "7"}, {"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
}
