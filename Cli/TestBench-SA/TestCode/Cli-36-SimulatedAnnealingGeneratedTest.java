package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:1>"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "0", "a,b,F"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "false", "-1"}}, 3), new String[][]{{"getOption", "java.lang.String", "6"}, {"hasValueSeparator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ], 0xFFFFFFFF=[ option: 0xFFFFFFFF  :: -1 :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java....#216#1579880910", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1L", "123456789012345678901234567890", "true", ", "}, false), new String[][]{{"getMatchingOptions", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[123456789012345678901234567890]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1L=[ option: 1L 123456789012345678901234567890  [ARG] :: ,  :: class java.lang.String ]} ] [ long {123456789012345678901234567890=[ option: 1L 123456789012345678901234567890  [ARG]...#237#-970669825", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "null"}, {"org.apache.commons.cli.Options", "getOption", "java.lang.String", "http://example.com/a?b=c"}}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "6"}, {"hasShortOption", "java.lang.String", "7"}, {"getOptions", "", "5"}, {"remove", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "-1"}, {"org.apache.commons.cli.Options", "getOption", "java.lang.String", "0"}, {"org.apache.commons.cli.Options", "getOptions", ""}}), new String[][]{{"getMatchingOptions", "java.lang.String", "3"}, {"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"123456789012345678901234567890", "", "false", "trud"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "http://example.com/a?b=c"}}, 3), new String[][]{{"hasOption", "java.lang.String", "4"}, {"addOption", "java.lang.String,java.lang.String", "0"}, {"getMatchingOptions", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {123456789012345678901234567890=[ option: 123456789012345678901234567890   :: trud :: class java.lang.String ], =[ option:   :: a :: class java.lang.String ]} ] [ long {=[ option: 1...#270#389813002", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[[ option: sample   [ARG] :: 0 :: class java.lang.String ], [ option: \000  :: null :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-sample 0, -\000] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"<null>", "false", "1.12345678"}, false, 13, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}, 1), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "5"}, {"getOptionGroup", "org.apache.commons.cli.Option", "4"}, {"hasOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {null=[ option: null  :: 1.12345678 :: class java.lang.String ], a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-0 a] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-0 a] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "1.5f"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "1.5f"}, {"org.apache.commons.cli.Options", "getOptions", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "]"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "--", "a", "true", "0"}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "b,b,c"}}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "b,b,c"}}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"02345678901234{5678901234567890"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}, {"org.apache.commons.cli.Options", "getOption", "java.lang.String", "TITLE"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"]015551E-a", "abc"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e10", "`bc"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1e10=[ option: 1e10  :: `bc :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1e10=[ option: 1e10  :: `bc :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<null>"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-0 ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "toString", ""}, {"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}, {"org.apache.commons.cli.Options", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: \000  :: null :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<null>"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<null>"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 2), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "1.2234567"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "1.2234567"}}, 2), new String[][]{{"getOption", "java.lang.String", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"["}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "2020-01-01", "2020-02-30T25:61:61"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 9, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 9, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 9, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"1020`-?1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "\t"}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 2), new String[][]{{"removeAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" ]55[ loog <a>b</a>", "1.5_f"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "a,b,c"}, {"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "null"}, {"org.apache.commons.cli.Options", "helpOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1.25", "]", "false", "--1"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<null>"}, {"org.apache.commons.cli.Options", "helpOptions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"0x123456789", " [ Options: [ short Hello, World12:30:451.1234567", "true", "a b"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<null>"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 1), new String[][]{{"addOption", "java.lang.String,java.lang.String", "0"}, {"hasLongOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ], 0x123456789=[ option: 0x123456789  [ Options: [ short Hello, World12:30:451.1234567  [ARG] :: a b :: class java.lang.String ]} ] [ lo...#370#-696384094", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"0x123456789", " [ Options: [ short Hello, World12:30:451.1234567", "true", "a b"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 1), new String[][]{{"addOption", "java.lang.String,java.lang.String", "0"}, {"hasLongOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ], 0x123456789=[ option: 0x123456789  [ Options: [ short Hello, World12:30:451.1234567  [ARG] :: a b :: class java.la...#496#328350362", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"0x123456789", " [ Options: [ short Hello, World12:30:451.1234567", "true", "a b"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:8>"}}, 1), new String[][]{{"addOption", "java.lang.String,java.lang.String", "0"}, {"hasLongOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], 0x123456789=[ option: 0x123456789  [ Options: [ short Hello, World12:30:451.1234567  [ARG] :: a b :: class java.lang.String ], =...#422#1020235784", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"}//10"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 15, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}}, 2), new String[][]{{"add", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "010", "true", "\u00e9"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 3), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {010=[ option: 010  [ARG] :: \u00e9 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {010=[ option: 010  [ARG] :: \u00e9 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1L", "-1.5", "false", "I["}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1L=[ option: 1L -1.5  :: I[ :: class java.lang.String ]} ] [ long {-1.5=[ option: 1L -1.5  :: I[ :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1L=[ option: 1L -1.5  :: I[ :: class java.lang.String ]} ] [ long {-1.5=[ option: 1L -1.5  :: I[ :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1L", "-1.5", "false", "s["}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1L=[ option: 1L -1.5  :: s[ :: class java.lang.String ]} ] [ long {-1.5=[ option: 1L -1.5  :: s[ :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1L=[ option: 1L -1.5  :: s[ :: class java.lang.String ]} ] [ long {-1.5=[ option: 1L -1.5  :: s[ :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1L", "-1.5", "false", "sZ"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1L=[ option: 1L -1.5  :: sZ :: class java.lang.String ]} ] [ long {-1.5=[ option: 1L -1.5  :: sZ :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1L=[ option: 1L -1.5  :: sZ :: class java.lang.String ]} ] [ long {-1.5=[ option: 1L -1.5  :: sZ :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1L", "-1", "false", "sZ"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1L=[ option: 1L -1  :: sZ :: class java.lang.String ]} ] [ long {-1=[ option: 1L -1  :: sZ :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1L=[ option: 1L -1  :: sZ :: class java.lang.String ]} ] [ long {-1=[ option: 1L -1  :: sZ :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1fL", "-1", "false", "sZ"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1fL=[ option: 1fL -1  :: sZ :: class java.lang.String ]} ] [ long {-1=[ option: 1fL -1  :: sZ :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1fL=[ option: 1fL -1  :: sZ :: class java.lang.String ]} ] [ long {-1=[ option: 1fL -1  :: sZ :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"]", "-1", "false", "sZ"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "010", "null", "true", " ] [ long "}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 010=[ option: 010 ...#340#-1782243814", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "010", "null", "true", " ] [ long "}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {010=[ option: 010 null  [ARG] ::  ] [ long  :: class java.lang.String ]} ] [ long {null=[ option: 010 null  [ARG] ::  ] [ long  :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "[Options: [ short "}}, 3), new String[][]{{"indexOf", "java.lang.Object", "5"}, {"listIterator", "", "7"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"113456789012345578901234567890"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "false", "0"}, {"org.apache.commons.cli.Options", "helpOptions", ""}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{", 234567890122345678901234567890"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "false", "r"}, {"org.apache.commons.cli.Options", "helpOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF  :: r :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{", 234567890122345678901234567890"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "xFFFFFFFF", "false", "r"}, {"org.apache.commons.cli.Options", "helpOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {xFFFFFFFF=[ option: xFFFFFFFF  :: r :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{", 23567890122345678901O3557890+1"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "-", "false", "r"}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:1>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "--1", "1.12345671.1234567890o1234567", "false", "0x1F"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "null", "true", "12:30:45"}}, 2), new String[][]{{"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "1"}, {"org.apache.commons.cli.Options", "toString", ""}}, 1), new String[][]{{"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-0 a] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"/a/b", "false", "["}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"/a/b", "false", "["}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}, {"org.apache.commons.cli.Options", "helpOptions", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "PT1H"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<null>"}}), new String[][]{{"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"/a/b", "false", "Title"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "010"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"Hello, World12:30:451.1234567", "false", "Til;e"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:3>"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "[1,\\"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"0L", "false", "Til;e"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:3>"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "[1,\\"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0L=[ option: 0L  :: Til;e :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0L=[ option: 0L  :: Til;e :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"0Lg", "false", ""}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:3>"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "[1,\\"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0Lg=[ option: 0Lg  ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0Lg=[ option: 0Lg  ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"0Lg", "true", ""}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "[1,\\"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0Lg=[ option: 0Lg  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0Lg=[ option: 0Lg  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"1Lg", "true", ""}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "[ Options: [ short "}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1Lg=[ option: 1Lg  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1Lg=[ option: 1Lg  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"1Lg", "true", ""}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "2020-01-01"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "[ Options: [ short "}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1Lg=[ option: 1Lg  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1Lg=[ option: 1Lg  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"1Lg", "true", ""}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "2020-01-01"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "[ Options: [ short "}}), new String[][]{{"hasOption", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1Lg=[ option: 1Lg  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"1Lg", "false", ""}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "2020-01-01"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "[ Options: [ short "}}), new String[][]{{"hasOption", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1Lg=[ option: 1Lg  ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<null>"}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:6>"}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "b,b,c"}}), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}), new String[][]{{"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"0L"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "{\"a\":1}"}}), new String[][]{{"addAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "\n", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "\n", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "\n", "12:30:45"}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "]"}}), new String[][]{{"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"]", "null"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e10", "`bc"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1e10=[ option: 1e10  :: `bc :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1e10=[ option: 1e10  :: `bc :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1d10", "`bc"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1d10=[ option: 1d10  :: `bc :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1d10=[ option: 1d10  :: `bc :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1d10", "`bc\u00e9"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1d10=[ option: 1d10  :: `bc\u00e9 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1d10=[ option: 1d10  :: `bc\u00e9 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.Options", "getOption", "java.lang.String", "1.5d"}}), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "-1.5"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "010", "true", "2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {010=[ option: 010  [ARG] :: 2020-02-30T25:61:61 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{".5", " ", "true", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 8, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 8, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.OptionGroup", "isRequired", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"a"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-0 ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-0 ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}, {"org.apache.commons.cli.OptionGroup", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "true", "[1,\\"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "TITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  [ARG] :: [1,\\ :: class java.lang.String ]} ] [ long {aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa=[ option: 0xFFFFFFFF aaaaaaaaaaa...#265#-270611743", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "1.2234567"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1", "`bc", "false", "a b"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1=[ option: 1 `bc  :: a b :: class java.lang.String ]} ] [ long {`bc=[ option: 1 `bc  :: a b :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1=[ option: 1 `bc  :: a b :: class java.lang.String ]} ] [ long {`bc=[ option: 1 `bc  :: a b :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"11", "`bc", "false", "a b"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {11=[ option: 11 `bc  :: a b :: class java.lang.String ]} ] [ long {`bc=[ option: 11 `bc  :: a b :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {11=[ option: 11 `bc  :: a b :: class java.lang.String ]} ] [ long {`bc=[ option: 11 `bc  :: a b :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1L", "`bc", "false", "a W"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1L=[ option: 1L `bc  :: a W :: class java.lang.String ]} ] [ long {`bc=[ option: 1L `bc  :: a W :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1L=[ option: 1L `bc  :: a W :: class java.lang.String ]} ] [ long {`bc=[ option: 1L `bc  :: a W :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1M", "`bc", "false", "a W"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1M=[ option: 1M `bc  :: a W :: class java.lang.String ]} ] [ long {`bc=[ option: 1M `bc  :: a W :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1M=[ option: 1M `bc  :: a W :: class java.lang.String ]} ] [ long {`bc=[ option: 1M `bc  :: a W :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1M", "`bd", "false", "a W"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1M=[ option: 1M `bd  :: a W :: class java.lang.String ]} ] [ long {`bd=[ option: 1M `bd  :: a W :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1M=[ option: 1M `bd  :: a W :: class java.lang.String ]} ] [ long {`bd=[ option: 1M `bd  :: a W :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1M", ".bd", "false", "a} WW"}, false, 10, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", " "}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:1>"}}), new String[][]{{"getOption", "java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], 1M=[ option: 1M .bd  :: a} WW :: class java.lang.String ]} ] [ long {.bd=[ option: 1M .bd  :: a} WW :: class java.lang.String ]}...#202#-9066037", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "http://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "http://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"`bc"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "PT1H", "false", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {PT1H=[ option: PT1H  :: -0.0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: sample   [ARG] :: 0 :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option:   :: a :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}, {"org.apache.commons.cli.Options", "getOption", "java.lang.String", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ], [ option:   :: a :: class java.lang.String ...#202#-1106390708", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], =[ option:   :: a ...#242#-1131935282", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}), new String[][]{{"removeAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:1>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "", "true", "abc"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "[1,2]", "12:30:45", "false", " "}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: abc :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:1>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "", "true", "abc"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "C1,2]", "12:30:45", "false", " "}}), new String[][]{{"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: abc :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:1>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "", "true", "abc"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "C1,2]", "12:30:45", "false", "+1"}}), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: abc :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:1>"}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:7>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "", "true", "abc"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], =[ option:   [ARG]...#250#1459717455", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}}), new String[][]{{"add", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "5."}}), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"22:4x:451"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "Title", " ]", "false", "\n"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {Title=[ option: Title  ]  :: \n :: class java.lang.String ]} ] [ long { ]=[ option: Title  ]  :: \n :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{" ]"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "Title", " ]", "false", "\n"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: Title  ]  :: \n :: class java.lang.String ] {getArgName=null, getArgs=-1, getDescription=\n, getId=84, getLongOpt= ], getOpt=Title, getValue=null, getValueSeparator=\000, getValues=null, hasArg=f...#320#-1834940797", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {Title=[ option: Title  ]  :: \n :: class java.lang.String ]} ] [ long { ]=[ option: Title  ]  :: \n :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "Title", "", "false", "\n"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {Title=[ option: Title   :: \n :: class java.lang.String ]} ] [ long {=[ option: Title   :: \n :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-a 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "010", "null", "true", " ] [ long "}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 010=[ option: 010 ...#340#-1782243814", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}), new String[][]{{"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "[ Options: [ short "}}), new String[][]{{"addAll", "java.util.Collection", "5"}, {"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "[ Options: [ short "}}), new String[][]{{"addAll", "java.util.Collection", "5"}, {"listIterator", "", "7"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "I"}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "[Optins: [ short i"}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "1.1234567"}}), new String[][]{{"indexOf", "java.lang.Object", "5"}, {"listIterator", "", "7"}, {"previous", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "<a>b</a>"}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "[Optins: [ short i"}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "1.1234567"}}), new String[][]{{"indexOf", "java.lang.Object", "5"}, {"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"123456789012345578901234567890"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "false", "0"}, {"org.apache.commons.cli.Options", "helpOptions", ""}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{", 234567890122345678901234567890"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "xFFFFFFFF", "false", "r"}, {"org.apache.commons.cli.Options", "helpOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {xFFFFFFFF=[ option: xFFFFFFFF  :: r :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:1>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "<null>", "1.12345671.1234567890o1234567", "false", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: null 1.12345671.1234567890o1234567  :: 0x1F :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1.12345671.1234567890o1234567=[ option: null 1.12345671.1234567890o1234567  :: 0x1F :: class java.lang.String ]} ] [ long {1.12345671.1234567890o1234567=[ option: null 1.12345671.1...#257#1100083081", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 18, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: null ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:0>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "123456789012345678901234567890", "i", "false", "1.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {123456789012345678901234567890=[ option: 123456789012345678901234567890 i  :: 1.25 :: class java.lang.String ]} ] [ long {i=[ option: 123456789012345678901234567890 i  :: 1.25 :: c...#226#-141944745", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "2147483648", "-0.0", "false", "["}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: 2147483648 -0.0  :: [ :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {2147483648=[ option: 2147483648 -0.0  :: [ :: class java.lang.String ]} ] [ long {-0.0=[ option: 2147483648 -0.0  :: [ :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "\n"}}), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  :: 0 :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "\n"}}), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: \000  :: null :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option:   [ARG] :: 0 :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: sample   [ARG] :: 0 :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"abc", "P"}, false, 5, new String[][]{}, 2), new String[][]{{"getOption", "java.lang.String", "4"}, {"getMatchingOptions", "java.lang.String", "3"}, {"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {abc=[ option: abc  :: P :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"abc", "P"}, false, 5, new String[][]{}, 2), new String[][]{{"getOption", "java.lang.String", "4"}, {"getMatchingOptions", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {abc=[ option: abc  :: P :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aac", "P"}, false, 5, new String[][]{}, 2), new String[][]{{"getOption", "java.lang.String", "4"}, {"getMatchingOptions", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aac=[ option: aac  :: P :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aacPT1H", "P"}, false, 5, new String[][]{}, 2), new String[][]{{"getOption", "java.lang.String", "4"}, {"getMatchingOptions", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aacPT1H=[ option: aacPT1H  :: P :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aacPT1H", "O"}, false, 5, new String[][]{}, 2), new String[][]{{"getOption", "java.lang.String", "4"}, {"getMatchingOptions", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aacPT1H=[ option: aacPT1H  :: O :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaacPT1H", "O"}, false, 5, new String[][]{}, 2), new String[][]{{"getOption", "java.lang.String", "4"}, {"getMatchingOptions", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aaacPT1H=[ option: aaacPT1H  :: O :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaacPT1I", "O"}, false, 5, new String[][]{}), new String[][]{{"getOption", "java.lang.String", "4"}, {"getMatchingOptions", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aaacPT1I=[ option: aaacPT1I  :: O :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaacPT1I", "O"}, false, 5, new String[][]{}), new String[][]{{"getRequiredOptions", "", "4"}, {"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaabPT1I", "O"}, false, 6, new String[][]{}, 3), new String[][]{{"getRequiredOptions", "", "4"}, {"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"0yF4FcFEFFF2\n"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"IT"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:6>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "-1.5", "[ Options: [ short ", "false", "0\n"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"true", "PT1H"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "-1", "false", "<a>b</a>"}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {true=[ option: true  :: PT1H :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {true=[ option: true  :: PT1H :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"true", "PT1H"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "-1", "false", "<a>b</a>"}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:2>"}}), new String[][]{{"hasLongOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {true=[ option: true  :: PT1H :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"true", "PT1"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "-1", "false", "<a>b</a>"}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:2>"}}), new String[][]{{"hasLongOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {true=[ option: true  :: PT1 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "Hello, World12:30:451.1234567"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "[1,\\"}}, 2), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: null ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"2020--02-30T25:61:61", "http://example.com/a?b=c", "false", "il;e"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "http://example.com/a?b=c"}, {"org.apache.commons.cli.Options", "getOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "0x1F"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "1.5e300", "false", "1E-5"}, {"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"Hello, World12:30:451.1234567"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[ option: a  :: 0 :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nlPm", "11:2:45"}, false, 13, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 3), new String[][]{{"addOption", "org.apache.commons.cli.Option", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ], nlPm=[ option: nlPm  :: 11:2:45 :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ], nlPm=[ option: nlPm  :: 11:2:45 :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nlPm", "11:2:35"}, false, 13, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 3), new String[][]{{"addOption", "org.apache.commons.cli.Option", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ], nlPm=[ option: nlPm  :: 11:2:35 :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ], nlPm=[ option: nlPm  :: 11:2:35 :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nlPm", "11:2:35"}, false, 13, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 3), new String[][]{{"addOption", "org.apache.commons.cli.Option", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ], nlPm=[ option: nlPm  :: 11:2:35 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ], nlPm=[ option: nlPm  :: 11:2:35 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nlPm", "11:2:35"}, false, 13, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 3), new String[][]{{"addOption", "org.apache.commons.cli.Option", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ], nlPm=[ option: nlPm  :: 11:2:35 :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {samp...#258#-2060430531", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ], nlPm=[ option: nlPm  :: 11:2:35 :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {samp...#258#-2060430531", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"[1,\\"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}, 2), new String[][]{{"indexOf", "java.lang.Object", "0"}, {"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"[1,\\"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}}, 2), new String[][]{{"indexOf", "java.lang.Object", "0"}, {"add", "java.lang.Object", "2"}, {"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"1-.6c"}, false, 13, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "i"}, {"org.apache.commons.cli.Options", "helpOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "null", "010"}, {"org.apache.commons.cli.Options", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {null=[ option: null  :: 010 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "null", "010"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "PT1H", "--", "false", "0x1F"}, {"org.apache.commons.cli.Options", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {null=[ option: null  :: 010 :: class java.lang.String ], PT1H=[ option: PT1H --  :: 0x1F :: class java.lang.String ]} ] [ long {--=[ option: PT1H --  :: 0x1F :: class java.lang.Str...#208#-1527858038", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"21E,5"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "null", "010"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "PT1H", "--", "false", "0x1F"}, {"org.apache.commons.cli.Options", "getOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {null=[ option: null  :: 010 :: class java.lang.String ], PT1H=[ option: PT1H --  :: 0x1F :: class java.lang.String ]} ] [ long {--=[ option: PT1H --  :: 0x1F :: class java.lang.Str...#208#-1527858038", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"7"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "null", "010"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {null=[ option: null  :: 010 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-a 0, -\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-a 0, -\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}), new String[][]{{"size", "", "1"}, {"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}, 1), new String[][]{{"size", "", "1"}, {"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:1>"}}, 1), new String[][]{{"size", "", "1"}, {"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 1), new String[][]{{"size", "", "1"}, {"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}}), new String[][]{{"size", "", "1"}, {"contains", "java.lang.Object", "4"}, {"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "Title"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "Title"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "getOptions", ""}}), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 15, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"Til;e"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "1Lg", "\u00e9", "false", "1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {1Lg=[ option: 1Lg \u00e9  :: 1.5 :: class java.lang.String ]} ] [ long {\u00e9=[ option: 1Lg \u00e9  :: 1.5 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"binll"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "1.1234567", "true", "0xFEFFFFFF"}, {"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "1bb"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "isRequired", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"7T"}, false, 13, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "]]", "true", "[1,\\"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "++,c", "\t"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "a", " ]", "false", "1.5e300"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  ]  :: 1.5e300 :: class java.lang.String ]} ] [ long { ]=[ option: a  ]  :: 1.5e300 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{".5"}, false, 14, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "]]", "true", "[1,\\"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "a", " ]", "true", "1.5e300"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  ]  [ARG] :: 1.5e300 :: class java.lang.String ]} ] [ long { ]=[ option: a  ]  [ARG] :: 1.5e300 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"-O5"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "]]", "true", "[1,\\"}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", " ]"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "b", " ]", "true", "1.5e300"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {b=[ option: b  ]  [ARG] :: 1.5e300 :: class java.lang.String ]} ] [ long { ]=[ option: b  ]  [ARG] :: 1.5e300 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "http://example.com/a?b=c", "a,b,c"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "false", "Til;e"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "Hello, World12:30:451.1234567"}}, 3), new String[][]{{"addOption", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF  :: Til;e :: class java.lang.String ], 0=[ option: 0  :: sample :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java...#217#1662125502", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF  :: Til;e :: class java.lang.String ], 0=[ option: 0  :: sample :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java...#217#1662125502", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "http://example.com/a?b=c", "a,b,c"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "false", "Til;e"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "Hello, World12:30:451.1234567"}}, 3), new String[][]{{"addOption", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF  :: Til;e :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ], 0=[ option: 0  :: sample :: class java.lang.String ]} ] [...#210#1453789916", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF  :: Til;e :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ], 0=[ option: 0  :: sample :: class java.lang.String ]} ] [...#210#1453789916", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "http://example.com/a?b=c", "a,b,c"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "false", "Til;e"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "Hello, World12:30:451.1234567"}}, 3), new String[][]{{"addOption", "java.lang.String,java.lang.String", "6"}, {"getRequiredOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF  :: Til;e :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ], 0=[ option: 0  :: sample :: class java.lang.String ]} ] [...#210#1453789916", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "0", "a,b,c"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "false", "Til;e"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "Hello, World12:30:451.1234567"}}, 3), new String[][]{{"addOption", "java.lang.String,java.lang.String", "6"}, {"getRequiredOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  :: sample :: class java.lang.String ], 0xFFFFFFFF=[ option: 0xFFFFFFFF  :: Til;e :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [...#210#802824838", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "0", "a,b,c"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "false", "Til;e"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "Hello, World12:30:451.1234567"}}, 3), new String[][]{{"addOption", "java.lang.String,java.lang.String", "6"}, {"getRequiredOptions", "", "2"}, {"subList", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "0", "a,b,F"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "false", "-1"}}, 3), new String[][]{{"addOption", "java.lang.String,java.lang.String", "6"}, {"getRequiredOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  :: sample :: class java.lang.String ], 0xFFFFFFFF=[ option: 0xFFFFFFFF  :: -1 :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.la...#214#83413965", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}}), new String[][]{{"getNames", "", "4"}, {"size", "", "6"}, {"addAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"removeAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"1.2L3"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "0x1F"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "i", "true", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {i=[ option: i  [ARG] :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"1.2I3"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "i", "true", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {i=[ option: i  [ARG] :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "true", "true", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {true=[ option: true  [ARG] :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", " "}}), new String[][]{{"getMatchingOptions", "java.lang.String", "4"}, {"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "6"}, {"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "false"}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}), new String[][]{{"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "I", "Title"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {I=[ option: I  :: Title :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "5."}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "\t"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "I", "Title"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], I=[ option: I  :: ...#248#1903991007", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}), new String[][]{{"addOption", "java.lang.String,java.lang.String", "7"}, {"addOption", "java.lang.String,boolean,java.lang.String", "4"}, {"hasShortOption", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], =[ option:   [ARG] :: 0 :: class java.lang.String ], sample=[ option: sample  ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "5."}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "I1L", "Title"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {I1L=[ option: I1L  :: Title :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"220m0101"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{" >u"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "`bcHello, World12:30:451.1234567"}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:4>"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 0, null, 3), new String[][]{{"hasOption", "java.lang.String", "0"}, {"getOption", "java.lang.String", "7"}, {"getOptionGroup", "org.apache.commons.cli.Option", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "_bc", "true", "Til;e"}}, 3), new String[][]{{"hasOption", "java.lang.String", "0"}, {"getOption", "java.lang.String", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {_bc=[ option: _bc  [ARG] :: Til;e :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:4>"}, false, 11, new String[][]{}, 3), new String[][]{{"hasOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "5.", "--1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", ".", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "true", "0L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  [ARG] :: 0L :: class java.lang.String ]} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  [ARG] :: 0L :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "true", "0L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  :: null ], aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  [ARG] :: 0L :: class java.lang.String ]} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: null ], aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  [ARG] :: 0L :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "aaaaaaaaabaaaaaaaaaaaaaaaaaaaa", "true", "0L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {aaaaaaaaabaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaabaaaaaaaaaaaaaaaaaaaa  [ARG] :: 0L :: class java.lang.String ]} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aaaaaaaaabaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaabaaaaaaaaaaaaaaaaaaaa  [ARG] :: 0L :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "aaaaaaaaabaaaaaaaaaaaaaaaaaaaa", "true", "0L"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {aaaaaaaaabaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaabaaaaaaaaaaaaaaaaaaaa  [ARG] :: 0L :: class java.lang.String ]} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aaaaaaaaabaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaabaaaaaaaaaaaaaaaaaaaa  [ARG] :: 0L :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "aaaaaaaaabaaaaaaaaaaaaaaaaaaaa", "true", "0LW"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {aaaaaaaaabaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaabaaaaaaaaaaaaaaaaaaaa  [ARG] :: 0LW :: class java.lang.String ]} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aaaaaaaaabaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaabaaaaaaaaaaaaaaaaaaaa  [ARG] :: 0LW :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}, {"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
