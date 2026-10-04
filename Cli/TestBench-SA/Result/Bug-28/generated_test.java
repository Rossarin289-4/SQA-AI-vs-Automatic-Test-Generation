package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "true"}, false, 16, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "true"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:3>", "true"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "0.5d", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "0.5d", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "0.5d", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:9>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "0.5d", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:9>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "0.5d", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}), new String[][]{{"getArgList", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}), new String[][]{{"getArgList", "", "6"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:0>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:8>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:8>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:8>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<empty>"}}, 1), new String[][]{{"getOptionValues", "java.lang.String", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<empty>"}}), new String[][]{{"getOptionValues", "java.lang.String", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<empty>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:1>"}}), new String[][]{{"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:0>", "true"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:2>", "true"}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:0>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:1>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<null>"}}), new String[][]{{"getArgList", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:1>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<null>"}}, 2), new String[][]{{"getArgList", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:1>", "<sample:0>"}}, 2), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<empty>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<null>", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<empty>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<null>", "false"}}), new String[][]{{"getArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:8>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<null>", "false"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:8>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:1>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:8>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:10>", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<null>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:8>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:10>", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<null>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:8>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:10>", "<sample:1>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:2>"}});
  assertNull(actual);
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "", "<sample:3>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "+1", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:8>", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<empty>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:5>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:1>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:1>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<sample:0>"}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:1>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "<empty>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "12:30:45", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<empty>", "<empty>", "false"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "12:30:45", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:8>", "<sample:1>", "<sample:2>"}});
  assertNull(actual);
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "false"}, false), new String[][]{{"getOptionObject", "java.lang.String", "4"}, {"hasOption", "char", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<empty>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<null>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}), new String[][]{{"hasOption", "char", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:1>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}), new String[][]{{"hasOption", "char", "5"}, {"getParsedOptionValue", "java.lang.String", "0"}});
  assertNull(actual);
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<null>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<null>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<null>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "getOptions", ""}}), new String[][]{{"getOptionValues", "char", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"\n", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:0>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:2>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"I", "<sample:2>"}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "010", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<null>", "<null>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"4--11", "<sample:1>"}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<empty>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<null>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<null>", "true"}}, 1), new String[][]{{"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<null>", "true"}}), new String[][]{{"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:0>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:8>", "<sample:1>", "true"}}), new String[][]{{"retainAll", "java.util.Collection", "7"}, {"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:2>"}}), new String[][]{{"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:2>"}}, 3), new String[][]{{"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<sample:2>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<empty>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "true"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:0>"}}), new String[][]{{"getOptionProperties", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "<empty>", "false"}, false), new String[][]{{"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<empty>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:3>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:2>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   [ARG] :: 0 ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:2>", "false"}}, 2), new String[][]{{"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<empty>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<null>", "<empty>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<null>", "<sample:3>"}}, 2), new String[][]{{"getOptionObject", "char", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<null>", "false"}, false), new String[][]{{"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "true"}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}}, 3), new String[][]{{"getOptionProperties", "java.lang.String", "3"}, {"load", "java.io.Reader", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{a=, b=}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 3), new String[][]{{"getOptionProperties", "java.lang.String", "3"}, {"load", "java.io.Reader", "4"}, {"get", "java.lang.Object", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<empty>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<empty>", "<sample:1>"}});
  assertNull(actual);
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "false"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:0>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "false"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:0>", "<sample:1>"}}, 3), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:8>", "<sample:2>", "<sample:1>", "false"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:2>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:8>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:2>", "<sample:3>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:1>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:2>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:2>", "<null>"}, false), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:4>", "<null>"}, false, 5, new String[][]{}), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:6>", "<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<null>"}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:2>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 2), new String[][]{{"getArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<empty>"}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:2>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:1>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:1>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:1>", "true"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:2>", "true"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "4"}, {"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<null>", "<null>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<null>", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}}, 2), new String[][]{{"isEmpty", "", "7"}, {"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:0>", "<sample:2>", "true"}}, 2), new String[][]{{"isEmpty", "", "7"}, {"add", "java.lang.Object", "2"}, {"remove", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:0>", "<sample:2>", "true"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "1e10", "<sample:1>"}}, 3), new String[][]{{"isEmpty", "", "7"}, {"add", "java.lang.Object", "2"}, {"remove", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "1e10", "<sample:1>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:2>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<null>"}}), new String[][]{{"getMatchingOptions", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<empty>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<empty>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<empty>"}}, 2), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:8>", "<sample:2>", "<null>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:8>", "<sample:4>", "<null>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:5>", "true"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<null>", "<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "--1", "<sample:1>"}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:2>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:0>", "false"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:3>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<empty>", "true"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<null>", "<empty>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:1>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, null, 1), new String[][]{{"getArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "<null>", "false"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:1>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "<null>", "false"}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "<null>", "false"}, false, 8, new String[][]{}, 3), new String[][]{{"getOptionValue", "java.lang.String", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:8>", "<empty>", "<null>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<null>", "<sample:3>", "false"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "true"}}, 3), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:9>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:9>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "true"}}, 3), new String[][]{{"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:12>", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "true"}}, 3), new String[][]{{"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:12>", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "true"}}, 3), new String[][]{{"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "true"}}, 3), new String[][]{{"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "true"}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:0>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:8>", "<null>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:1>"}}, 1), new String[][]{{"getOptionObject", "char", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<sample:9>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<null>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:0>"}}, 1), new String[][]{{"getOptionProperties", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<sample:9>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<null>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:0>"}}, 1), new String[][]{{"getOptionProperties", "java.lang.String", "0"}, {"setProperty", "java.lang.String,java.lang.String", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:5>", "<null>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:1>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<sample:1>"}}), new String[][]{{"getArgList", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:5>", "<null>", "false"}, false, 1, new String[][]{}, 3), new String[][]{{"getArgList", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:8>", "<null>", "false"}, false, 1, new String[][]{}, 3), new String[][]{{"getArgList", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:10>", "<sample:3>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 2), new String[][]{{"getOptions", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:10>", "<sample:3>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 2), new String[][]{{"getParsedOptionValue", "java.lang.String", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "true"}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<null>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 2), new String[][]{{"getParsedOptionValue", "java.lang.String", "3"}, {"getArgList", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "false"}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<null>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 2), new String[][]{{"getParsedOptionValue", "java.lang.String", "3"}, {"getArgList", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<empty>", "<sample:3>", "false"}}, 1), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<null>", "<empty>", "false"}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<sample:1>", "<sample:1>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<empty>", "true"}}), new String[][]{{"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "<null>", "true"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}}), new String[][]{{"getOptionObject", "java.lang.String", "0"}, {"getParsedOptionValue", "java.lang.String", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "<null>", "true"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}}), new String[][]{{"getOptionObject", "java.lang.String", "0"}, {"getParsedOptionValue", "java.lang.String", "1"}, {"getOptionProperties", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<empty>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:8>", "<sample:1>"}}, 1), new String[][]{{"set", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:2>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:8>", "<sample:1>"}}, 1), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 1), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:10>", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 1), new String[][]{{"getOptionProperties", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 2, new String[][]{}, 1), new String[][]{{"getOptionProperties", "java.lang.String", "2"}, {"storeToXML", "java.io.OutputStream,java.lang.String,java.nio.charset.Charset", "2"}, {"elements", "", "0"}});
  assertNotNull(actual);
 }
 public void testGeneratedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<null>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:0>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:6>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:0>", "true"}}, 1), new String[][]{{"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:8>", "<sample:0>", "false"}}, 3), new String[][]{{"getOptions", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:8>", "<sample:2>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<sample:1>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<sample:1>", "false"}, false, 0, null, 3), new String[][]{{"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"2020-02-U30T25:61:61", "<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"{\"!\"a0-", "<sample:5>"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "17", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:1>", "<null>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:0>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:1>"}}), new String[][]{{"hasLongOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:3>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:1>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:6>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<sample:2>", "<sample:0>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<empty>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:1>", "false"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:8>", "<sample:1>", "true"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:8>", "<sample:6>", "true"}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<null>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:0>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<empty>"}}), new String[][]{{"getOptions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:4>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<empty>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:0>", "<sample:0>", "true"}}), new String[][]{{"getOptions", "", "3"}, {"retainAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:0>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 2), new String[][]{{"getOptions", "", "3"}, {"retainAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<empty>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:1>", "<empty>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:0>", "<null>"}, false, 0, null, 3), new String[][]{{"getOptionValues", "char", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<sample:1>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<empty>", "false"}}, 2), new String[][]{{"getOptionObject", "char", "5"}, {"hasOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"5.Unrecognized option: ", "<sample:0>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:1>", "true"}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 2), new String[][]{{"hasLongOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:2>", "<empty>"}, false, 14, new String[][]{}, 2), new String[][]{{"getArgs", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<null>", "<empty>"}, false, 15, new String[][]{}, 2), new String[][]{{"getArgs", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "1.5d", "<sample:0>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<null>", "true"}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "a b", "<sample:1>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:8>", "<empty>", "<sample:1>", "false"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<empty>", "false"}, false, 8, new String[][]{}, 2), new String[][]{{"getOptionObject", "char", "2"}, {"hasOption", "char", "2"}, {"getOptionValue", "java.lang.String", "4"}, {"getOptionValue", "char,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "1.25", "<sample:1>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 1), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:8>", "<sample:0>", "true"}, false, 15, new String[][]{}, 1), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "1"}, {"getOptionValue", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<empty>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:0>", "true"}}, 1), new String[][]{{"hasOption", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:0>", "<null>"}, false, 6, new String[][]{}, 3), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:0>", "<null>"}, false, 6, new String[][]{}, 3), new String[][]{{"iterator", "", "0"}, {"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:2>", "<empty>"}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:10>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "", "<sample:0>"}}, 2), new String[][]{{"getOptionObject", "java.lang.String", "0"}, {"getOptionProperties", "java.lang.String", "0"}, {"load", "java.io.InputStream", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{a=}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:2>", "<empty>"}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:10>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "", "<sample:0>"}}, 2), new String[][]{{"getOptionObject", "java.lang.String", "0"}, {"getOptionValues", "char", "0"}, {"getArgList", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:4>", "<empty>"}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:10>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "", "<sample:0>"}}, 2), new String[][]{{"getOptionObject", "java.lang.String", "0"}, {"getOptionValues", "char", "0"}, {"getArgList", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:1>", "<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:1>", "<empty>"}, false, 0, null, 2), new String[][]{{"getArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:2>", "false"}, {"org.apache.commons.cli.Parser", "getOptions", ""}}), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<empty>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:2>", "<sample:3>"}}, 1), new String[][]{{"hasLongOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "false"}, false, 0, null, 1), new String[][]{{"getOptionObject", "char", "5"}, {"getParsedOptionValue", "java.lang.String", "6"}, {"hasOption", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<null>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:1>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:1>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:1>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:1>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:1>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:1>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:1>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:1>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:0>", "<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:16>", "<sample:0>", "<empty>"}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:8>", "<sample:2>", "false"}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 3), new String[][]{{"getOptionValue", "char", "7"}, {"getOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:8>", "<sample:0>", "<empty>", "true"}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:8>", "<sample:0>", "<empty>", "true"}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 2), new String[][]{{"getOptionObject", "char", "0"}});
  assertNull(actual);
 }
 public void testGeneratedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<empty>", "<null>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:2>"}}, 2), new String[][]{{"iterator", "", "1"}, {"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "<null>", "false"}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<null>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:8>", "<sample:4>", "true"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<sample:2>"}}, 1), new String[][]{{"iterator", "", "6"}, {"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:9>", "<sample:1>", "<null>", "true"}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 1), new String[][]{{"getOptionValue", "char,java.lang.String", "4"}, {"getOptionObject", "java.lang.String", "0"}, {"iterator", "", "3"}, {"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:1>", "<empty>"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 3), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:6>", "<null>"}}, 2), new String[][]{{"getOptionValue", "char,java.lang.String", "0"}, {"getArgs", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:6>", "<null>"}}, 2), new String[][]{{"getOptionValue", "char,java.lang.String", "0"}, {"getArgs", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:2>", "<empty>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<null>", "<sample:2>", "true"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<null>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:9>"}}, 3), new String[][]{{"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:10>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:2>", "true"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:2>", "<empty>"}}, 1), new String[][]{{"hasOption", "java.lang.String", "5"}, {"getArgList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:2>"}}), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:0>", "<null>"}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:2>", "<null>"}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:2>", "<null>"}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}}, 1), new String[][]{{"getOptionProperties", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<null>"}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", " ", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:0>", "<sample:3>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:8>", "<sample:1>", "<null>", "true"}, false, 0, null, 1), new String[][]{{"getOptionValues", "char", "0"}, {"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:6>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:1>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:0>"}}), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "4"}, {"hasOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:1>", "<null>", "true"}}, 2), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "6"}, {"getMatchingOptions", "java.lang.String", "4"}, {"add", "java.lang.Object", "2"}, {"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:1>", "<null>", "true"}}, 2), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "6"}, {"getMatchingOptions", "java.lang.String", "4"}, {"add", "java.lang.Object", "2"}, {"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "abc", "<null>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<sample:0>"}}, 3), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "6"}, {"hasOption", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:10>", "<sample:0>"}}, 3), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "6"}, {"hasOption", "java.lang.String", "6"}, {"getOptionGroup", "org.apache.commons.cli.Option", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:10>", "<sample:0>"}}, 3), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "6"}, {"getRequiredOptions", "", "6"}, {"add", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:3>"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"b", "<sample:0>"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:8>", "<sample:1>", "<empty>", "false"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<empty>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:1>", "<sample:1>"}}, 1), new String[][]{{"getOptionValues", "char", "6"}, {"getOptionValues", "char", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:8>", "<sample:1>", "<empty>", "true"}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<empty>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1), new String[][]{{"getOptionValues", "char", "6"}, {"getOptionValues", "char", "3"}, {"getOptionValues", "char", "5"}, {"getOptionProperties", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:2>", "<sample:2>", "true"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:8>", "<sample:1>", "<sample:2>", "true"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:6>", "<sample:4>"}}, 2), new String[][]{{"getRequiredOptions", "", "6"}, {"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:8>", "<sample:1>", "<sample:1>", "true"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:6>", "<sample:4>"}}, 1), new String[][]{{"getRequiredOptions", "", "6"}, {"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:2>", "<sample:3>", "true"}}, 3), new String[][]{{"getRequiredOptions", "", "6"}, {"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:8>", "<sample:2>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "/a/b", "<empty>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:2>", "<sample:3>", "true"}}, 3), new String[][]{{"getRequiredOptions", "", "6"}, {"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:2>", "<empty>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "/asb", "<empty>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:2>", "<sample:3>", "true"}}, 3), new String[][]{{"getRequiredOptions", "", "5"}, {"lastIndexOf", "java.lang.Object", "2"}, {"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:2>", "<empty>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "/asb", "<empty>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:2>", "<sample:3>", "true"}}, 3), new String[][]{{"addOption", "org.apache.commons.cli.Option", "5"}, {"getOptions", "", "2"}, {"containsAll", "java.util.Collection", "0"}, {"add", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:2>", "<empty>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "/asb2020-01-01", "<empty>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:2>", "<sample:2>", "true"}}, 2), new String[][]{{"addOption", "org.apache.commons.cli.Option", "5"}, {"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: 0 sample  :: a ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:8>", "<sample:2>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}}), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:8>", "<sample:2>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}}, 3), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:1>", "true"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "1.5f", "<sample:0>"}}, 2), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<null>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<empty>", "<empty>"}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "false"}}, 3), new String[][]{{"ensureCapacity", "int", "0"}, {"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:4>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:1>"}}, 3), new String[][]{{"iterator", "", "0"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:1>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1), new String[][]{{"getMatchingOptions", "java.lang.String", "5"}, {"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:5>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:0>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}, 2), new String[][]{{"indexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<empty>", "<sample:3>"}}, 2), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "true"}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<sample:0>"}}, 1), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "6"}, {"hasShortOption", "java.lang.String", "2"}, {"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: 0  [ARG] ::  ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:3>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<sample:1>"}}, 1), new String[][]{{"addOption", "org.apache.commons.cli.Option", "1"}, {"hasLongOption", "java.lang.String", "2"}, {"getMatchingOptions", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:8>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "false"}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:0>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:6>", "false"}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:0>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:1>", "<sample:11>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:8>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<null>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:8>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<null>", "true"}});
  assertNull(actual);
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 1), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:8>", "<sample:6>", "true"}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:3>", "<empty>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:11>"}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:11>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:8>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:0>", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<sample:11>"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<empty>", "<sample:1>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:6>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:8>", "<empty>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"t", "<sample:11>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:0>"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:0>"}});
  assertNull(actual);
 }
 public void testGeneratedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"t", "<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:2>", "<sample:3>", "false"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"t", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:2>", "<sample:3>", "false"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
}
