package generated.algorithm;

import junit.framework.TestCase;

public class BinaryParticleSwarmGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "<sample:5>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"Title", "<empty>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:4>", "<empty>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:0>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:3>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "1.123567", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 public void testGeneratedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}, {"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:10>", "<sample:4>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "true"}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<empty>", "true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:8>", "<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:11>"}}, 3), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:3>", "<sample:3>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:2>", "false"}}), new String[][]{{"getOptionValue", "char", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:0>", "<sample:3>", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "true"}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<null>", "true"}});
  assertNull(actual);
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<null>", "<sample:3>"}}), new String[][]{{"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:3>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:9>", "<sample:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:1>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<null>", "<empty>", "<null>", "false"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<sample:2>", "false"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"1.1i34567890123356", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:1>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<empty>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:9>", "<null>", "false"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<empty>", "<sample:4>", "true"}});
  assertNull(actual);
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:5>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 1), new String[][]{{"getOptionValues", "char", "0"}, {"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:1>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:4>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:11>", "<empty>", "<sample:0>"}, {"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}, {"org.apache.commons.cli.GnuParser", "getOptions", ""}}, 2), new String[][]{{"addAll", "int,java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<null>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "<null>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "1m5e300", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:3>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:4>", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "<sample:0>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "<sample:0>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}, {"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:8>", "<sample:3>", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", ";a>b;/a>", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<empty>", "<empty>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:5>", "false"}}), new String[][]{{"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<sample:1>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<null>"}}), new String[][]{{"getOptionObject", "java.lang.String", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<sample:3>", "false"}, false, 4, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "0x1", "<sample:2>"}, {"org.apache.commons.cli.GnuParser", "getOptions", ""}}), new String[][]{{"getArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<empty>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}}, 1), new String[][]{{"getOptionValue", "java.lang.String", "0"}});
  assertNull(actual);
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<empty>", "false"}}), new String[][]{{"getArgList", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:4>", "false"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:4>", "<null>", "false"}, {"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:0>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:2>"}}), new String[][]{{"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:2>", "<sample:3>"}}, 2), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:4>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"_ile", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:2>"}}, 3), new String[][]{{"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "false"}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "true"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:3>", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:0>", "<sample:2>"}}, 3), new String[][]{{"getOptions", "", "1"}, {"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:1>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<empty>"}, {"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<null>", "false"}, false, 4, new String[][]{}, 3), new String[][]{{"getOptionValue", "char,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:1>", "<sample:4>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:5>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "true"}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:6>", "false"}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:1>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<empty>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}, {"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:1>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:9>", "<sample:6>", "<null>", "true"}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:4>", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<null>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, null, 3), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:10>", "<sample:1>", "<sample:2>", "true"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<sample:3>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:6>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}, {"org.apache.commons.cli.GnuParser", "getOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:8>", "<sample:2>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:6>", "true"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<empty>", "<null>", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:4>"}}, 1), new String[][]{{"hasOption", "char", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "true"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<empty>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "<empty>", "false"}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<null>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:2>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<null>", "<sample:6>", "false"}}), new String[][]{{"getOptionValue", "char,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "<null>", "true"}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "H1llo2 World", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "true"}, false, 1, new String[][]{}, 3), new String[][]{{"hasOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, false, 0, null, 1), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:0>"}}), new String[][]{{"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "true"}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:2>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:8>", "<null>", "<sample:3>"}}, 1), new String[][]{{"set", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<null>", "true"}}, 3), new String[][]{{"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "<empty>", "false"}, false, 3, new String[][]{}), new String[][]{{"getOptionValue", "char", "7"}, {"getOptionValues", "char", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:8>", "<sample:0>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}), new String[][]{{"getOptionValue", "char,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"2.1234567", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:3>"}, false, 3, new String[][]{}, 2), new String[][]{{"getArgList", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}}, 2), new String[][]{{"getOptionValues", "char", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:8>", "<sample:2>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:2>", "<empty>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:0>", "true"}}, 2), new String[][]{{"getOptionValues", "java.lang.String", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:0>", "true"}}, 3), new String[][]{{"getArgList", "", "2"}, {"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:5>", "<sample:5>"}}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "true"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:11>", "<null>", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}, {"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 1), new String[][]{{"hasOption", "char", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<empty>"}}), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<empty>", "<null>", "false"}, false), new String[][]{{"hasOption", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:9>", "<sample:1>", "<sample:3>"}}, 3), new String[][]{{"retainAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<null>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:8>", "<sample:4>"}, false), new String[][]{{"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"1.5e31/", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:0>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, null, 3), new String[][]{{"getOptionObject", "java.lang.String", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:2>"}}, 2), new String[][]{{"getOptionValues", "java.lang.String", "1"}, {"getArgList", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:3>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:2>"}, false, 3, new String[][]{}), new String[][]{{"getOptionValues", "char", "2"}, {"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:4>", "true"}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:4>", "<sample:0>"}}, 3), new String[][]{{"getOptionValues", "char", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:1>", "<null>"}, false), new String[][]{{"getOptionValues", "char", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:2>", "<sample:1>"}}), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "true", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:2>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:3>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, null, 3), new String[][]{{"getArgList", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:2>"}}, 1), new String[][]{{"size", "", "3"}, {"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:0>", "<empty>"}, false, 1, new String[][]{}), new String[][]{{"getOptionValue", "char", "2"}, {"getOptions", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:8>", "<sample:0>", "<null>"}, false), new String[][]{{"getOptionValue", "char,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<null>"}, false, 1, new String[][]{}, 2), new String[][]{{"getOptionValues", "char", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, null, 2), new String[][]{{"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"0x16F", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "true"}, false, 0, null, 2), new String[][]{{"getOptionValue", "char,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:2>", "<null>"}, false, 0, null, 1), new String[][]{{"getOptionValue", "char,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{".4", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:6>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<null>"}, false, 7, new String[][]{}, 3), new String[][]{{"hasOption", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:4>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:5>", "<empty>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:9>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<null>"}}, 1), new String[][]{{"getOptionObject", "java.lang.String", "6"}, {"getOptionObject", "java.lang.String", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "n5", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, null, 3), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:6>", "<empty>"}, false, 0, null, 2), new String[][]{{"hasOption", "char", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<empty>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:2>"}}, 2), new String[][]{{"getOptionValue", "char", "3"}, {"getOptionValue", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:2>"}}, 1), new String[][]{{"getArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:1>"}}, 3), new String[][]{{"hasOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:1>", "<null>"}}, 2), new String[][]{{"getOptions", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:1>", "<empty>"}, false), new String[][]{{"getArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<null>", "<sample:0>"}}, 2), new String[][]{{"getOptionValues", "java.lang.String", "6"}, {"hasOption", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<empty>"}, false, 0, null, 1), new String[][]{{"getArgList", "", "7"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:2>"}}, 2), new String[][]{{"hasOption", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<null>", "<sample:1>", "false"}}, 1), new String[][]{{"addOption", "org.apache.commons.cli.Option", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, null, 2), new String[][]{{"iterator", "", "0"}, {"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:3>"}}), new String[][]{{"getOptions", "", "5"}, {"retainAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:3>"}, false, 5, new String[][]{}, 1), new String[][]{{"hasOption", "char", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<null>", "<null>", "false"}, false, 0, null, 2), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:9>", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "<empty>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 1, new String[][]{}, 1), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:2>", "true"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "12345678901134567890123L567890", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:0>", "<null>"}, false, 0, null, 2), new String[][]{{"getArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "false"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:3>", "<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:1>", "<null>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<empty>", "<sample:4>", "true"}}), new String[][]{{"getRequiredOptions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:3>", "<null>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:3>", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:3>"}}, 2), new String[][]{{"getOptionValue", "java.lang.String", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:3>"}}), new String[][]{{"hasOption", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:0>", "<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:9>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:6>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}), new String[][]{{"hasOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:6>"}}, 1), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:2>"}, {"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:2>"}}), new String[][]{{"isEmpty", "", "1"}, {"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "<null>", "false"}, false, 1, new String[][]{}, 2), new String[][]{{"getOptionValues", "java.lang.String", "4"}, {"hasOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:2>", "<empty>"}, false, 0, null, 3), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<empty>", "false"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:3>", "<empty>"}, false, 0, null, 1), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:7>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:0>", "<null>"}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<sample:3>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:9>", "<sample:1>", "<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:1>", "<null>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "<null>", "true"}, false, 0, null, 3), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<null>", "true"}, false, 0, null, 2), new String[][]{{"getOptionValue", "char,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:4>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:2>", "<sample:1>", "true"}}, 2), new String[][]{{"ensureCapacity", "int", "5"}, {"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:2>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<empty>", "true"}, {"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 1), new String[][]{{"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:3>", "<empty>"}, false, 0, null, 3), new String[][]{{"getOptionValues", "java.lang.String", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:1>", "<sample:3>"}}, 2), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "2"}, {"getRequiredOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:0>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:3>", "false"}}, 3), new String[][]{{"getRequiredOptions", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "false"}}), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<null>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<empty>"}}, 2), new String[][]{{"getArgList", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:2>", "<empty>"}, false, 0, null, 1), new String[][]{{"getOptionObject", "java.lang.String", "4"}, {"getOptionValues", "java.lang.String", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<null>", "<empty>"}, false, 3, new String[][]{}, 3), new String[][]{{"getOptionValue", "char", "6"}, {"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<null>", "<sample:0>"}}, 2), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:1>", "<null>"}, false, 3, new String[][]{}, 1), new String[][]{{"getOptionValue", "char,java.lang.String", "3"}, {"getOptions", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:1>", "<empty>"}, false, 0, null, 2), new String[][]{{"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:9>", "<empty>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "<empty>", "true"}, false, 3, new String[][]{}, 1), new String[][]{{"getOptionObject", "java.lang.String", "0"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:4>", "false"}}, 2), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "7"}, {"getOptions", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "<empty>", "false"}, false, 0, null, 3), new String[][]{{"hasOption", "char", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:1>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:2>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:2>", "false"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:3>", "true"}}, 3), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<empty>", "<sample:5>"}}, 1), new String[][]{{"getRequiredOptions", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:8>", "<empty>", "false"}}, 2), new String[][]{{"getOptions", "", "5"}, {"addAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:9>", "<sample:1>", "<empty>", "false"}, false, 0, null, 1), new String[][]{{"getOptionValue", "char", "4"}, {"getArgList", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<empty>", "<sample:3>"}}, 2), new String[][]{{"addAll", "java.util.Collection", "4"}, {"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "<empty>", "false"}, false, 1, new String[][]{}, 1), new String[][]{{"getOptionValues", "char", "6"}, {"getArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:9>", "<sample:2>", "<sample:3>"}}, 3), new String[][]{{"getOptionValues", "char", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<empty>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:2>", "<sample:0>", "false"}}, 1), new String[][]{{"getOptionObject", "java.lang.String", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<empty>", "<empty>"}}, 2), new String[][]{{"getRequiredOptions", "", "6"}, {"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<sample:4>", "<sample:0>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:6>", "<null>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<null>", "<sample:2>", "<sample:5>"}}, 3), new String[][]{{"getArgList", "", "2"}, {"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:2>", "<null>"}}, 2), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "3"}, {"hasOption", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:2>", "<sample:3>", "true"}}, 1), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "", "<sample:1>"}, {"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}, 3), new String[][]{{"contains", "java.lang.Object", "4"}, {"remove", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "<empty>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:8>", "<sample:4>", "<empty>", "true"}, false, 1, new String[][]{}, 3), new String[][]{{"getArgList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<sample:3>"}}, 3), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<null>", "<sample:5>"}}, 1), new String[][]{{"getRequiredOptions", "", "1"}, {"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:1>", "false"}}, 3), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<null>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "[o,2]Title", "<sample:3>"}}, 3), new String[][]{{"getOptionValue", "char,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:9>", "<sample:2>", "<sample:1>", "false"}}, 1), new String[][]{{"add", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:0>", "false"}}, 2), new String[][]{{"listIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:2>", "<null>", "false"}}, 3), new String[][]{{"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:0>", "true"}}, 3), new String[][]{{"getRequiredOptions", "", "0"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<sample:4>"}}, 3), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:0>", "<sample:3>", "true"}}, 1), new String[][]{{"getOptions", "", "1"}, {"iterator", "", "7"}});
  assertNotNull(actual);
 }
 public void testGeneratedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:3>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<null>"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "3"}, {"listIterator", "int", "2"}, {"set", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}, 1), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
}
