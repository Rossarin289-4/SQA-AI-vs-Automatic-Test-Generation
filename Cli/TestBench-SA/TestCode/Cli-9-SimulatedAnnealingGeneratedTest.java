package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "1.12345678", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "1e10", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "1e10", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "1e10", "<empty>"}}), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "false"}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "false"}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}}, 3), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "false"}, false), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "a", "<empty>"}}, 2), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "false"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "a", "<empty>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 2), new String[][]{{"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "false"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "a", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "true"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:0>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "a", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "true"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:0>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<null>", "<null>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "a", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:3>", "true"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:0>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<null>", "<null>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "a", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:6>", "true"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:0>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<null>", "<null>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "a", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:6>", "true"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:0>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<null>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", ".", "<sample:1>"}}, 2), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<null>", "true"}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:0>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<null>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", ".", "<sample:1>"}}), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<null>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<null>", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:6>", "<sample:1>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"Title", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:2>", "<sample:3>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"Title", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<null>", "<sample:1>", "<sample:6>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "<sample:6>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:1>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:3>"}});
  assertNull(actual);
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"i", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<empty>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "a b1.1234567", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:2>"}});
  assertNull(actual);
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:4>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:1>", "<sample:0>", "false"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<null>", "<sample:3>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:1>", "<sample:0>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:0>", "<sample:3>", "true"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:0>", "<sample:6>", "true"}}), new String[][]{{"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:0>", "<sample:5>", "true"}}, 1), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:0>", "<sample:5>", "true"}}, 2), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:0>", "<sample:5>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "<empty>", "true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<null>", "<empty>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<null>"}}), new String[][]{{"getArgList", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<null>", "<empty>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<null>"}}), new String[][]{{"getArgList", "", "0"}, {"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:0>"}}), new String[][]{{"getOptionValue", "char", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "true"}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:0>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:0>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "true"}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<null>", "true"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}), new String[][]{{"hasOption", "java.lang.String", "4"}, {"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}), new String[][]{{"hasOption", "java.lang.String", "4"}, {"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}), new String[][]{{"hasOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<null>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"2147483648", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"2147583648", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<null>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:6>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:3>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}}, 3), new String[][]{{"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:5>", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:6>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:2>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:6>", "<empty>", "false"}, false, 0, null, 2), new String[][]{{"getOptionValue", "java.lang.String", "6"}, {"getArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:4>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:0>", "<sample:1>"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:1>", "true"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:0>", "<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:1>", "true"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "true"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "true"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:1>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:1>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<null>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:1>", "<null>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<null>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:0>", "true"}}), new String[][]{{"getOptionValue", "char", "3"}, {"getOptionValue", "char", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<null>", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:2>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:0>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<empty>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}}), new String[][]{{"getOptionValues", "java.lang.String", "3"}, {"hasOption", "char", "1"}, {"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<empty>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}}), new String[][]{{"getOptionValues", "java.lang.String", "3"}, {"hasOption", "char", "1"}, {"getOptionValue", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}}), new String[][]{{"getOptionValues", "java.lang.String", "3"}, {"hasOption", "char", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}}), new String[][]{{"getOptionValues", "java.lang.String", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}}, 2), new String[][]{{"getOptionValues", "java.lang.String", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<empty>", "false"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:6>"}}, 2), new String[][]{{"getOptionObject", "java.lang.String", "6"}, {"getArgList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<null>", "<sample:0>", "true"}}, 1), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  :: sample ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<sample:1>"}}), new String[][]{{"getOptionValues", "java.lang.String", "7"}, {"getArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "false"}}, 1), new String[][]{{"getOptionValues", "java.lang.String", "7"}, {"getArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "false"}}, 1), new String[][]{{"getOptionValues", "java.lang.String", "7"}, {"getArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<null>", "<empty>", "true"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "2020-02-30T25:61:61", "<null>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:3>"}}, 3), new String[][]{{"getRequiredOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "2020-02-30T25:61:61", "<null>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:3>"}}), new String[][]{{"getRequiredOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:1>", "<null>", "true"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<null>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "false"}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "false"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:1>", "<sample:0>"}}), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:1>", "<sample:0>"}}), new String[][]{{"listIterator", "", "7"}, {"set", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:0>", "<empty>"}, false), new String[][]{{"getArgList", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "Unrecognized option: ", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:1>", "true"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "Unrecognized option: ", "<sample:1>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:1>", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:2>", "<sample:0>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "-0.0", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "-0.0", "<empty>"}}, 1), new String[][]{{"getOptionValue", "char,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "-0.0", "<empty>"}}, 1), new String[][]{{"getOptionValue", "char", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:6>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:6>", "<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:1>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:1>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:1>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:1>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:3>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:0>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:2>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:3>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:3>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<null>"}}, 2), new String[][]{{"getOptionValues", "java.lang.String", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:3>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:2>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 2), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"2020-02-30T25:61:61", "<empty>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:4>", "true"}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<empty>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "<sample:4>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:4>", "<null>", "false"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "<null>", "false"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "<null>", "false"}, false, 13, new String[][]{}), new String[][]{{"getOptionObject", "char", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<null>", "true"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:0>"}}), new String[][]{{"remove", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"t7ue", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "a", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"010", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:3>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 3), new String[][]{{"get", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:2>"}}, 2), new String[][]{{"getOptionObject", "char", "3"}, {"getOptionValue", "java.lang.String,java.lang.String", "2"}, {"getArgList", "", "5"}, {"descendingIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList$DescendingIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:2>"}}, 2), new String[][]{{"getOptionObject", "char", "3"}, {"getOptionValue", "java.lang.String,java.lang.String", "2"}, {"getArgList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:6>", "<sample:2>"}}, 2), new String[][]{{"getOptionObject", "char", "3"}, {"getOptionValue", "java.lang.String,java.lang.String", "2"}, {"getArgList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}), new String[][]{{"remove", "java.lang.Object", "1"}, {"addAll", "java.util.Collection", "2"}, {"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:1>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:1>", "true"}}, 3), new String[][]{{"getOptionValue", "char", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "<empty>", "false"}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<null>", "<sample:1>"}}, 2), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "<empty>", "false"}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "[1,2]", "<empty>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:0>", "false"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 2), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<null>", "<sample:3>", "<null>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"-0.0", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:2>", "<empty>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<empty>", "true"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<null>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, false, 0, null, 3), new String[][]{{"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:10>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:10>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:8>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<empty>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<empty>", "<sample:1>"}}, 3), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:3>", "<null>"}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "a b", "<empty>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:0>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<empty>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "getOptions", ""}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 2), new String[][]{{"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:8>", "<sample:0>", "<sample:3>", "false"}}, 1), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<null>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<empty>", "<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:4>", "<sample:0>", "true"}}, 3), new String[][]{{"containsAll", "java.util.Collection", "7"}, {"clear", "", "3"}, {"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "true"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<null>"}}, 2), new String[][]{{"getArgList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "true"}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<sample:6>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "Missing required option", "<sample:3>"}}, 1), new String[][]{{"getArgList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:10>", "<empty>"}, false, 14, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<empty>", "<sample:4>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:10>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<null>"}}, 1), new String[][]{{"getOptionValue", "java.lang.String", "0"}, {"getOptionValue", "char,java.lang.String", "6"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:2>", "<sample:6>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<empty>", "false"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<empty>"}}, 3), new String[][]{{"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:1>"}}, 1), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:6>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:0>"}}, 2), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "false"}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:3>", "<null>", "false"}}, 3), new String[][]{{"getArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "true"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "true"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "false"}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:2>", "<sample:6>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<null>"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "2020-02-30T25:61:61", "<empty>"}}, 3), new String[][]{{"getArgList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<empty>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:1>", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<null>", "<sample:0>", "<sample:6>"}}, 2), new String[][]{{"getOptionValues", "char", "6"}, {"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:2>", "<null>"}, false, 15, new String[][]{}, 2), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:6>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<null>", "false"}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:3>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "<empty>", "true"}, false, 5, new String[][]{}, 3), new String[][]{{"getArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<sample:2>"}}, 3), new String[][]{{"getOptionValues", "char", "2"}, {"getOptionObject", "java.lang.String", "5"}, {"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:0>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:3>", "<null>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:1>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:0>"}}), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "6"}, {"getOptionGroup", "org.apache.commons.cli.Option", "5"}, {"getOptions", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: 0  [ARG] ::  ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}}, 1), new String[][]{{"getOption", "java.lang.String", "2"}, {"hasOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<null>", "true"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 1), new String[][]{{"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:2>", "<sample:2>", "false"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "1.12345678901234567", "<null>"}}, 3), new String[][]{{"getOptionValue", "java.lang.String", "2"}, {"getOptionValue", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "<empty>", "true"}, false, 11, new String[][]{}, 2), new String[][]{{"hasOption", "java.lang.String", "3"}, {"getOptionObject", "java.lang.String", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:2>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:2>", "<empty>", "true"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<null>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:3>", "true"}}, 1), new String[][]{{"getOptionValue", "char", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:4>", "<empty>"}, false, 3, new String[][]{}, 1), new String[][]{{"getOptionObject", "java.lang.String", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<empty>", "<empty>"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:2>", "true"}}, 1), new String[][]{{"getOptionObject", "char", "4"}, {"getArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:2>", "<empty>"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:2>", "true"}}, 1), new String[][]{{"getOptionObject", "char", "4"}, {"getArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:4>", "<empty>"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:1>", "true"}}, 1), new String[][]{{"getOptionObject", "char", "4"}, {"getArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"t", "<sample:1>"}, false, 8, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<empty>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:3>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<empty>", "<empty>"}, false, 0, null, 3), new String[][]{{"getOptionValue", "char", "6"}, {"getOptionValues", "java.lang.String", "4"}, {"getOptionValues", "char", "0"}});
  assertNull(actual);
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<null>"}, {"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "I", "<sample:3>"}}, 2), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:1>"}}, 3), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:1>"}}, 3), new String[][]{{"removeAll", "java.util.Collection", "5"}, {"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:1>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:1>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "+1", "<sample:0>"}}, 3), new String[][]{{"getOptionValue", "char", "0"}, {"hasOption", "char", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:0>", "true"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:0>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "Missing required option", "<empty>"}}, 3), new String[][]{{"getOption", "java.lang.String", "7"}, {"addOption", "org.apache.commons.cli.Option", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:0>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:3>", "<sample:3>", "false"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "12:30:45", "<empty>"}}, 2), new String[][]{{"getArgList", "", "7"}, {"removeFirst", "", "5"}, {"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "<empty>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:3>", "<sample:3>", "true"}}, 1), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:4>", "<sample:2>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<null>", "<null>"}}, 3), new String[][]{{"getOptionValue", "java.lang.String", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "<null>", "false"}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "<null>", "false"}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<empty>"}}, 3), new String[][]{{"getArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:2>", "true"}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:0>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:5>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:0>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:0>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:1>", "<sample:0>"}}), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "7"}, {"getOptions", "", "6"}, {"contains", "java.lang.Object", "3"}, {"remove", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:1>", "<sample:0>"}}, 2), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "7"}, {"getOptions", "", "6"}, {"contains", "java.lang.Object", "3"}, {"remove", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:1>", "<sample:0>"}}, 2), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "7"}, {"hasOption", "java.lang.String", "6"}, {"getRequiredOptions", "", "3"}, {"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<empty>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:2>", "false"}}), new String[][]{{"getRequiredOptions", "", "7"}, {"addAll", "java.util.Collection", "6"}, {"listIterator", "", "3"}, {"nextIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:0>", "<null>"}, false, 5, new String[][]{}, 2), new String[][]{{"getOptionObject", "java.lang.String", "5"}, {"getArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:1>", "<null>", "false"}}, 3), new String[][]{{"getOptions", "", "0"}, {"removeAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:6>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:2>", "false"}}, 2), new String[][]{{"getRequiredOptions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:1>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 3), new String[][]{{"hasOption", "char", "2"}, {"getOptionObject", "char", "4"}, {"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 3), new String[][]{{"hasOption", "char", "2"}, {"getOptionObject", "char", "4"}, {"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "<empty>", "true"}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:0>", "<sample:6>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:0>", "<sample:2>"}}, 3), new String[][]{{"getOptionObject", "java.lang.String", "2"}, {"iterator", "", "0"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:0>"}}, 1), new String[][]{{"getOptions", "", "4"}, {"contains", "java.lang.Object", "5"}, {"removeAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:7>", "true"}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:2>", "<empty>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:3>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:3>", "<sample:6>", "false"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:7>", "true"}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:1>", "<empty>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:3>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:3>", "<sample:6>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:5>", "false"}, false, 13, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:1>", "<sample:0>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:2>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:3>", "<sample:6>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "a", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<empty>", "<sample:9>", "true"}}, 2), new String[][]{{"get", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:1>", "<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<null>", "<empty>", "false"}, false, 2, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:0>"}}, 1), new String[][]{{"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "<null>", "<null>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:0>", "false"}}, 2), new String[][]{{"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "<null>", "<null>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:0>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:0>", "false"}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "false"}}, 1), new String[][]{{"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:9>", "<empty>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<empty>", "<empty>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:3>", "false"}}, 3), new String[][]{{"hasOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:4>"}}, 1), new String[][]{{"indexOf", "java.lang.Object", "5"}, {"clone", "", "1"}, {"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:4>"}}, 1), new String[][]{{"indexOf", "java.lang.Object", "5"}, {"clone", "", "1"}, {"listIterator", "", "1"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:9>", "<sample:3>"}}, 3), new String[][]{{"indexOf", "java.lang.Object", "3"}, {"clone", "", "1"}, {"listIterator", "", "1"}, {"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "<empty>", "true"}, false, 1, new String[][]{}, 1), new String[][]{{"getOptionValue", "char", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:8>", "<null>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:6>", "<empty>"}, {"org.apache.commons.cli.Parser", "getOptions", ""}}, 3), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "4"}, {"getOptions", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:2>"}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}}, 1), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:6>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<null>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:2>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:2>", "<sample:6>", "true"}}, 1), new String[][]{{"iterator", "", "7"}, {"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:4>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"b", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:2>", "<sample:2>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:5>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:3>", "<null>", "false"}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "getRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:2>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "-1.5", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:8>", "<sample:11>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"+10x123456789", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<empty>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:3>", "<sample:0>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<sample:11>"}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:3>", "true"}});
  assertNull(actual);
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<sample:11>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:1>"}, {"org.apache.commons.cli.Parser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:0>", "false"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:1>", "<sample:11>"}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "processOption", "java.lang.String,java.util.ListIterator", "Misssing required option0x1F", "<sample:0>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<null>", "<null>", "false"}, false, 0, null, 1), new String[][]{{"getArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:2>", "false"}}, 2), new String[][]{{"getOption", "java.lang.String", "1"}, {"getDescription", "", "1"}, {"hasOptionalArg", "", "4"}, {"setType", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: a  [ARG] :: null :: 1 ] {getArgName=arg, getArgs=1, getDescription=null, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=true...#299#-560375091", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "getRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}, 3), new String[][]{{"hasOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}}, 2), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:6>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<sample:5>"}, {"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}}, 2), new String[][]{{"iterator", "", "2"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:11>"}, false, 1, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<empty>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<empty>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:2>", "true"}}, 1), new String[][]{{"getRequiredOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:3>", "<null>", "false"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:3>", "<sample:3>", "true"}}, 3), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "2"}, {"getRequiredOptions", "", "2"}, {"contains", "java.lang.Object", "3"}, {"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.Parser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}, 1), new String[][]{{"addOption", "org.apache.commons.cli.Option", "7"}, {"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option:   [ARG] :: 0 ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:2>", "<sample:3>"}, {"org.apache.commons.cli.Parser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:6>", "<sample:11>"}}, 3), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "0"}, {"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "getOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<null>"}}, 3), new String[][]{{"getRequiredOptions", "", "7"}, {"add", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Parser", "org.apache.commons.cli.BasicParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.cli.Parser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.Parser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
}
