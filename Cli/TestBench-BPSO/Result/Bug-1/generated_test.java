package generated.algorithm;

import junit.framework.TestCase;

public class BinaryParticleSwarmGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"char"}, new String[]{"C"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", ",", "1rf0"}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "=a>b</a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"-", "1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"]"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.5e00"}, {"org.apache.commons.cli.CommandLine", "getArgList", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.5e00], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"\t"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "+1x"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"1.12345=78"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"t", "a"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "\t"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"4."}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "0x0F", "1.1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[4.], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"u\u00e9"}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "TITLE1.+1234567890123456", "PT"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"P"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "a", "\n+"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"=", "!"}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "l"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"D020-01-01"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "/a/b"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[D020-01-01], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[\t], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "\r", "TIaLE"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{":"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "12:30:451rf10"}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "char", "C"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"!"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "e"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{" ", "1\u00eaL"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "t", "1.5d1.12345678901234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1\u00eaL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"A", "nu\"ll"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nu\"ll", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"f"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "char", " "}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"0.12345678"}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "char", ","}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[0.12345678], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"/a-b"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", ".1.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"b"}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "TITLE-10x1F[1,2]", "-0.F0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "iterator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0  :: sample ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"@"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "-1.5e300/a/b"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[-1.5e300/a/b], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"\001"}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "0xFFFFFFF", "1rrf10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", ","}}, 2), new String[][]{{"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"PP"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "C"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"\uffff", "/1rf10"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "1.12345688901234567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1rf10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"A", "0x1244567899"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1244567899", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"1.12346708"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"char"}, new String[]{"\ufffd"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "  1.5d"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"m", ",12020-02-30T25:61:61"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",12020-02-30T25:61:61", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"1rf1W0"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.cli.CommandLine", "hasOption", "char", "P"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1rf1W0], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"08n-5"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "a"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"A"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "<a>b</a>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "1.12345678901234567", ".5abc"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{";"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "1/25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"5"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "0"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"2L"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "123456789012345678901234567890"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"T", "1.5f"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "3"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "hasOption", "char", "5"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"P", "z#a\":1}"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("z#a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"1e10a b"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "]"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "c"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[c], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"5", "1E,5i"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "Hello, Woqld"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E,5i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"F", "0xFFFFFFFFb"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFFb", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"1.12345678901234556-0.0"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"}", "1f10"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1f10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"addFirst", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=!ArrayStoreException, getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" ", "{\"a\"W1}"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\"W1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.12345678901234567"}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[1.12345678901234567], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"Q", "-1"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "a"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"X", "[1,2^"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "T", "1.5f"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2^", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"+", "2020-01-01"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "0x1ED"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[0x1ED], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"1X.25"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1X.25], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"[1o,2]"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "2020-0F1-01abc"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[2020-0F1-01abc], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"B", "PT10H"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "i"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "char", "i"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "PT1hH"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"c", "Title"}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"D", "12:30:45"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "1.12345f7890123456"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:10>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "x", "6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "<", "1.25"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"."}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "-1i5"}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "h"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgList", ""}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1/5"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[1/5], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"B", "-1"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"\000", "1rf10"}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "n"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1rf10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "P"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"P", "1L"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"t"}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"5"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "TITLE-10x1F"}, {"org.apache.commons.cli.CommandLine", "iterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "--1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[--1], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "A"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "m"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"}", "--2"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"Title-1"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[Title-1], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"1.123445670"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "null\n"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.123445670], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"B", ""}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "\u00e9/a/b"}}), new String[][]{{"addAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"=", "`"}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[\n], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option: 0 +ARG ::  ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"010Title"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[010Title], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{":", "1.5e300a b1e10"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300a b1e10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"F", "[1,2]"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"TITLE-10x1F "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[TITLE-10x1F ], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{".0.01E-5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[.0.01E-5], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"1.13345678"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.5f--1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.5f--1], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "N"}}), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"18n-5"}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"D", "1.1b<234567890123456"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "\n\n", "12::30:45"}, {"org.apache.commons.cli.CommandLine", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1b<234567890123456", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLE{\"a\":1}", "1.12345678901234567"}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"\r"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "/a/c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[/a/c], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"P", "nlk"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nlk", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"1E-\nabc"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "bn"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[bn], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "1.5e30012:30:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0  :: sample ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"2", "[ "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"-0.6"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "01123456789"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[01123456789], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<null>"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"R"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"X"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option: \000  :: null ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}}), new String[][]{{"addFirst", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=!ArrayStoreException, getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"21474836748"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "[1,2]-1http://example.com/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"ulk"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"=", "1.1234567890123/567"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "-1.50"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123/567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5", "15"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"char"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nukl", "a,b,c2147483648-0.0"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c2147483648-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 0 +ARG ::  ] {getArgName=arg, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=true, hasArgs=false...#284#-75941649", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"B", "5.-0.0"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgList", ""}}), new String[][]{{"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"a,b,c20D0-01-01"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgList", ""}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.5d0x1F"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.5d0x1F], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"o"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"}", "0108"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1/51.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0108", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[1/51.5], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"]bc", "PTIH1L"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PTIH1L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"\r", "1e1/0"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "r.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e1/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[r.25], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"\\"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "18n-51.5e300"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "/a/b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[/a/b], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "+Ap1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[+Ap1], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: a  :: 0 ] {getArgName=arg, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasArgs=false...#284#-330478972", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.5", "1e101.12W345678"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e101.12W345678", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{">"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"A"}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "n2ull:", "123456789012345678901234567890TITLE-10x1F"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.5e300u"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.5e300u], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"00xFFFFFFFF", "2020-01-01"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "d"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "2020-02-30T25:61:61TITLE"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[2020-02-30T25:61:61TITLE]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[2020-02-30T25:61:61TITLE], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"2020-0101TITLE-10x1F"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\n"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "{\"aa\":1}"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[{\"aa\":1}], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1234567890123456 8901234567890", "http://example.com/a?b=c"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "12345678901234567890123456789/"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"3"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "0/5P"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[0/5P], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.5\t\u00e9", "-1"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"w"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "2020-/1-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[2020-/1-01], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option: 0 sample  :: a ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"/"}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "6"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "[1,2]0", "5."}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\000"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  a  :: sample ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"B"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"?"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "o"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false), new String[][]{{"push", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=!ArrayStoreException, getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"TITLE5."}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"2/20-01-01"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "-0..0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[-0..0], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "bc"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[bc], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "UITLE"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option: 0 sample  :: a ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[UITLE], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a/bI", "W.5d"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("W.5d", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"C", "1.5<d"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "a bTITLE"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5<d", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[a bTITLE], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"\013"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "5", "123456789012345678901234567890"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"o"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1K"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1K], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"descendingIterator", "", "6"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"5-"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"J", "21474836480xFFFFFFFF"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21474836480xFFFFFFFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{" ", "*1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "{\"a\":1}"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[{\"a\":1}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[{\"a\":1}], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1020-02-30T25:1:61"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[1020-02-30T25:1:61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[1020-02-30T25:1:61], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"m"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "`,b,"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[`,b,], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgList", ""}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "TITLE"}}), new String[][]{{"descendingIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList$DescendingIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "\""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ], [ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"char"}, new String[]{"B"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"1/"}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.5e00"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "-11"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.5e00], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"\001", "5.1.1234567890123456"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "char", "P"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.1.1234567890123456", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"1.225"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"8", ".5+1"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "C"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5+1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"urue"}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "11E-{5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[11E-{5], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"2", "<a"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "\n\n7"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}}), new String[][]{{"peekFirst", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"1..5f"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "P"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:9>"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "5.1.25", "5?"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0  :: sample ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "123456789012346789012345678990"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[123456789012346789012345678990]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[123456789012346789012345678990], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"P"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", ","}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"n", "1.5i"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\u00c9"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "-0-0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[-0-0], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1230:45"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[1230:45]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[1230:45], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"18-5"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[18-5], getOptions=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "PX1H"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[PX1H]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[PX1H], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"f"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{" "}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{";"}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"<", "TITLE-10x1F"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "{\"`\":1}"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE-10x1F", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[{\"`\":1}], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"-"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"C", "1.12345671.5d"}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345671.5d", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{",", "1.5"}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"?", "0x1F"}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"III"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[III], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"char"}, new String[]{"E"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"2147483648a"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "0x1[23456789"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[0x1[23456789], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"[", "-1.H"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "char", "1"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.H", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option: \000  :: null ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "0"}}, 1), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{";"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "abcc"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[abcc], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"-1.51E-5"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "PT1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[PT1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[PT1], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "0"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "-1"}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "0xFFFFFFFF"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[0xFFFFFFFF], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"_2147483648"}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "-0.0", "nul"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[_2147483648], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "J"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"-"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"0", "TITLE-10xx1F"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE-10xx1F", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/amb1.12345678", "TITLEtrue"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "0ix123456789"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "12:30:45", "1/50"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLEtrue", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[0ix123456789], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[5], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"char"}, new String[]{"="}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.12345678901234567"}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.12345678901234567], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\ufffd"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "PT1G"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[PT1G]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[PT1G], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "I"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "TITLE-10x1F0xFFFFFFFF"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[TITLE-10x1F0xFFFFFFFF]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[TITLE-10x1F0xFFFFFFFF], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "1.12344567", "1.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[12:30:45], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"1rf"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "_.5d"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "-/.00x123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[_.5d], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[0], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H", "I"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "<a>b=/a>"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[<a>b=/a>, 0x1F], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"1234567890123456789012345667890"}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "f"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "0/x1F:"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[0/x1F:], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.5e400"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[1.5e400]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[1.5e400], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"7", "18{n-5"}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "\001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("18{n-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaai"}, {"org.apache.commons.cli.CommandLine", "getArgList", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[aaaaaaaaaaaaaaaaaaaaaaaaaaaaaai]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[aaaaaaaaaaaaaaaaaaaaaaaaaaaaaai], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"char"}, new String[]{" "}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"="}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"1.1234567890123457"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"0Title"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "-"}, {"org.apache.commons.cli.CommandLine", "getArgList", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[-], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"11"}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "0x1123456789"}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "0w1F"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0x1123456789]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[0x1123456789], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"-"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[-], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12245678901233567", "1.12345678901234567[1,2]"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "PT1H/a/b"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567[1,2]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "]", "Hello, orld.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"5"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "1E-"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"_"}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "u"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"d.5"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "1.5e300"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[d.5], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}}, 3), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "5.2020-0-01"}, {"org.apache.commons.cli.CommandLine", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[5.2020-0-01], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"1.12345678801234567"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "1"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[-0.0], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgList", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"B"}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"+11"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", ";-", "c"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "0mx123456789"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[0mx123456789], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option:  +ARG :: 0 ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>", "1,.5d.5"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1,.5d.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"a"}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"+"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"A"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "5"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "{\"a\":1}"}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[{\"a\":1}], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"B"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "2020-02-30T25:61:61"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[2020-02-30T25:61:61], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"c", "-0.0"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "1"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:9>"}}, 3), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0  :: sample ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"5"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "-1.5I"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[-1.5I], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.25], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1r10", "-1.5"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.\tf"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[1.\tf], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:8>"}}, 1), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: \000  :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasArgs=...#289#483207378", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "char", "f"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--1", "4"}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.6", "\tTITLE"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "5", "I"}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "2030-01-01"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\tTITLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"C"}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1L", "TITLE1E-5"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "char", ";"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE1E-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"0x1"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"15d"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "F"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "rue"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1/1234567890123456"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1/1234567890123456], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"\000"}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}, {"org.apache.commons.cli.CommandLine", "hasOption", "char", "h"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
}
