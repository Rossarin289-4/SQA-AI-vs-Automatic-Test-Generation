package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:1>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<null>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<null>", "true"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<empty>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:0>", "<empty>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<null>", "true"}});
  assertNull(actual);
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<null>", "false"}});
  assertNull(actual);
 }
 public void testGeneratedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:1>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "-0.0", "<sample:3>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:2>", "<sample:1>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:8>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "-0.0", "<sample:3>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:2>", "<sample:1>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:8>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:0>", "<sample:5>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:2>", "<sample:1>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:9>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<sample:5>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:2>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<empty>", "<sample:2>", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:8>", "<empty>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<sample:1>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:10>", "<null>"}, false, 9, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<empty>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "true"}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "<sample:3>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:4>", "<empty>", "false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<null>", "<null>", "true"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:2>", "true"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:2>", "true"}}), new String[][]{{"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:1>", "true"}}, 2), new String[][]{{"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:1>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<null>", "<empty>", "<sample:1>", "false"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "<empty>", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<empty>", "true"}}, 1), new String[][]{{"iterator", "", "1"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<empty>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}}), new String[][]{{"getOptionValue", "char", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<empty>", "<sample:2>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:1>", "<sample:0>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"I", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<null>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"I", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<null>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<empty>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<null>"}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}}), new String[][]{{"getOptionObject", "char", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "4"}, {"hasOption", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "4"}, {"hasOption", "java.lang.String", "7"}, {"addOption", "org.apache.commons.cli.Option", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  :: 0 ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<null>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "4"}, {"hasOption", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<null>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<null>", "<sample:2>"}}, 1), new String[][]{{"getOptions", "", "4"}, {"add", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<empty>", "false"}, false), new String[][]{{"getArgs", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}), new String[][]{{"getOptionValue", "char,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}), new String[][]{{"getOptionValue", "char,java.lang.String", "5"}, {"getArgList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:0>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:0>", "<sample:0>"}}), new String[][]{{"getOptionValue", "char,java.lang.String", "5"}, {"getArgList", "", "5"}, {"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<empty>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:0>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:0>", "<sample:0>"}}, 2), new String[][]{{"getOptionValue", "char,java.lang.String", "5"}, {"getArgList", "", "5"}, {"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false, 11, new String[][]{});
  assertNull(actual);
 }
 public void testGeneratedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:8>"}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<empty>", "<null>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:1>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:1>", "false"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<empty>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "true"}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<empty>", "<null>", "false"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<null>", "true"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "010", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}), new String[][]{{"getOptionObject", "char", "0"}, {"getOptionValue", "char,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<null>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:1>", "false"}}, 2), new String[][]{{"getOptionValues", "java.lang.String", "2"}, {"hasOption", "java.lang.String", "2"}, {"getOptionValues", "java.lang.String", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:1>", "true"}}, 2), new String[][]{{"getOptionValues", "java.lang.String", "2"}, {"hasOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:1>", "false"}}), new String[][]{{"getOptionObject", "java.lang.String", "1"}, {"getOptionValue", "char", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:1>", "false"}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 1), new String[][]{{"getOptionObject", "java.lang.String", "0"}, {"getOptionValue", "char", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:1>", "<empty>"}, false), new String[][]{{"hasOption", "java.lang.String", "1"}, {"getOptionValue", "char,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"1.5f", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:1>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:3>", "false"}}, 1), new String[][]{{"get", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:9>", "<empty>", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"}-", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "AxFFFFFFFF", "<sample:3>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "AxFFFFFFFF", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<empty>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:10>", "<sample:3>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<null>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:5>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:1>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:1>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<null>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:2>"}}, 3), new String[][]{{"getOptionValue", "java.lang.String", "0"}});
  assertNull(actual);
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:2>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:1>", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "false"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:0>", "<sample:0>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"2020-02-30T25:61:61", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:1>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:0>", "<empty>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:2>", "<sample:0>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:1>", "<sample:2>"}, false, 16, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:3>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:1>", "<sample:0>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"yes", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:1>", "<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, null, 3), new String[][]{{"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<empty>"}, false, 0, null, 3), new String[][]{{"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:2>", "<sample:3>", "true"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<null>", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<empty>", "false"}, false, 0, null, 1), new String[][]{{"getArgList", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false, 0, null, 1), new String[][]{{"getArgList", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "false"}, false, 0, null, 1), new String[][]{{"getArgList", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:1>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<null>", "false"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:0>", "false"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "010", "<null>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "<null>", "false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "<null>", "false"}, false), new String[][]{{"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<sample:0>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<empty>", "false"}}, 3), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  :: sample ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:1>", "true"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<null>", "<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<empty>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<empty>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:9>", "<sample:0>"}, false, 0, null, 1), new String[][]{{"getOptionValue", "java.lang.String", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "false"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}), new String[][]{{"getOptionValue", "java.lang.String", "5"}, {"getOptionObject", "char", "3"}, {"getArgList", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:0>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}), new String[][]{{"getOptionValue", "java.lang.String", "5"}, {"getOptionObject", "char", "3"}, {"getArgList", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:0>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}), new String[][]{{"getOptionValue", "java.lang.String", "5"}, {"getOptionObject", "char", "3"}, {"getArgList", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:0>"}}), new String[][]{{"ensureCapacity", "int", "5"}, {"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<null>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<null>", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:1>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<empty>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:1>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<empty>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:1>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:2>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:1>", "<sample:1>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:0>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:1>", "<sample:0>", "false"}}), new String[][]{{"getArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:1>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:0>", "false"}}, 3), new String[][]{{"getOptionValue", "java.lang.String", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:2>"}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:1>", "<null>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:1>", "<sample:3>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:0>", "<sample:3>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:0>", "true"}}), new String[][]{{"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:8>", "<sample:0>", "<sample:4>", "false"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:8>", "<sample:0>", "<sample:4>", "false"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 3), new String[][]{{"retainAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<null>", "<sample:0>"}}), new String[][]{{"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:1>", "<sample:6>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<empty>", "<sample:1>", "true"}}), new String[][]{{"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "<null>", "false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<null>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<empty>", "false"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:1>", "true"}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:2>", "false"}}, 3), new String[][]{{"set", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:0>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<sample:2>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:1>", "<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:1>"}}, 2), new String[][]{{"hasOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:0>"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}, 2), new String[][]{{"hasOption", "java.lang.String", "7"}, {"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:0>"}}, 2), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {sample=[ option: sample  :: a ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, null, 1), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:8>", "<sample:0>"}, false, 0, null, 1), new String[][]{{"iterator", "", "0"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:2>", "<null>"}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<null>", "false"}}, 2), new String[][]{{"getOptionObject", "char", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:2>", "<null>"}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:0>", "false"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<null>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}), new String[][]{{"getRequiredOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "false"}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "PT1H", "<sample:2>"}}, 1), new String[][]{{"getArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "false"}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "PTH", "<sample:2>"}}, 3), new String[][]{{"getArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"\nd.5", "<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<null>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}}, 2), new String[][]{{"getOptionValue", "char", "7"}, {"getOptionValue", "char", "7"}, {"getOptionValue", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<sample:3>"}}, 2), new String[][]{{"getOptionValue", "char", "7"}, {"getOptionValue", "char", "7"}, {"getOptionValue", "java.lang.String,java.lang.String", "4"}, {"getArgList", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:8>", "<sample:1>", "<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:8>", "<sample:0>", "false"}, false, 6, new String[][]{}, 2), new String[][]{{"getArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "true"}, false, 6, new String[][]{}, 2), new String[][]{{"getArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "false"}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}}, 2), new String[][]{{"getArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:1>", "false"}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "yes", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:6>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "1.5f2020-01-01", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "true"}, false, 5, new String[][]{}, 3), new String[][]{{"getArgList", "", "7"}, {"removeLastOccurrence", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "true"}, false, 5, new String[][]{}, 3), new String[][]{{"getArgList", "", "7"}, {"removeLastOccurrence", "java.lang.Object", "6"}, {"element", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<null>"}}), new String[][]{{"listIterator", "", "0"}, {"previous", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:1>"}}, 3), new String[][]{{"listIterator", "", "0"}, {"previous", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:8>", "<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:9>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:9>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}, 3), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"/a/b", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<null>", "<sample:1>", "true"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"I", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<empty>", "<empty>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:8>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:6>", "<sample:11>"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:2>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:4>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "false"}}), new String[][]{{"getRequiredOptions", "", "5"}, {"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:2>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "true"}}), new String[][]{{"hasOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<sample:2>", "false"}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:0>", "<sample:12>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<null>", "false"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:3>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:1>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1), new String[][]{{"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:3>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:1>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1), new String[][]{{"getOptionValue", "java.lang.String", "1"}, {"iterator", "", "3"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<null>", "<null>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<empty>", "<sample:1>", "true"}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<empty>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<empty>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<empty>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:1>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<null>", "<null>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:2>", "<sample:3>", "true"}}, 1), new String[][]{{"getOptionValue", "char,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "<null>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:2>", "<sample:3>", "true"}}, 2), new String[][]{{"getOptionValue", "char,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "<null>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:2>", "<sample:3>", "true"}}, 2), new String[][]{{"getOptionValue", "char,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}, 2), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:2>", "true"}}), new String[][]{{"getRequiredOptions", "", "1"}, {"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:0>", "<empty>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:3>", "<empty>"}, false, 6, new String[][]{}, 3), new String[][]{{"hasOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<empty>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:1>", "<sample:11>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:1>", "false"}});
  assertNull(actual);
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "<empty>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<empty>", "true"}}, 2), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "6"}, {"getOptionValue", "char", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<null>", "<empty>", "false"}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "http://example.com/a?b=c", "<sample:11>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "1e10", "<sample:4>"}}, 1), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "<empty>", "true"}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "http;//example.com/a?b=c", "<sample:11>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:1>", "<empty>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "<empty>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:2>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "<null>", "true"}, false, 11, new String[][]{}, 2), new String[][]{{"getOptionObject", "char", "4"}, {"getOptionObject", "char", "7"}, {"getOptionValue", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "<empty>", "true"}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:6>"}}, 1), new String[][]{{"getOptionObject", "char", "4"}, {"getOptionObject", "char", "7"}, {"getOptionValue", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:0>", "<empty>"}, false, 1, new String[][]{}, 3), new String[][]{{"getArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}}, 1), new String[][]{{"hasOption", "char", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<empty>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:1>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 3), new String[][]{{"getOptionValue", "char,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:0>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:5>", "<sample:2>", "true"}}, 3), new String[][]{{"hasOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "<a>b</a>", "<null>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:1>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:2>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:2>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:1>", "true"}}, 1), new String[][]{{"getOptionValue", "char", "4"}, {"getArgList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<empty>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:2>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:1>", "false"}}, 1), new String[][]{{"getOptionValue", "char", "4"}, {"getArgList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<null>", "<empty>", "false"}, false, 0, null, 3), new String[][]{{"getOptionValue", "char,java.lang.String", "1"}, {"hasOption", "java.lang.String", "3"}, {"getOptionValues", "char", "0"}});
  assertNull(actual);
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "<null>", "true"}, false, 7, new String[][]{}, 3), new String[][]{{"getOptionValues", "java.lang.String", "3"}, {"hasOption", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "<empty>", "true"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}}, 3), new String[][]{{"getOptionValue", "java.lang.String", "3"}, {"hasOption", "java.lang.String", "3"}, {"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<null>", "<null>", "false"}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<empty>", "false"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:10>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:1>"}}), new String[][]{{"getOptions", "", "7"}, {"iterator", "", "0"}});
  assertNotNull(actual);
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "\037", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:4>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:1>", "false"}}, 1), new String[][]{{"getOptions", "", "7"}, {"iterator", "", "0"}});
  assertNotNull(actual);
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "\037", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:4>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:1>", "false"}}, 1), new String[][]{{"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<empty>", "<sample:0>", "false"}}, 3), new String[][]{{"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<empty>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:0>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<sample:5>"}}, 2), new String[][]{{"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:2>", "<sample:1>", "false"}}, 2), new String[][]{{"getOption", "java.lang.String", "2"}, {"getOptions", "", "5"}, {"clear", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:2>", "<sample:0>", "false"}}, 3), new String[][]{{"addOption", "org.apache.commons.cli.Option", "2"}, {"getOptions", "", "5"}, {"clear", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<sample:11>"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:0>", "<sample:2>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:3>", "<sample:2>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:0>", "true"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:0>", "false"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<empty>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<empty>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:0>", "true"}}, 1), new String[][]{{"getOptionObject", "java.lang.String", "6"}, {"getOptionValues", "java.lang.String", "7"}, {"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<empty>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:0>", "true"}}, 1), new String[][]{{"getOptionObject", "java.lang.String", "6"}, {"getOptionValues", "java.lang.String", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:1>", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}}, 2), new String[][]{{"getOptionObject", "java.lang.String", "6"}, {"getArgList", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:1>", "<null>"}, false, 14, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:1>", "<sample:1>", "false"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:6>", "<sample:6>"}}, 1), new String[][]{{"getOptionObject", "java.lang.String", "6"}, {"getArgList", "", "7"}, {"containsAll", "java.util.Collection", "3"}, {"pollLast", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:4>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:0>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<sample:11>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:0>", "true"}}, 1), new String[][]{{"getArgList", "", "3"}, {"poll", "", "5"}, {"contains", "java.lang.Object", "6"}, {"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1), new String[][]{{"getOptionValue", "char", "2"}, {"iterator", "", "5"}, {"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<empty>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 2), new String[][]{{"ensureCapacity", "int", "0"}, {"remove", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:11>"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:1>", "<sample:1>", "false"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "false"}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:1>", "true"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "a", "<sample:1>"}}), new String[][]{{"getArgList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<null>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<sample:1>", "<sample:2>", "false"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "6"}, {"getOption", "java.lang.String", "3"}, {"addOption", "java.lang.String,boolean,java.lang.String", "5"}, {"getOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: a  :: sample ] {getArgName=arg, getArgs=-1, getDescription=sample, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, has...#294#-195459334", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:1>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<empty>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:1>", "<sample:1>", "true"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 2), new String[][]{{"getOptionValue", "java.lang.String", "2"}, {"getOptionObject", "char", "7"}, {"hasOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "<null>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "<null>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:6>", "<sample:0>"}}, 3), new String[][]{{"getOptionValue", "java.lang.String", "3"}, {"getOptionObject", "char", "7"}, {"hasOption", "java.lang.String", "7"}, {"getArgList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:1>", "<sample:11>"}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:0>", "<sample:2>", "false"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<null>"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<sample:1>", "<sample:2>", "true"}}, 2), new String[][]{{"hasOption", "java.lang.String", "6"}, {"getRequiredOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<empty>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:5>", "<sample:0>", "true"}}, 1), new String[][]{{"getRequiredOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", ".5", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<null>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:1>", "<sample:4>", "true"}}, 3), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "4"}, {"getRequiredOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", ".5", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<null>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:1>", "<sample:4>", "true"}}, 3), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "4"}, {"getRequiredOptions", "", "5"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 56, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<sample:1>", "<sample:1>", "true"}}, 3), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "1"}, {"getRequiredOptions", "", "2"}, {"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:0>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<null>"}}, 2), new String[][]{{"getOptions", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:1>", "<sample:1>", "true"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:1>", "<sample:11>"}}, 2), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "1"}, {"getOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: a  [ARG] :: null :: class java.io.File ] {getArgName=arg, getArgs=1, getDescription=null, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true...#316#-1491864084", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:5>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:1>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:3>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 2), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}, 1), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:2>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}}, 1), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:4>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:0>", "<sample:3>", "false"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:5>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:0>", "<sample:3>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:6>", "false"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<null>", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:1>", "<sample:2>"}}, 3), new String[][]{{"retainAll", "java.util.Collection", "0"}, {"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<empty>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:0>"}}, 1), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<null>", "false"}}, 3), new String[][]{{"removeAll", "java.util.Collection", "4"}, {"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:1>", "<sample:0>", "false"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:5>"}}, 1), new String[][]{{"listIterator", "", "7"}, {"previousIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<sample:1>"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:6>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:0>"}}, 2), new String[][]{{"removeAll", "java.util.Collection", "0"}, {"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "1.5e300", "<sample:1>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:0>", "<sample:0>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<null>", "<sample:5>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:0>"}}, 3), new String[][]{{"contains", "java.lang.Object", "1"}, {"clone", "", "0"}, {"addAll", "java.util.Collection", "4"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<null>"}}, 2), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "false"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "true"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"t", "<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<empty>", "false"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"t", "<sample:3>"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<null>", "<sample:0>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<null>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<empty>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:6>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "9 ", "<sample:5>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
}
