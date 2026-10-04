package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.12345678", "false"}});
  assertNull(actual);
 }
 public void testGeneratedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<sample:1>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "<sample:1>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "<sample:2>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<null>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<empty>", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<empty>", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:2>", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "a", "<sample:0>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.1234567", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<sample:0>"}});
  assertNull(actual);
 }
 public void testGeneratedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "abc", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<empty>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:1>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "null", "true"}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:2>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "null", "true"}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"1.12345678", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"1/12345678", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:2>", "<sample:3>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "-1", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:6>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:6>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<null>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:4>"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:0>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:0>", "<empty>", "true"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:0>", "<empty>", "true"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:0>", "<empty>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:0>", "<empty>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<null>", "<empty>", "false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "<sample:2>", "false"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<null>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:8>", "<sample:3>", "true"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "<null>", "false"}, false, 12, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<null>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:8>", "<sample:4>", "true"}}), new String[][]{{"getOptionValues", "char", "0"}});
  assertNull(actual);
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<null>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<empty>", "false"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}, 1), new String[][]{{"getOptionValues", "java.lang.String", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "false"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<empty>", "false"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "\u00e9", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<empty>"}}), new String[][]{{"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<empty>"}}), new String[][]{{"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}), new String[][]{{"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}, 1), new String[][]{{"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}, 1), new String[][]{{"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, false, 12, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}, 1), new String[][]{{"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "false"}, false, 8, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}, 1), new String[][]{{"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "true"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.12345678901234567", "true"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "true"}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "<sample:0>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<empty>", "true"}});
  assertNull(actual);
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<empty>", "false"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.5d", "false"}});
  assertNull(actual);
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.5d", "false"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<empty>", "true"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<null>", "true"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<empty>", "false"}}), new String[][]{{"getOptionValue", "java.lang.String", "1"}, {"getArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<empty>", "false"}}, 2), new String[][]{{"getOptionValue", "java.lang.String", "1"}, {"getArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:0>"}, false, 3, new String[][]{}, 2), new String[][]{{"getOptionValue", "java.lang.String", "1"}, {"getArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<null>"}}), new String[][]{{"getOptionValue", "java.lang.String", "1"}, {"getArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", " ", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "\u00e9", "false"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:0>", "<null>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<null>", "<empty>", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:0>", "true"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "0x123456789", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<empty>", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:0>", "true"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "0x123456789", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"-0.0", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<empty>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, null, 3), new String[][]{{"getOptionObject", "char", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<null>", "false"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}), new String[][]{{"getOptionObject", "char", "7"}, {"getOptionValues", "java.lang.String", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "i", "true"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "i", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:1>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "i", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:1>", "<sample:1>"}}, 3), new String[][]{{"getRequiredOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "<null>", "false"}, false), new String[][]{{"getOptionValues", "java.lang.String", "2"}, {"hasOption", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<empty>", "false"}});
  assertNull(actual);
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "<empty>", "false"}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<empty>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<empty>", "false"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<null>"}}), new String[][]{{"getOptionProperties", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"1.1234567890123456", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"2020-02-30T25:61:61", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "false"}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:4>", "false"}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "true"}, false, 9, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "true"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "--", "false"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.1234567890123456", "true"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, 0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"\n", "true"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<null>"}, false), new String[][]{{"getOptionValue", "char,java.lang.String", "5"}, {"hasOption", "char", "2"}, {"hasOption", "char", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.12345678", "true"}}), new String[][]{{"getOptionValue", "char,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:2>", "<sample:3>", "true"}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:2>", "<sample:3>", "true"}}, 3), new String[][]{{"hasOption", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"a,b,c", "false"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:1>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:2>", "<empty>"}}), new String[][]{{"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<null>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:5>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "false"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}), new String[][]{{"getOptionObject", "java.lang.String", "1"}, {"getOptionProperties", "java.lang.String", "3"}, {"storeToXML", "java.io.OutputStream,java.lang.String", "3"}, {"keySet", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SynchronizedSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "true"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "I", "<empty>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:0>", "false"}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 3), new String[][]{{"getOptionObject", "java.lang.String", "1"}, {"getOptionProperties", "java.lang.String", "3"}, {"storeToXML", "java.io.OutputStream,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "false"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "I", "<empty>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:0>", "false"}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 3), new String[][]{{"getOptionObject", "java.lang.String", "1"}, {"getOptions", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:8>"}}, 2), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:8>"}}, 2), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "1"}, {"addOptionGroup", "org.apache.commons.cli.OptionGroup", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:0>", "<null>"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:1>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:6>", "<null>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:9>", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:1>", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", ".", "<sample:0>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:1>", "<empty>"}}), new String[][]{{"getOptionObject", "java.lang.String", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:2>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<empty>", "<sample:3>"}}), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "4"}, {"getRequiredOptions", "", "7"}, {"add", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:8>", "<sample:2>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<empty>", "false"}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:1>", "<sample:1>", "false"}}), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "7"}, {"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "true"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:1>", "true"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<empty>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<null>", "true"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, 0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"{e00", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<empty>"}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<null>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:10>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "1.1234567890123456", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "i", "<null>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:1>", "<null>"}, false), new String[][]{{"hasOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:0>", "<null>"}, false), new String[][]{{"getOptionValue", "char,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:8>", "<sample:4>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 3), new String[][]{{"hasOption", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:8>", "<sample:7>", "<null>"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 3), new String[][]{{"hasOption", "char", "0"}, {"getOptionObject", "java.lang.String", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:2>", "<empty>"}, false, 15, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "0", "<empty>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "+1", "false"}}, 3), new String[][]{{"getOptionValue", "char,java.lang.String", "2"}, {"getOptionObject", "java.lang.String", "1"}, {"getOptionValue", "java.lang.String,java.lang.String", "1"}, {"getOptionValue", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:4>", "<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:5>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:5>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:2>", "true"}}), new String[][]{{"hasOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:5>", "<null>"}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "a", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<empty>", "<empty>", "true"}, false, 12, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:0>", "<sample:0>", "true"}}), new String[][]{{"getOptionValue", "char", "2"}, {"getOptionObject", "char", "2"}, {"getOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"1.123145678901234567", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "-1", "true"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:2>", "false"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"\u00e9", "false"}, false, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<null>", "false"}}), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", ".5", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:0>", "<empty>"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "\n", "false"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:5>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<null>", "<sample:2>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, 0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<null>", "true"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<null>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:5>", "<empty>"}, false, 0, null, 1), new String[][]{{"getOptionValue", "java.lang.String", "0"}});
  assertNull(actual);
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:10>", "<sample:5>", "<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:10>", "<sample:4>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:5>", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<empty>", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a b", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"bc", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<null>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:1>"}}, 1), new String[][]{{"retainAll", "java.util.Collection", "3"}, {"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", " ", "true"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:7>", "<empty>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:1>", "<empty>"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:0>"}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 2), new String[][]{{"getOptionValues", "char", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"1", "<null>"}, false, 14, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:5>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<empty>"}}, 1), new String[][]{{"hasOption", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "<empty>", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:1>", "<sample:3>", "true"}}, 3), new String[][]{{"iterator", "", "7"}, {"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:3>", "<null>"}, false, 15, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "false"}}, 1), new String[][]{{"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "1.5", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "1.5", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<empty>"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "", "false"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 1), new String[][]{{"getOptionValue", "char,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:0>", "<null>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<null>", "<empty>", "<sample:0>", "false"}}, 1), new String[][]{{"getOptions", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<null>", "<empty>", "<sample:0>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<empty>", "true"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:1>", "<empty>"}}, 2), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:1>", "<empty>"}}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<null>", "<sample:2>"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"set", "int,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"2147483648", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "<empty>", "false"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<sample:2>"}}, 2), new String[][]{{"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "<null>", "true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:4>", "<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:1>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<empty>", "true"}}), new String[][]{{"getRequiredOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "true"}, false, 8, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:1>", "false"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:5>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "\t", "<null>"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}}, 1), new String[][]{{"addOption", "org.apache.commons.cli.Option", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0 sample  :: a ]} ] [ long {sample=[ option: 0 sample  :: a ]} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 1), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "true"}, false, 10, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "1.12345678901234567", "<null>"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:4>", "<empty>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:0>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:0>", "<null>"}, false, 1, new String[][]{}, 1), new String[][]{{"getOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:0>", "<null>"}, false, 1, new String[][]{}, 1), new String[][]{{"getArgList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "false"}, false, 11, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 2), new String[][]{{"getOptionObject", "char", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "true"}, false, 11, new String[][]{}, 3), new String[][]{{"getOptionObject", "char", "5"}, {"getOptionObject", "char", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, false, 3, new String[][]{}, 3), new String[][]{{"getOptionObject", "char", "5"}, {"getArgList", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "true"}, false, 3, new String[][]{}, 3), new String[][]{{"getOptionObject", "char", "5"}, {"getArgList", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "--", "false"}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 3), new String[][]{{"getArgList", "", "0"}, {"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "<empty>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<empty>"}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 3), new String[][]{{"getArgList", "", "0"}, {"containsAll", "java.util.Collection", "7"}, {"remove", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "<empty>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<empty>"}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 3), new String[][]{{"getArgList", "", "0"}, {"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "<a>b</a>", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"1e;002020-01-01", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:0>", "false"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "<empty>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "<empty>", "false"}, false, 0, null, 3), new String[][]{{"getOptionValues", "java.lang.String", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "i", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<empty>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<null>", "<null>", "false"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:5>"}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:5>"}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:2>"}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<null>", "true"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:5>", "<empty>", "true"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 3), new String[][]{{"getArgList", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:5>", "<empty>", "true"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 2), new String[][]{{"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "<empty>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "<null>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "<empty>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:0>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:0>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<null>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:2>", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "true"}, false, 0, null, 2), new String[][]{{"hasOption", "char", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:6>", "<sample:2>"}, false, 15, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<sample:1>", "<sample:1>", "true"}}, 2), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:5>", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "a b", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<null>", "<sample:5>", "<empty>"}}, 3), new String[][]{{"getOptionObject", "char", "7"}, {"getOptionObject", "char", "0"}, {"getOptionProperties", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:2>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "_ bb", "false"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<null>", "<empty>"}}, 3), new String[][]{{"getOptionObject", "char", "7"}, {"getOptionObject", "char", "0"}, {"getOptionProperties", "java.lang.String", "6"}, {"keys", "", "1"}});
  assertNotNull(actual);
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:5>", "false"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:8>", "<sample:8>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:0>", "<null>", "true"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "12:30:55", "false"}}, 2), new String[][]{{"getOptionValue", "char,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<empty>", "false"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "1.12345678", "<null>"}}, 3), new String[][]{{"getArgList", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:5>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<empty>", "false"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "1.22345678", "<null>"}}, 3), new String[][]{{"getArgList", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:1>", "false"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "a,b,c", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:5>", "<sample:0>", "false"}}, 1), new String[][]{{"getRequiredOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:5>", "<empty>", "false"}, false, 5, new String[][]{}, 2), new String[][]{{"hasOption", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:5>", "false"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:2>"}}, 3), new String[][]{{"addAll", "java.util.Collection", "4"}, {"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:5>", "true"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:4>"}}), new String[][]{{"addAll", "java.util.Collection", "4"}, {"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:7>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:8>", "<sample:3>"}}, 3), new String[][]{{"iterator", "", "4"}, {"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:5>", "<null>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:7>", "true"}}, 3), new String[][]{{"iterator", "", "4"}, {"hasNext", "", "0"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:1>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "[1,2]", "<sample:0>"}}, 3), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<null>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "true"}, false, 13, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 2), new String[][]{{"getOptionValue", "char,java.lang.String", "6"}, {"getOptionObject", "char", "5"}, {"getOptionValue", "java.lang.String,java.lang.String", "2"}, {"getOptionProperties", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"abr", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:1>"}});
  assertNull(actual);
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "abr", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:1>", "<empty>"}, false, 0, null, 2), new String[][]{{"hasOption", "char", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:1>", "<empty>"}, false, 0, null, 2), new String[][]{{"getArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<empty>", "<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 2), new String[][]{{"hasOption", "java.lang.String", "6"}, {"addOption", "java.lang.String,boolean,java.lang.String", "2"}, {"getRequiredOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:5>", "true"}, false, 0, null, 2), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:1>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:2>", "<sample:2>"}}, 2), new String[][]{{"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:5>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:2>", "<empty>", "true"}}, 1), new String[][]{{"add", "java.lang.Object", "3"}, {"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:5>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "I", "<null>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:2>", "<empty>", "true"}}, 1), new String[][]{{"add", "java.lang.Object", "3"}, {"addAll", "int,java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "<null>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "<null>", "false"}, false, 0, null, 1), new String[][]{{"getArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<empty>", "false"}}, 1), new String[][]{{"getArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<empty>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<empty>", "false"}}, 1), new String[][]{{"getArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:3>", "true"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:0>", "<empty>", "true"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:0>"}}, 2), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:0>", "true"}, {"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 2), new String[][]{{"iterator", "", "0"}, {"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:0>", "true"}}, 2), new String[][]{{"trimToSize", "", "0"}, {"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:8>", "<sample:1>", "true"}}, 3), new String[][]{{"trimToSize", "", "3"}, {"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<null>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:8>", "<sample:1>", "true"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "Hello, World", "false"}}, 1), new String[][]{{"trimToSize", "", "3"}, {"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<empty>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:1>", "true"}}, 2), new String[][]{{"hasOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<null>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "false"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.1234567", "false"}}, 2), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:0>", "true"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.12345678I", "false"}}), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "<empty>", "true"}, false, 0, null, 2), new String[][]{{"getArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"ab", "true"}, false, 8, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:1>", "true"}});
  assertNull(actual);
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"^tt;b001.5e300", "true"}, false, 12, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:5>", "<sample:2>", "false"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "ab", "true"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "0[E", "true"}});
  assertNull(actual);
 }
 public void testGeneratedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "false"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:5>"}}, 3), new String[][]{{"listIterator", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:1>", "<sample:2>", "false"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<empty>"}}), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "3"}, {"getOptions", "", "5"}, {"removeAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:1>"}}), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "3"}, {"getOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<empty>"}}, 3), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "3"}, {"getOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:1>", "<sample:0>"}}, 3), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "3"}, {"getOptions", "", "5"}, {"retainAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:8>", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:2>", "<sample:1>", "true"}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "6"}, {"addOptionGroup", "org.apache.commons.cli.OptionGroup", "2"}, {"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: \000  :: null ], [ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<null>", "<null>", "false"}}, 2), new String[][]{{"addOption", "org.apache.commons.cli.Option", "6"}, {"getOptionGroup", "org.apache.commons.cli.Option", "2"}, {"addOptionGroup", "org.apache.commons.cli.OptionGroup", "6"}, {"getOptions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: \000  :: null ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:5>", "<null>"}}, 2), new String[][]{{"getRequiredOptions", "", "6"}, {"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:2>"}}, 2), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:3>"}, false, 11, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<null>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:2>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"b", "<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:5>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:2>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<null>", "<empty>", "true"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}}, 1), new String[][]{{"hasOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "ab", "<sample:2>"}}, 1), new String[][]{{"addOption", "org.apache.commons.cli.Option", "5"}, {"getOptions", "", "0"}, {"remove", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:2>", "<sample:2>", "false"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:1>", "<sample:1>", "false"}}, 3), new String[][]{{"clone", "", "0"}, {"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:1>", "<empty>"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:1>"}}, 2), new String[][]{{"removeAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "7"}, {"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:0>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<null>", "<empty>", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "true"}}, 3), new String[][]{{"hasOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<null>", "<empty>", "<empty>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<empty>", "<sample:3>", "true"}}, 3), new String[][]{{"hasOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<empty>"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}}, 3), new String[][]{{"getOptions", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:0>", "false"}}, 1), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}, 1), new String[][]{{"getOptions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:0>"}}, 1), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "7"}, {"addOption", "java.lang.String,boolean,java.lang.String", "3"}, {"hasOption", "java.lang.String", "5"}, {"getOptions", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ], [ option: sample  :: a ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"b", "<sample:5>"}, false, 9, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:5>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:2>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"b", "<sample:6>"}, false, 9, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:5>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:2>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:5>", "<empty>", "true"}}, 1), new String[][]{{"addOption", "org.apache.commons.cli.Option", "5"}, {"getOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 0 sample  :: a ] {getArgName=arg, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasA...#292#-12176836", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
}
