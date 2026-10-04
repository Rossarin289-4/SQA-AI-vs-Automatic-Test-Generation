package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{" ", "1.5e300"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "A"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"0C.m51L"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "char", "\000"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "\uffff"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"<"}, false, 12, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "PT1H"}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[PT1H], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "0", "TITLE"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[\t], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\uffff"}}, 1), new String[][]{{"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "1E-5", "PT1H"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "\000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "a"}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.1234567890123456], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"1.12345>67890123456"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "a"}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.12345>67890123456], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"1.12345>67890123456"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "a"}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.12345>67890123456], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"1.12345>67890123456"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "a"}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.12345>67890123456], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"1.12345>67>890123456"}, false, 13, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "a"}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.12345>67>890123456], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"1.12345>67>880123456"}, false, 13, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "a"}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.12345>67>880123456], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"[1,2]\tn0xFFFFF"}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "2020-01-01"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "http://example.com/a?b=c"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[2020-01-01, http://example.com/a?b=c], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"[1,2]\tn0xFFFFF"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "2020-01-01"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[2020-01-01], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"[1,2]\tn0xFFFFF"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"[1,2]\tn0xxFFFFF"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.CommandLine", "iterator", ""}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "1E-5", "{\"`\":1}"}}, 1), new String[][]{{"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "null"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[null], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "null"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[null], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "1.12345>678901234561e10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "1.12345>678901234561e10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "2147"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "2147"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "0"}, {"org.apache.commons.cli.CommandLine", "iterator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "char", "a"}, {"org.apache.commons.cli.CommandLine", "getOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option: 0 +ARG ::  ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}, {"org.apache.commons.cli.CommandLine", "getOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option:   :: a ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "iterator", ""}}, 2), new String[][]{{"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "iterator", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 2), new String[][]{{"next", "", "2"}, {"getValueSeparator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "iterator", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 2), new String[][]{{"next", "", "2"}, {"getValueSeparator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"char"}, new String[]{"a"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147483648", "{\"a\":1}"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147483648", "null"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2247483648", "nBll"}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nBll", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2247483648", "nBll1"}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nBll1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2247483648", "nBll1<a>b</a>"}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nBll1<a>b</a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2247482648", "nBll1<a>b</a"}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nBll1<a>b</a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2247482648", "nBll2<a>b</a"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nBll2<a>b</a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "Tiele"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0y123456789", "1LTitle"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1LTitle", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"2\r20-02-3T225:62020-01-02{\"a\":1}"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"x", "http://exam le.com0a?b=c"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://exam le.com0a?b=c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"8", "http://exam\037le.com0a?b=c"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://exam\037le.com0a?b=c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"8", "http://"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{":", "1.5d"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{":", "1.55d"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.55d", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{":", "<null>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{":", "1.1234567"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{":", "1.[1234567"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.[1234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgList", ""}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "\uffff"}}, 2), new String[][]{{"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"e"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "1e10"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "\uffff"}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "char", "B"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 11, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "a"}, {"org.apache.commons.cli.CommandLine", "hasOption", "char", "/"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "\uffff", "1L"}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "`-b,<a>b</a>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option: sample  +ARG :: 0 ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option: 0 sample  :: a ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option: \000  :: null ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option:  +ARG :: 0 ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"\u00e9huttp://example.com/a?b=c"}, false, 13, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "\t", "1.12345>67890123456"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"1"}, false, 13, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "1E-5", "2020-01-01"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "a,b,c", "2147483648"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"?"}, false, 14, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"1E6"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgList", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5.", "1.5d"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "a", "+1"}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5.", "1.5{"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "p"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5{", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Tit\tle", "2d5{1L"}, false, 12, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2d5{1L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Tit\tle", "5."}, false, 14, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5", "TITF"}, false, 14, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ], [ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5", "TITT"}, false, 14, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ], [ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaFc", "1.1234567"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "0"}, {"org.apache.commons.cli.CommandLine", "getArgList", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[http://example.com/a?b=c], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2), new String[][]{{"offerFirst", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[key], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "char", "."}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"-5fa`aaCaaaabaaa"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"c-0.0true"}, false, 16, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "0", "1.1234567890123456"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[\t], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "0", "1.1234567890123456"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "1.5f"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[<a>b</a>], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "0", "1.1234567890123456"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\uffff"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\uffff"}}), new String[][]{{"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "char", " "}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "char", " "}}), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"1.1234678\u00e9-1"}, false, 11, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "0xFFFFFFFF"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.1234678\u00e9-1], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"1.1234678\u00e9-1-0.0"}, false, 11, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "0xFFFFFFFF"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.1234678\u00e9-1-0.0], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{" "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "a"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"[1,2]\tn0xFFFFFFFF"}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "2020-01-01"}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[2020-01-01], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"[1,2]\tn0xFFFFFFFF"}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "2020-01-01"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "http://example.com/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[2020-01-01, http://example.com/a?b=c], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"[1,2]\tn0xFFFFF"}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "2020-01-01"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "http://example.com/a?b=c"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[2020-01-01, http://example.com/a?b=c], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"\uffff"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{" ", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"\037", "1.5e300"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", " "}, {"org.apache.commons.cli.CommandLine", "hasOption", "char", "A"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[ ], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"\000", "1.5e300null"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300null", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"\000", "1.5e300nu\nll"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300nu\nll", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"\000", "1.5e3/0nu\nll"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e3/0nu\nll", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"\000", "2.5e3/0nu\nll1.5d"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2.5e3/0nu\nll1.5d", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"1..2p6"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", " "}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[ ], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"151.123356:8911234567PT1H"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", " "}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "null"}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[null], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "null"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[null], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "1.12345>678901234561e10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "iterator", ""}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1", "a b"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", " "}, {"org.apache.commons.cli.CommandLine", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1abc", "a}b"}, false, 10, new String[][]{{"org.apache.commons.cli.CommandLine", "iterator", ""}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "char", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a}b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1`abc1.de300", "4a}b"}, false, 10, new String[][]{{"org.apache.commons.cli.CommandLine", "iterator", ""}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "char", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4a}b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1`abc1.de300", "4a}xb"}, false, 10, new String[][]{{"org.apache.commons.cli.CommandLine", "iterator", ""}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "char", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4a}xb", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1`abc1.de3700", "\u00e9"}, false, 10, new String[][]{{"org.apache.commons.cli.CommandLine", "iterator", ""}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "char", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1`abc1.de3700", "\u00e8"}, false, 10, new String[][]{{"org.apache.commons.cli.CommandLine", "iterator", ""}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.CommandLine", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option: sample  +ARG :: 0 ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}, {"org.apache.commons.cli.CommandLine", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option: 0 +ARG ::  ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "iterator", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}), new String[][]{{"next", "", "2"}, {"getValueSeparator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"\000", "[1,2]\tn0xFFFFF"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.25"}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]\tn0xFFFFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[1.25], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"\000", "[1,2]\tn0xF"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.25"}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]\tn0xF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[1.25], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{" ", "[1-2]\tn0wF"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1."}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1-2]\tn0wF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[1.], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"\r"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"G"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147483648", "{\"a\":1}"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "\uffff"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}, {"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "\n"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "\000"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}, {"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "\n"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "Title"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "Title"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "Title"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "1L"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "0x123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[PT1H], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{" ", "1.25"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "a"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[{\"a\":1}], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option:  +ARG :: 0 ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option: \000  :: null ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "getArgList", ""}}), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"PT1H1.12345I78901234567"}, false, 12, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "\t", "1.12345>67890123456"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 12, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "\t", "1.12345>67890123456"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{">"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "char", "\u00e9"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5o", "2.5{"}, false, 11, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2.5{", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5o", "2.5{"}, false, 11, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2.5{", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5", "TITT"}, false, 14, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "char", "."}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option:   :: a ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"c-0.0true"}, false, 16, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{":", "1"}, false, 10, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "13:31:45", "o"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "*", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{":", "t1}"}, false, 10, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "13:31:45", "o"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "*", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.CommandLine", "getArgList", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.CommandLine", "getArgList", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.CommandLine", "getArgList", ""}}, 1), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 0 sample  :: a ] {getArgName=arg, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasA...#292#-12176836", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.CommandLine", "getArgList", ""}}), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 0 sample  :: a ] {getArgName=arg, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasA...#292#-12176836", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"addAll", "int,java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"W", "\t2147483648"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"W", "\t224748"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t224748", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"W", "\t2>4748"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t2>4748", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"W", "\t24748"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t24748", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"\000", "i"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgList", ""}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"m", "i\u00e9"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i\u00e9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"char"}, new String[]{"8"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "{\"a\":1}", "a b"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"char"}, new String[]{"8"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "\uffff"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "{\"a\":1}", "a b"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"char"}, new String[]{"\000"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "\uffff"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "{\"a\":1}", "a b"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.12345>67890123456"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[1.12345>67890123456], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.12345>67890123456"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[1.12345>67890123456], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.12345>678901234560x123456789"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[1.12345>678901234560x123456789], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--1", "1e10"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--p1", "1e10"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--p1", "e10"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("e10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 +ARG ::  ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.CommandLine", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"a"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgList", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "--1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[--1], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "2020-02-30T25:61:61"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[2020-02-30T25:61:61], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}}, 3), new String[][]{{"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "getOptions", ""}}, 3), new String[][]{{"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false), new String[][]{{"getLast", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgList", ""}}, 3), new String[][]{{"getLast", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "iterator", ""}, {"org.apache.commons.cli.CommandLine", "getArgList", ""}}, 3), new String[][]{{"contains", "java.lang.Object", "6"}, {"pollFirst", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"1."}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "char", "a"}}, 3), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 0 sample  :: a ] {getArgName=arg, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasA...#292#-12176836", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "getOptions", ""}}, 3), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: \000  :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasArgs=...#289#483207378", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "getOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "\000"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"2020-01-0"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "char", "\uffff"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", " ", "1e10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\uffff"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ], [ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"]", "--0f.0"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--0f.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[--1], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String"}, new String[]{"a0c,c"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", " "}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1L"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "I", "a,b,c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1L], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "PT1H"}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "[61,2]"}, {"org.apache.commons.cli.CommandLine", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[PT1H]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[PT1H], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "\n"}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "[61,2]"}, {"org.apache.commons.cli.CommandLine", "iterator", ""}}), new String[][]{{"offerFirst", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "\n"}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "[61,2]1.25"}, {"org.apache.commons.cli.CommandLine", "iterator", ""}}, 2), new String[][]{{"element", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"char"}, new String[]{"="}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "I"}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "char", "a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{" ", ",1"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "0"}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "o"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{" ", ",,1"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "0"}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "o"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",,1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"a"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"e"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"e"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "123456789012345678901234567890"}, {"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "\t"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"\uffff"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "true"}, {"org.apache.commons.cli.CommandLine", "getArgList", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[true], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"\uffff"}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "true"}, {"org.apache.commons.cli.CommandLine", "getArgList", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[true], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "2020-02h-30T25:61:61"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "12:30:45"}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "2020-02h-30T25:61:61"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[12:30:45], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "2020-02h-30T35:61:61"}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "-1"}, {"org.apache.commons.cli.CommandLine", "getArgs", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[-1], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{";"}, false, 8, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "_"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[_], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"i", "htt[p://exal2le.com/a?lb=c"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("htt[p://exal2le.com/a?lb=c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[0], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", " ", "0x123456789"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "\uffff", "true"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"*?x11"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", " ", "0x123456789"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "\uffff", "true"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"*?x11"}, false, 10, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "\uffff", "true"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"V", "."}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "21485833648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[21485833648], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"V", "."}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "21495833648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[21495833648], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"V", "."}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "a"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "21494833648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[21494833648], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"V", "."}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "<null>"}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "a"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "21494833648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[null, 21494833648], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"=", "2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "<null>"}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\uffff"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "21494833648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[null, 21494833648], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false), new String[][]{{"retainAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false), new String[][]{{"retainAll", "java.util.Collection", "3"}, {"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char,java.lang.String", "0", "123456789012345678901234567890"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".", "1L1.123456789\t0123456"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgList", ""}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "char", "\000"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L1.123456789\t0123456", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".55", "1.12345678902234567"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678902234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[0x1F], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234568\t", "abc-1"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "010"}, {"org.apache.commons.cli.CommandLine", "getOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"char"}, new String[]{"|"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"char"}, new String[]{"}"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValues", "char", "a"}}, 2), new String[][]{{"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}, {"org.apache.commons.cli.CommandLine", "getArgList", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"\uffff"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "/a/b"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "/"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"a", "2020-02-30T25:61:61"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false), new String[][]{{"peek", "", "4"}, {"addAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[sample], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "a"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: a  :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "a"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.5f"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.5f], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "a", "1L"}}, 2), new String[][]{{"hasNext", "", "4"}, {"hasNext", "", "3"}, {"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgList", ""}}, 1), new String[][]{{"hasNext", "", "4"}, {"hasNext", "", "3"}, {"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "TIT"}}), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[TIT], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "TIrT"}}), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[TIrT], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "<null>"}}), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[null], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "0xFFFFFFFF"}}), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[0xFFFFFFFF], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"H", "1.123I456abc"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "\uffff"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123I456abc", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ], [ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\000"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\000"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgs", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionObject", "char", "\000"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "0"}, {"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[0], getOptions=[[ option: \000  :: null ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "Title"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "\t"}}), new String[][]{{"offer", "java.lang.Object", "3"}, {"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=!ArrayStoreException, getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "\t", "0x1F"}, {"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "Title"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "\t"}}, 1), new String[][]{{"offer", "java.lang.Object", "3"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[\t, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=!ArrayStoreException, getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "\t", "0x1F"}, {"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "Title"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "\ta,b,c"}}, 1), new String[][]{{"offer", "java.lang.Object", "3"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[\ta,b,c, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=!ArrayStoreException, getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String,java.lang.String", "\t", "0x1F"}, {"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "Title"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "\ta,b,c"}}, 1), new String[][]{{"offer", "java.lang.Object", "3"}, {"clone", "", "0"}, {"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=!ArrayStoreException, getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "hasOption", new String[]{"char"}, new String[]{"\uffff"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"removeFirst", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[0], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"\n0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[\n0], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{"/"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[/], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"+"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "X"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "0x123456789"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[0x123456789], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"-"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "W"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[0], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[-1], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgList", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{"0"}, false, 15, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.5e300"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "<"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.5e300], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValues", new String[]{"java.lang.String"}, new String[]{">"}, false, 15, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.5e300"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "<"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.5e300], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.5e300"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.5e300], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 14, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1.5e100"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1.5e100], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "iterator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptions", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "-0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[[ option:   :: a ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"7"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "a"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", "2020-02-30T25:61:611.5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"m"}, false, 12, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "c"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"<"}, false, 12, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "PT1H"}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "c"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[PT1H], getOptions=[[ option: sample  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{";"}, false, 12, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "PT1H"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[PT1H], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"char"}, new String[]{"0"}, false, 12, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "P1H"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[P1H], getOptions=[[ option: 0 sample  :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"8"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "a b"}, {"org.apache.commons.cli.CommandLine", "getOptionObject", "java.lang.String", "a b"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", ".5"}}, 1), new String[][]{{"listIterator", "", "2"}, {"hasPrevious", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"<"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "<null>"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "a"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"<"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "<null>"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "\u00e9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[\u00e9], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"7"}, false, 7, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "java.lang.String", "PT1H"}, {"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "\u00e9"}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "-1.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[\u00e9], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"u"}, false, 14, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "\r"}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "-1.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[\r], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"u"}, false, 13, new String[][]{{"org.apache.commons.cli.CommandLine", "addArg", "java.lang.String", "1E-5"}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "-1.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[1E-5], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"."}, false, 13, new String[][]{{"org.apache.commons.cli.CommandLine", "getArgs", ""}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "-1.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char", "java.lang.String"}, new String[]{"\001", "Hello VorldTITLE"}, false, 6, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello VorldTITLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "addArg", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "hasOption", "char", "\uffff"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "6L"}, false, 11, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", ".0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "6M"}, false, 11, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", ".0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6M", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "6M0"}, false, 11, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "1"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", ".0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6M0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1.5e300"}, false, 11, new String[][]{{"org.apache.commons.cli.CommandLine", "getOptionValue", "char", "1"}, {"org.apache.commons.cli.CommandLine", "getOptionValue", "java.lang.String", ".0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getArgList", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"pollLast", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"char"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:   :: a ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionObject", new String[]{"java.lang.String"}, new String[]{"1.233667892123-f76\t10"}, false, 5, new String[][]{{"org.apache.commons.cli.CommandLine", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}, {"org.apache.commons.cli.CommandLine", "getOptionValues", "java.lang.String", "1.5f"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[[ option:  +ARG :: 0 ]]}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.CommandLine", "org.apache.commons.cli.CommandLine", "getOptionValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PXX1H", ""}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.receiverState());
 }
}
