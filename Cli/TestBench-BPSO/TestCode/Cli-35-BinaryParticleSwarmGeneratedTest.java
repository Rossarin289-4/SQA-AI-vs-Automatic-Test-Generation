package generated.algorithm;

import junit.framework.TestCase;

public class BinaryParticleSwarmGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:12>"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}}), new String[][]{{"addOption", "java.lang.String,java.lang.String", "1"}, {"hasLongOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1", "Hello, World", "true", "\thttp:1/example.com/a?b=c"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:2>"}, {"org.apache.commons.cli.Options", "getOptions", ""}}), new String[][]{{"hasOption", "java.lang.String", "7"}, {"getMatchingOptions", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[Hello, World]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1=[ option: 1 Hello, World  [ARG] :: \thttp:1/example.com/a?b=c :: class java.lang.String ]} ] [ long {Hello, World=[ option: 1 Hello, World  [ARG] :: \thttp:1/example.com/a?b=c :: c...#226#1657786762", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}}), new String[][]{{"hasOption", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"0xOF", "5.", "false", "6..1e0"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "\u00e9", "true", "1.5d"}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "5"}, {"getMatchingOptions", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\u00e9=[ option: \u00e9  [ARG] :: 1.5d :: class java.lang.String ], 0xOF=[ option: 0xOF 5.  :: 6..1e0 :: class java.lang.String ], 0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [...#330#-2049136482", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "0xFFFFFiFFF"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "1.25", "1", "false", "PTOH"}}), new String[][]{{"hasOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"r"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "nvll", "true", "d"}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "2021-02-30T25:61:61I"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {nvll=[ option: nvll  [ARG] :: d :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"0xxFFFFFiFFF", "3-1.5", "false", "Hlo, World"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "1.5", "::"}}, 1), new String[][]{{"getMatchingOptions", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 0xxFFFFFiFFF=[ opt...#358#1687628079", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "6..1e0"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}, 3), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "7"}, {"getOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option:   :: 6..1e0 :: class java.lang.String ] {getArgName=null, getArgs=-1, getDescription=6..1e0, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparato...#350#1977369162", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: 6..1e0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e0", "-0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1e0=[ option: 1e0  :: -0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1e0=[ option: 1e0  :: -0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\037", "T1H"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"h"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"http://exaample.com/a?b=c"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"a ] "}, false, 0, null, 2), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", " "}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:3>"}}, 3), new String[][]{{"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 1), new String[][]{{"addAll", "int,java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "6..+1.5"}, {"org.apache.commons.cli.Options", "getOption", "java.lang.String", "/a/b2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "/5", "Tisl", "false", "aaaa2020-02-30T25:61:61"}}, 3), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "0"}, {"hasShortOption", "java.lang.String", "2"}, {"getRequiredOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "2020-01C-011.25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", " "}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:2>"}}, 2), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "1", "true", "1.12345m678901234567"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "a b", "false", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 1=[ option: 1  [AR...#269#1539056246", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"Tittl", "true", "TitlB"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "a,c,c"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {Tittl=[ option: Tittl  [ARG] :: TitlB :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {Tittl=[ option: Tittl  [ARG] :: TitlB :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"01.123456790123456", "true", "0"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "\"a\":1}", "6..\u00e91.5f", "true", "1.5e300"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}, {"org.apache.commons.cli.Options", "helpOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ], [ option: \000  :: null :: class java.lang.Str...#206#-70151386", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], \000=[ option: \000  :: ...#247#1411123948", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"<a></a>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "[ Optioms: [ short "}}, 1), new String[][]{{"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"addAll", "int,java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "-0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "2020-/1-011.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"T]TLE", "true", "1.12345678901234561.12345678"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "  ]"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"removeAll", "java.util.Collection", "7"}, {"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-010.25", "1EE-5"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "+11"}}, 2), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"H"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "[1,2\\"}}, 2), new String[][]{{"getOptions", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "[ OpPions: [ short Hello, World"}}, 1), new String[][]{{"getOption", "java.lang.String", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2142", "1E,5"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "\036"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {2142=[ option: 2142  :: 1E,5 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {2142=[ option: 2142  :: 1E,5 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "getOption", "java.lang.String", "1e/"}}, 3), new String[][]{{"getOption", "java.lang.String", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "1.312345L78"}}, 2), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:4>"}, {"org.apache.commons.cli.Options", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"a,b,"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "20I20-01-011.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:12>"}}, 1), new String[][]{{"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:1>"}, {"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"0x12h456789", "true", "--11.12345678"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0x12h456789=[ option: 0x12h456789  [ARG] :: --11.12345678 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x12h456789=[ option: 0x12h456789  [ARG] :: --11.12345678 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "a,b,c2e0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}, 2), new String[][]{{"size", "", "2"}, {"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{" ", "", "false", "\037]"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"-0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "[ Options: [ short 0xFFFFFFFF"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "T{ tle"}, {"org.apache.commons.cli.Options", "getOption", "java.lang.String", "2020-02-30T25:61:61"}}, 1), new String[][]{{"hasOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "{\"a\":1}", "false", "2b47483648"}}, 3), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {sample=[ option: sample  :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample  :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"214743648"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "050"}, {"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "\010"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"a,b,;["}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"E"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"1\u00e9"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:4>"}}, 1), new String[][]{{"removeAll", "java.util.Collection", "0"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}, 3), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "6"}, {"hasLongOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "/a/c"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:3>"}}, 2), new String[][]{{"getOption", "java.lang.String", "0"}, {"addOption", "org.apache.commons.cli.Option", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"add", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "2020-02-30T25:61:62"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{";0xEFFFFFFF", "..a/b"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "1.12345678"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "2"}}, 1), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"1K"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", " ] [ long "}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "20220-01-011.25", "false", "TIETLE"}}, 2), new String[][]{{"hasOption", "java.lang.String", "7"}, {"getMatchingOptions", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{".5-0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "202-0-01"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, null, 1), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"1LA"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "{\"a\":1}1.12345678901234567"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", ".5-0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0.5", "true", "a+Eb,c"}}, 2), new String[][]{{"getRequiredOptions", "", "0"}, {"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", ""}}, 1), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"b"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "6"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "aa"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", " ] [ lo7ng "}}), new String[][]{{"clear", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"6."}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"ba"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"21474836480"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", ":"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"Titl", "1d10", "true", "6.."}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {Titl=[ option: Titl 1d10  [ARG] :: 6.. :: class java.lang.String ]} ] [ long {1d10=[ option: Titl 1d10  [ARG] :: 6.. :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {Titl=[ option: Titl 1d10  [ARG] :: 6.. :: class java.lang.String ]} ] [ long {1d10=[ option: Titl 1d10  [ARG] :: 6.. :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"1.4d"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "1.5-1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "6..\u00e9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"]", "false", "aa"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}, {"org.apache.commons.cli.Options", "getOptions", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"2020-01-011.25"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "aaaaabaaaaaaaaaaaaaaaaaaaaaaaa", "false", "{\"\";1}"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", " http:1/example.com/a?b=c", "true", "PT1H ]"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], aaaaabaaaaaaaaaaaa...#307#1375347137", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}), new String[][]{{"getMatchingOptions", "java.lang.String", "2"}, {"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123466789", "+1\n"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0x123466789=[ option: 0x123466789  :: +1\n :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x123466789=[ option: 0x123466789  :: +1\n :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "a b6/"}}), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{" ] [ long "}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "PT1H1.25123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"0xFFFFFFFFF", "true-1", "true", "11-5e300"}, false, 5, new String[][]{}), new String[][]{{"addOption", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0xFFFFFFFFF=[ option: 0xFFFFFFFFF true-1  [ARG] :: 11-5e300 :: class java.lang.String ], sample=[ option: sample  ::  :: class java.lang.String ]} ] [ long {true-1=[ option: 0xFFFF...#262#1397652856", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFFF=[ option: 0xFFFFFFFFF true-1  [ARG] :: 11-5e300 :: class java.lang.String ], sample=[ option: sample  ::  :: class java.lang.String ]} ] [ long {true-1=[ option: 0xFFFF...#262#1397652856", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:7>"}, false), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"2120-01-011.25", "-0.0", "false", ".5d1.5d"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"2020-01-0"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"\t1e10"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "+1", "A\n", "true", "\t010"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"addAll", "int,java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"<a>b</a>123456789012345678901234567890"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.Options", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 7, new String[][]{}), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"-0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 3, new String[][]{}), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"Title\u00e9", "true", "+10x1F"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "010", "true", "\n/10"}}), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {010=[ option: 010  [ARG] :: \n/10 :: class java.lang.String ], Title\u00e9=[ option: Title\u00e9  [ARG] :: +10x1F :: class java.lang.String ], =[ option:   [ARG] :: 0 :: class java.lang.Strin...#218#-1267906529", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {010=[ option: 010  [ARG] :: \n/10 :: class java.lang.String ], Title\u00e9=[ option: Title\u00e9  [ARG] :: +10x1F :: class java.lang.String ], =[ option:   [ARG] :: 0 :: class java.lang.Strin...#218#-1267906529", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"1LH"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "{#\";1}", "false", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF {#\";1}  :: 2 :: class java.lang.String ]} ] [ long {{#\";1}=[ option: 0xFFFFFFFF {#\";1}  :: 2 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:3>"}, false), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1", "abd"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "-0.0aaaaaaaaaaaaaaaaaaaaaaaOaaaaaaa"}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "http:/I/example.com/a?b=c1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[ option:   :: a :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:0>"}}), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "1.5d ]", "Tite", "false", "{\"\";1}E"}}), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}}), new String[][]{{"addOption", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "n"}}), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "trve"}}), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {sample=[ option: sample  :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample  :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}), new String[][]{{"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567Title"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:5>"}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "/a/b"}}), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"\t12:30:45"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"T1H", "1E-I", "true", "-1.51E-5"}, false, 6, new String[][]{}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {T1H=[ option: T1H 1E-I  [ARG] :: -1.51E-5 :: class java.lang.String ], =[ option:   :: a :: class java.lang.String ]} ] [ long {1E-I=[ option: T1H 1E-I  [ARG] :: -1.51E-5 :: class ...#221#-601834164", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {T1H=[ option: T1H 1E-I  [ARG] :: -1.51E-5 :: class java.lang.String ], =[ option:   :: a :: class java.lang.String ]} ] [ long {1E-I=[ option: T1H 1E-I  [ARG] :: -1.51E-5 :: class ...#221#-601834164", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:8>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "6.u1e0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "41E-5"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "123456789012345678901234567890"}}), new String[][]{{"getOption", "java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {0x123456789=[ option: 0x123456789  :: 41E-5 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "helpOptions", ""}}), new String[][]{{"size", "", "0"}, {"addAll", "java.util.Collection", "5"}, {"ensureCapacity", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TitleO010", "tsue\t"}, false), new String[][]{{"getMatchingOptions", "java.lang.String", "5"}, {"trimToSize", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {TitleO010=[ option: TitleO010  :: tsue\t :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "2147483648"}}), new String[][]{{"listIterator", "", "5"}, {"previousIndex", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{".50.5e300"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}), new String[][]{{"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}), new String[][]{{"getOptions", "", "3"}, {"iterator", "", "2"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"C5"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "Title1e10", "1.1224567"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {Title1e10=[ option: Title1e10  :: 1.1224567 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "1d10"}}), new String[][]{{"getRequiredOptions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"aaaaabaaaaaaaaaaaaaaaaaaaaaaa"}, false, 4, new String[][]{}), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:8>"}, false), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "5"}, {"getOptions", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"m", "false", "5/"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "0d11"}, {"org.apache.commons.cli.Options", "getOption", "java.lang.String", "\t"}}), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {m=[ option: m  :: 5/ :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"6.u"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "PT1H", " ]Titl", "false", "2020-A01-d1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {PT1H=[ option: PT1H  ]Titl  :: 2020-A01-d1 :: class java.lang.String ]} ] [ long { ]Titl=[ option: PT1H  ]Titl  :: 2020-A01-d1 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "", " ] [!long["}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   ::  ] [!long[ :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   ::  ] [!long[ :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"0xFF", "[g,2]", "true", "PT1H1d10"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "6..[ Options: [ short "}, {"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:4>"}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0xFF=[ option: 0xFF [g,2]  [ARG] :: PT1H1d10 :: class java.lang.String ], 0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {[g,2]=[ option: 0xFF [g,2]  [ARG] :: PT1H1...#234#1761427497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFF=[ option: 0xFF [g,2]  [ARG] :: PT1H1d10 :: class java.lang.String ], 0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {[g,2]=[ option: 0xFF [g,2]  [ARG] :: PT1H1...#234#1761427497", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false), new String[][]{{"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"P23456789012345678901234567890", "true", "123456789012345678901234667890"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "1/12345678", "true", "\t/a/"}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {P23456789012345678901234567890=[ option: P23456789012345678901234567890  [ARG] :: 123456789012345678901234667890 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.l...#227#-1344263740", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {P23456789012345678901234567890=[ option: P23456789012345678901234567890  [ARG] :: 123456789012345678901234667890 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.l...#227#-1344263740", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false), new String[][]{{"getRequiredOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"0x123456789", "false", "010"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "5.", "true", "0.5d"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0x123456789=[ option: 0x123456789  :: 010 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x123456789=[ option: 0x123456789  :: 010 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"0x1?"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "", "a", "true", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:  a  [ARG] :: 7 :: class java.lang.String ]} ] [ long {a=[ option:  a  [ARG] :: 7 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "1.5300"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "", "1E-"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option:   :: 1E- :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: 1E- :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{" "}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0", "true", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] :: 7 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "[0,2]1e10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"2020-01-011.25"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:2>"}}), new String[][]{{"listIterator", "", "7"}, {"set", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}, {"org.apache.commons.cli.Options", "getOptions", ""}}), new String[][]{{"trimToSize", "", "7"}, {"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<null>"}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "1"}}), new String[][]{{"addOption", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.Strin...#206#1769388810", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.Strin...#206#1769388810", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"1.1235567"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "1245678", "true", "/10"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "1.25", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1245678=[ option: 1245678  [ARG] :: /10 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "1e10"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "2020-01-01", "1E-O5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"4e10", "+.1"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "/0"}}), new String[][]{{"getRequiredOptions", "", "4"}, {"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {4e10=[ option: 4e10  :: +.1 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:3>"}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "7"}, {"getOption", "java.lang.String", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"I", "true", "2020-01-011.251.12345678[1,2]"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}), new String[][]{{"hasShortOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {I=[ option: I  [ARG] :: 2020-01-011.251.12345678[1,2] :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<null>"}}), new String[][]{{"getOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 0  [ARG] ::  :: class java.lang.String ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, h...#314#1863619541", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"6.", "-0.0", "false", "\n+1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"1.2234567890123456", "true", "2020-02-30T25:61:61"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "2020-02-300T25:61:61", "::", "true", "2020-01-015."}, {"org.apache.commons.cli.Options", "getOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1", "[ Options: [ short ", "false", "[ Opttions: [ short "}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 2), new String[][]{{"addOption", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1=[ option: 1 [ Options: [ short   :: [ Opttions: [ short  :: class java.lang.String ], 0=[ option: 0  :: sample :: class java.lang.String ]} ] [ long {[ Options: [ short =[ option...#279#1703158877", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1=[ option: 1 [ Options: [ short   :: [ Opttions: [ short  :: class java.lang.String ], 0=[ option: 0  :: sample :: class java.lang.String ]} ] [ long {[ Options: [ short =[ option...#279#1703158877", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"", "2d10", "true", "m Options: [ short "}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:  2d10  [ARG] :: m Options: [ short  :: class java.lang.String ]} ] [ long {2d10=[ option:  2d10  [ARG] :: m Options: [ short  :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:  2d10  [ARG] :: m Options: [ short  :: class java.lang.String ]} ] [ long {2d10=[ option:  2d10  [ARG] :: m Options: [ short  :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"1.12345678-1"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"12345789012345678901234567890", "T{\"\";1}{\"a\":1}", "false", " http91/example.com/a?b=c"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "12:30:45"}}, 2), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {12345789012345678901234567890=[ option: 12345789012345678901234567890 T{\"\";1}{\"a\":1}  ::  http91/example.com/a?b=c :: class java.lang.String ]} ] [ long {T{\"\";1}{\"a\":1}=[ option: 1...#304#871617068", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {12345789012345678901234567890=[ option: 12345789012345678901234567890 T{\"\";1}{\"a\":1}  ::  http91/example.com/a?b=c :: class java.lang.String ]} ] [ long {T{\"\";1}{\"a\":1}=[ option: 1...#304#871617068", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"aa", "1.5d", "true", "t[ue"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "2020-/1-01"}, {"org.apache.commons.cli.Options", "getOptions", ""}}), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "5"}, {"addOption", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {aa=[ option: aa 1.5d  [ARG] :: t[ue :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {1.5d=[ option: aa 1.5d  [ARG] :: t[ue :: class java.lang...#212#-23254818", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aa=[ option: aa 1.5d  [ARG] :: t[ue :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {1.5d=[ option: aa 1.5d  [ARG] :: t[ue :: class java.lang...#212#-23254818", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "123456789012345678901234567890", "false", "1L"}, {"org.apache.commons.cli.Options", "getOption", "java.lang.String", "Heklo, World"}}), new String[][]{{"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {123456789012345678901234567890=[ option: 123456789012345678901234567890  :: 1L :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "2.12o34567", "true", "16d"}}), new String[][]{{"hasOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"tue", "1.5e300", "true", "-.5"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:3>"}}, 1), new String[][]{{"getMatchingOptions", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {tue=[ option: tue 1.5e300  [ARG] :: -.5 :: class java.lang.String ]} ] [ long {1.5e300=[ option: tue 1.5e300  [ARG] :: -.5 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xFFFFFFF", "1.1234567-0.0"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0", "true", "aaaa7abaaaaaaaaaaaaaaaaaaaaaaaatrue"}}, 1), new String[][]{{"getOption", "java.lang.String", "5"}, {"getMatchingOptions", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] :: aaaa7abaaaaaaaaaaaaaaaaaaaaaaaatrue :: class java.lang.String ], 0xFFFFFFF=[ option: 0xFFFFFFF  :: 1.1234567-0.0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"retainAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"123456789013345678901234567890"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0x123446789", "false", ".1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x123446789=[ option: 0x123446789  :: .1 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "3"}, {"getOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option:   :: a :: class java.lang.String ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getVa...#340#1208436528", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ], =[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:6>"}, {"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "2020-01-011.25"}}), new String[][]{{"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: 0 sample  :: a :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"", "true", "1.5e300"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "--1"}}), new String[][]{{"hasShortOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 1.5e300 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"PTI", "1W", "false", "1.25la>b</a>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "20020-01-01", "1.s2345678901234567", "true", "[1,2\r]"}}), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "1"}, {"getMatchingOptions", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {PTI=[ option: PTI 1W  :: 1.25la>b</a> :: class java.lang.String ]} ] [ long {1W=[ option: PTI 1W  :: 1.25la>b</a> :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"a", "/a/b", "true", "1L"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "http://example.rom/a?b=c"}}, 3), new String[][]{{"addOption", "org.apache.commons.cli.Option", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a /a/b  [ARG] :: 1L :: class java.lang.String ], 0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {/a/b=[ option: a /a/b  [ARG] :: 1L :: class java.lang...#273#1854333661", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a /a/b  [ARG] :: 1L :: class java.lang.String ], 0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {/a/b=[ option: a /a/b  [ARG] :: 1L :: class java.lang...#273#1854333661", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "i", "true", "ab"}}, 1), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "123456789012345678901234567890"}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}}), new String[][]{{"iterator", "", "6"}, {"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"truec", "0y12345678912:30:45", "true", "aW bhttp://example.com/a?b=c"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}), new String[][]{{"hasShortOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {truec=[ option: truec 0y12345678912:30:45  [ARG] :: aW bhttp://example.com/a?b=c :: class java.lang.String ]} ] [ long {0y12345678912:30:45=[ option: truec 0y12345678912:30:45  [AR...#265#891415465", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"\thtp:1/example.com/a?b=c"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "{\"a\":1}}", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa/aa"}}, 2), new String[][]{{"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"i", "0x122456789", "true", "TITLE"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "1", "{\"\"a\"\":1}"}}), new String[][]{{"getRequiredOptions", "", "3"}, {"add", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "2"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:0>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "trueTITLE", "-0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "true", "1d10"}}, 1), new String[][]{{"hasShortOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {trueTITLE=[ option: trueTITLE -0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  [ARG] :: 1d10 :: class java.lang.String ]} ] [ long {-0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa=[ option: trueTITLE -0.0...#277#1674934753", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"addOption", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ], =[ option:   :: a :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ...#204#-1798748959", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ], =[ option:   :: a :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ...#204#-1798748959", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "5"}, {"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:3>"}, false), new String[][]{{"getRequiredOptions", "", "7"}, {"remove", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}), new String[][]{{"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"PU2H", "false", "2020-02.30T25:61:61\u00e9"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}, {"org.apache.commons.cli.Options", "helpOptions", ""}}), new String[][]{{"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: PU2H  :: 2020-02.30T25:61:61\u00e9 :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {PU2H=[ option: PU2H  :: 2020-02.30T25:61:61\u00e9 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "-1.5", "true", "0x12<a>b</a>"}}), new String[][]{{"isEmpty", "", "4"}, {"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:0>"}}, 2), new String[][]{{"retainAll", "java.util.Collection", "6"}, {"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"011I", "2020-01-011E-5", "false", ""}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "[ Options: [ short "}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "truetrue"}}, 2), new String[][]{{"getMatchingOptions", "java.lang.String", "1"}, {"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:8>"}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "<a>b</a>[1,2]"}}), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "3"}, {"addOption", "java.lang.String,boolean,java.lang.String", "5"}, {"getMatchingOptions", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: sample :: class java.lang.String ], sample=[ option: sample  :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0xFEFFFFFF", "true", "1"}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}, {"get", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xFFFFFFF", "Thtle"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}), new String[][]{{"hasOption", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ], 0xFFFFFFF=[ option: 0xFFFFFFF  :: Thtle :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "Title", "0", "false", ".5a,b-c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {Title=[ option: Title 0  :: .5a,b-c :: class java.lang.String ]} ] [ long {0=[ option: Title 0  :: .5a,b-c :: class java.lang.String ]} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {Title=[ option: Title 0  :: .5a,b-c :: class java.lang.String ]} ] [ long {0=[ option: Title 0  :: .5a,b-c :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"", "false", "aa"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:3>"}, {"org.apache.commons.cli.Options", "helpOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   :: aa :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: aa :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0x1234o56789", "false", "7."}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {0x1234o56789=[ option: 0x1234o56789  :: 7. :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"true", "true", "1d"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {true=[ option: true  [ARG] :: 1d :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {true=[ option: true  [ARG] :: 1d :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"1e1\r1.5f"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", ""}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "http://example.com/a?b=c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"tr4ue", "null0xFFFFFFFF", "true", "/}"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {tr4ue=[ option: tr4ue null0xFFFFFFFF  [ARG] :: /} :: class java.lang.String ]} ] [ long {null0xFFFFFFFF=[ option: tr4ue null0xFFFFFFFF  [ARG] :: /} :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {tr4ue=[ option: tr4ue null0xFFFFFFFF  [ARG] :: /} :: class java.lang.String ]} ] [ long {null0xFFFFFFFF=[ option: tr4ue null0xFFFFFFFF  [ARG] :: /} :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaabaaaaaaaaaaaaaaaaaaaaaaaa", "1e0-1"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "a1-5d"}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "\u00e8"}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {aaaaabaaaaaaaaaaaaaaaaaaaaaaaa=[ option: aaaaabaaaaaaaaaaaaaaaaaaaaaaaa  :: 1e0-1 :: class java.lang.String ], =[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aaaaabaaaaaaaaaaaaaaaaaaaaaaaa=[ option: aaaaabaaaaaaaaaaaaaaaaaaaaaaaa  :: 1e0-1 :: class java.lang.String ], =[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}}, 1), new String[][]{{"getRequiredOptions", "", "7"}, {"remove", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"", "true", "false", ""}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<null>"}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "3"}, {"getOptionGroup", "org.apache.commons.cli.Option", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {true=[ option:  true  ::  :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"t", "PT1H", "false", "1.5\t300TITLE"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {t=[ option: t PT1H  :: 1.5\t300TITLE :: class java.lang.String ]} ] [ long {PT1H=[ option: t PT1H  :: 1.5\t300TITLE :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {t=[ option: t PT1H  :: 1.5\t300TITLE :: class java.lang.String ]} ] [ long {PT1H=[ option: t PT1H  :: 1.5\t300TITLE :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"12:3e:45"}, false, 2, new String[][]{}, 2), new String[][]{{"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}), new String[][]{{"addAll", "java.util.Collection", "4"}, {"ensureCapacity", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "0100", " ]"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0100=[ option: 0100  ::  ] :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:10>"}}, 2), new String[][]{{"indexOf", "java.lang.Object", "1"}, {"add", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"tsuue", "TITLE", "true", "-1.50y1F"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}), new String[][]{{"hasShortOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ], tsuue=[ option: tsuue TITLE  [ARG] :: -1.50y1F :: class java.lang.String ]} ] [ long {TITLE=[ option: tsuue TITLE  [ARG] :: -1.50y1F ...#230#-1745479451", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"6a", "PT1H", "false", "9"}, false), new String[][]{{"hasOption", "java.lang.String", "0"}, {"getRequiredOptions", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {6a=[ option: 6a PT1H  :: 9 :: class java.lang.String ]} ] [ long {PT1H=[ option: 6a PT1H  :: 9 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:6>"}}, 1), new String[][]{{"getMatchingOptions", "java.lang.String", "0"}, {"addAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "-1.5<a>b</a>"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "<null>", "b"}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}}), new String[][]{{"getMatchingOptions", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {null=[ option: null  :: b :: class java.lang.String ], =[ option:   :: -1.5<a>b</a> :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "<a>b</a>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0x123456789=[ option: 0x123456789  :: <a>b</a> :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x123456789=[ option: 0x123456789  :: <a>b</a> :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "<null>", "[1,2]"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {null=[ option: null  :: [1,2] :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"b", "010", "true", " \u00e9http:1/example.com/a?b=c"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "0xdFFFFFFF"}}), new String[][]{{"getMatchingOptions", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[010]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {b=[ option: b 010  [ARG] ::  \u00e9http:1/example.com/a?b=c :: class java.lang.String ]} ] [ long {010=[ option: b 010  [ARG] ::  \u00e9http:1/example.com/a?b=c :: class java.lang.String ]} ...#201#-546707772", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"f10"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{" ] [ long "}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "123456789012345678901234568890", "false", "0x1F/a/b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {123456789012345678901234568890=[ option: 123456789012345678901234568890  :: 0x1F/a/b :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", ""}}, 2), new String[][]{{"getRequiredOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"-0.00"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:7>"}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "i"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"tsu4", "1L1.1234567890123456"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}, {"org.apache.commons.cli.Options", "getOptions", ""}}), new String[][]{{"getRequiredOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {tsu4=[ option: tsu4  :: 1L1.1234567890123456 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "false", "0x2F"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:0>"}}), new String[][]{{"getMatchingOptions", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], aaaaaaaaaaaaaaaaaa...#305#-2036836399", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "215748348", " ht\u00e9p:1/exam", "true", "--11"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:13>"}}), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {215748348=[ option: 215748348  ht\u00e9p:1/exam  [ARG] :: --11 :: class java.lang.String ], 0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long { ht\u00e9p:1/exam=[ option: 215748...#262#237577534", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"xF"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "1\re101.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"147483648", "-5", "true", "[ Options; [ short "}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "\t."}}, 2), new String[][]{{"getRequiredOptions", "", "7"}, {"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {147483648=[ option: 147483648 -5  [ARG] :: [ Options; [ short  :: class java.lang.String ]} ] [ long {-5=[ option: 147483648 -5  [ARG] :: [ Options; [ short  :: class java.lang.Str...#208#1218993080", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"2.25"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "2e10", "1.12345678901234567"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {2e10=[ option: 2e10  :: 1.12345678901234567 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"12345678901234578901234667890", "true", "Ti\"tle"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:9>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "1H.1234567", "  "}}, 2), new String[][]{{"addOption", "org.apache.commons.cli.Option", "7"}, {"addOption", "java.lang.String,boolean,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {12345678901234578901234667890=[ option: 12345678901234578901234667890  [ARG] :: Ti\"tle :: class java.lang.String ], =[ option:   [ARG] :: 0 :: class java.lang.String ], 0=[ option:...#256#-599114526", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {12345678901234578901234667890=[ option: 12345678901234578901234667890  [ARG] :: Ti\"tle :: class java.lang.String ], =[ option:   [ARG] :: 0 :: class java.lang.String ], 0=[ option:...#256#-599114526", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<null>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}}, 1), new String[][]{{"ensureCapacity", "int", "0"}, {"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"-0.0aaaabaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:5>"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "7", "false", "[ Options: [ short 1.25"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"remove", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {7=[ option: 7  :: [ Options: [ short 1.25 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "  "}}, 2), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "http;//example.com/a?b=c"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "010", "aaaaabaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {010=[ option: 010  :: aaaaabaaaaaaaaaaaaaaaaaaaaaaa :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<null>"}, {"org.apache.commons.cli.Options", "getOptions", ""}}, 2), new String[][]{{"hasOption", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "getOptions", ""}}, 3), new String[][]{{"clear", "", "3"}, {"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "null.5"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 1), new String[][]{{"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "Iello, Wcorld"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "010abc", "false", "1."}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {010abc=[ option: 010abc  :: 1. :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", " ] [ long Hello, Wor", "+6\t"}}, 1), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"11e0", " ]  [ long"}, false), new String[][]{{"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: 11e0  ::  ]  [ long :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {11e0=[ option: 11e0  ::  ]  [ long :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"", "false", "5]"}, false, 7, new String[][]{}, 1), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "1.5d"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0x1", "false", "0xOG"}}), new String[][]{{"iterator", "", "3"}, {"hasNext", "", "4"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 0x1  :: 0xOG :: class java.lang.String ] {getArgName=null, getArgs=-1, getDescription=0xOG, getId=48, getLongOpt=null, getOpt=0x1, getValue=null, getValueSeparator=\000, getValues=null, hasArg=...#322#192954257", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x1=[ option: 0x1  :: 0xOG :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:7>"}}), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"02", "false", "-0.0"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:5>"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 3), new String[][]{{"addOption", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {02=[ option: 02  :: -0.0 :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {02=[ option: 02  :: -0.0 :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"12I456789012345678901234567890"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}}), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"PU2H ]"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"", "50", "true", "1d10--1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:  50  [ARG] :: 1d10--1 :: class java.lang.String ]} ] [ long {50=[ option:  50  [ARG] :: 1d10--1 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:  50  [ARG] :: 1d10--1 :: class java.lang.String ]} ] [ long {50=[ option:  50  [ARG] :: 1d10--1 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "Tjtle", "true", "1.5e300"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {Tjtle=[ option: Tjtle  [ARG] :: 1.5e300 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "1.1345678901234567", "1d1"}}, 2), new String[][]{{"getOptions", "", "4"}, {"removeAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"12345678T012345678901234567890", "true", "214983648"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "[1,2]", "true", "true", "1e"}, {"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "0x1123456789"}}), new String[][]{{"getOptions", "", "5"}, {"clear", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "1.5e3000"}}, 1), new String[][]{{"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "2020-01-011.25", "6/.i", "true", "\u00e9"}}, 1), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "6"}, {"hasShortOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}}), new String[][]{{"ensureCapacity", "int", "6"}, {"addAll", "int,java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "0x1234567899", "1e10", "false", "-5"}}), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x1234567899=[ option: 0x1234567899 1e10  :: -5 :: class java.lang.String ]} ] [ long {1e10=[ option: 0x1234567899 1e10  :: -5 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "6..1e0/a/b"}, {"org.apache.commons.cli.Options", "hasOption", "java.lang.String", ""}}, 1), new String[][]{{"getRequiredOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{" A [ long "}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "1.1234567890123456", "false", "null"}}, 2), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:14>"}, {"org.apache.commons.cli.Options", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e11", "http://example.com/a?b=c1d10"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", ",1"}}, 1), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1e11=[ option: 1e11  :: http://example.com/a?b=c1d10 :: class java.lang.String ], =[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1e11=[ option: 1e11  :: http://example.com/a?b=c1d10 :: class java.lang.String ], =[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "1F-5"}}, 2), new String[][]{{"addOption", "org.apache.commons.cli.Option", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "0xFFFFFFFF"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "PT1H ]", "a,b,c", "true", "\t"}}, 2), new String[][]{{"addOption", "org.apache.commons.cli.Option", "6"}, {"addOption", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1=[ option: 1  :: 0xFFFFFFFF :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ], sample=[ option: sample  ::  :: class java.lang.String ]} ] [ long {} ...#201#-371127435", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1=[ option: 1  :: 0xFFFFFFFF :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ], sample=[ option: sample  ::  :: class java.lang.String ]} ] [ long {} ...#201#-371127435", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"8"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "\n", "true", "PT1H ]true"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "0xoF"}}), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 3), new String[][]{{"addOption", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 0, null, 1), new String[][]{{"addOption", "org.apache.commons.cli.Option", "1"}, {"addOption", "java.lang.String,boolean,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ], =[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ], =[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"123456789012\t345678901234567890"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"a"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: a  [ARG] :: null :: class java.io.File ] {getArgName=null, getArgs=1, getDescription=null, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=tru...#318#1940263726", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 0, null, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "7", "TITLE"}}), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {7=[ option: 7  :: TITLE :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "6..a,b,c"}}), new String[][]{{"iterator", "", "7"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "1.5", "1.12345678901234567"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"aac", "-1[ Options: [ short ", "true", "a1e01e10"}, false, 6, new String[][]{}, 3), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {aac=[ option: aac -1[ Options: [ short   [ARG] :: a1e01e10 :: class java.lang.String ]} ] [ long {-1[ Options: [ short =[ option: aac -1[ Options: [ short   [ARG] :: a1e01e10 :: cl...#225#567408524", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aac=[ option: aac -1[ Options: [ short   [ARG] :: a1e01e10 :: class java.lang.String ]} ] [ long {-1[ Options: [ short =[ option: aac -1[ Options: [ short   [ARG] :: a1e01e10 :: cl...#225#567408524", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"[ \"Options: [T short "}, false, 0, null, 1), new String[][]{{"containsAll", "java.util.Collection", "7"}, {"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"[1+2]\n", "/a/ba b", "false", "6..\u00e9"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", ".1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E0", "--2"}, false, 7, new String[][]{}), new String[][]{{"hasOption", "java.lang.String", "6"}, {"getOptions", "", "7"}, {"remove", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 3), new String[][]{{"addOption", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], =[ option:   :: a ...#242#-1131935282", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], =[ option:   :: a ...#242#-1131935282", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "1e2", "6..1e0", "false", "-2."}}, 2), new String[][]{{"hasLongOption", "java.lang.String", "6"}, {"getRequiredOptions", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1e2=[ option: 1e2 6..1e0  :: -2. :: class java.lang.String ]} ] [ long {6..1e0=[ option: 1e2 6..1e0  :: -2. :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "2147583648", "true", "0"}}, 3), new String[][]{{"getOptions", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ], [ option: 2147583648  [ARG] :: 0 :: class j...#270#1752525703", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 2147583648=[ optio...#321#1160504622", SearchInputFactory_scaffolding.receiverState());
 }
}
