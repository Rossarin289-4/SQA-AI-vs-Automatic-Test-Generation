package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "0x12345679"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "-1.5"}}), new String[][]{{"hasOption", "java.lang.String", "5"}, {"addOptionGroup", "org.apache.commons.cli.OptionGroup", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"1M", "true", "PT1HI"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}), new String[][]{{"getMatchingOptions", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ], 1M=[ option: 1M  [ARG] :: PT1HI :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class jav...#218#1320829846", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "c,1"}}), new String[][]{{"getMatchingOptions", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "1"}}), new String[][]{{"hasOption", "java.lang.String", "7"}, {"hasOption", "java.lang.String", "0"}, {"getRequiredOptions", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "getOptions", ""}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "1.12345678901234567", "true", "0x1F"}}, 3), new String[][]{{"addOption", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF 1.12345678901234567  [ARG] :: 0x1F :: class java.lang.String ], =[ option:   :: a :: class java.lang.String ]} ] [ long {1.12345678901234567=[ optio...#279#1934385257", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF 1.12345678901234567  [ARG] :: 0x1F :: class java.lang.String ], =[ option:   :: a :: class java.lang.String ]} ] [ long {1.12345678901234567=[ optio...#279#1934385257", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "false", "O! ] [ long "}, false, 11, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "x12345a79"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0x123456789", "false", "\t"}, {"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:6>"}}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "0"}, {"hasShortOption", "java.lang.String", "2"}, {"getOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option:  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  :: O! ] [ long  :: class java.lang.String ] {getArgName=null, getArgs=-1, getDescription=O! ] [ long , getId=!StringIndexOutOfBoundsException, getLongOpt=aaa...#418#1835705406", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x123456789=[ option: 0x123456789  :: \t :: class java.lang.String ], =[ option:  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  :: O! ] [ long  :: class java.lang.String ]} ] [ long {aaaaaaaaaaaa...#308#-947052661", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1), new String[][]{{"remove", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "I"}}, 1), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"Q"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"B", "02"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], B=[ option: B  :: ...#245#1575755093", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], B=[ option: B  :: ...#245#1575755093", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"B", "02"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {B=[ option: B  :: 02 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {B=[ option: B  :: 02 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Bc", "02"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {Bc=[ option: Bc  :: 02 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {Bc=[ option: Bc  :: 02 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Bc", " 2"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {Bc=[ option: Bc  ::  2 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {Bc=[ option: Bc  ::  2 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Bc", " ,2"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {Bc=[ option: Bc  ::  ,2 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {Bc=[ option: Bc  ::  ,2 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Bc", " 2"}, false, 1, new String[][]{}, 3), new String[][]{{"getRequiredOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {Bc=[ option: Bc  ::  2 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"c", " 22"}, false, 1, new String[][]{}, 3), new String[][]{{"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: c  ::  22 :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {c=[ option: c  ::  22 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", " 22"}, false, 1, new String[][]{}, 3), new String[][]{{"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option:   ::  22 :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   ::  22 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "1.5", "true", "PT1H"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 0, null, 1), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {sample=[ option: sample  :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample  :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}, 1), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0", "true", "112"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] :: 112 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "--1", "1.5"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 16, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 3), new String[][]{{"hasShortOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 16, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 3), new String[][]{{"hasShortOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 16, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 3), new String[][]{{"hasShortOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:9>"}, false, 16, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 3), new String[][]{{"hasShortOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 16, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:4>"}}, 3), new String[][]{{"hasShortOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 16, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 16, new String[][]{}, 3), new String[][]{{"hasShortOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"nulc1.5d010"}, false, 15, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "2020-0m-002W1477483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "a,b,c"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1", "71e10", "false", "0x1F"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "12:30:45", "\n1.12345678901234567", "true", "0"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1=[ option: 1 71e10  :: 0x1F :: class java.lang.String ]} ] [ long {71e10=[ option: 1 71e10  :: 0x1F :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1=[ option: 1 71e10  :: 0x1F :: class java.lang.String ]} ] [ long {71e10=[ option: 1 71e10  :: 0x1F :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3), new String[][]{{"containsAll", "java.util.Collection", "4"}, {"lastIndexOf", "java.lang.Object", "6"}, {"addAll", "java.util.Collection", "7"}, {"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "-1", "false", "\u00e9"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "4"}, {"lastIndexOf", "java.lang.Object", "6"}, {"addAll", "java.util.Collection", "7"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "-1", "false", "\u00e9"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "4"}, {"lastIndexOf", "java.lang.Object", "6"}, {"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "-1", "false", "\u00e9"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "4"}, {"lastIndexOf", "java.lang.Object", "6"}, {"addAll", "java.util.Collection", "7"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 21, new String[][]{}, 1), new String[][]{{"containsAll", "java.util.Collection", "4"}, {"lastIndexOf", "java.lang.Object", "6"}, {"isEmpty", "", "7"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "2020-02-30T25:61:61"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 3), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "2020-02-30T25:61:61"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "2020-02-30T25:61:61", "true"}}, 3), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"-021474816481.1234567890123a4567true"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "0"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "+1", "12:30945"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>", "-0.01"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "/a/b"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}}, 3), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}, {"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:4>"}}, 3), new String[][]{{"iterator", "", "1"}, {"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"e11"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"e11"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}}, 2), new String[][]{{"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"e1Titl>ea b"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}, {"org.apache.commons.cli.Options", "toString", ""}}, 2), new String[][]{{"removeAll", "java.util.Collection", "1"}, {"containsAll", "java.util.Collection", "6"}, {"add", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "false", "\u00e9"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "false", "\u00e9"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  :: \u00e9 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: 0  [ARG] ::  :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: 0  [ARG] ::  :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}, {"org.apache.commons.cli.Options", "getOption", "java.lang.String", "5."}}, 1), new String[][]{{"addAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010", "1,2]1E,52020-02-30T25:61:61"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "-1"}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}, {"org.apache.commons.cli.Options", "getOptions", ""}}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "3"}, {"addOption", "org.apache.commons.cli.Option", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {010=[ option: 010  :: 1,2]1E,52020-02-30T25:61:61 :: class java.lang.String ], 0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {010=[ option: 010  :: 1,2]1E,52020-02-30T25:61:61 :: class java.lang.String ], 0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010", "1,2]1E,52020-02-30T25:61:61"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "-1"}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}, {"org.apache.commons.cli.Options", "getOptions", ""}}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "3"}, {"addOption", "org.apache.commons.cli.Option", "1"}, {"addOption", "org.apache.commons.cli.Option", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {010=[ option: 010  :: 1,2]1E,52020-02-30T25:61:61 :: class java.lang.String ], 0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: ...#227#525296895", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {010=[ option: 010  :: 1,2]1E,52020-02-30T25:61:61 :: class java.lang.String ], 0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: ...#227#525296895", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010", "1,2]1E,52020-02-30T25:61:61"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "-1"}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}, {"org.apache.commons.cli.Options", "getOptions", ""}}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "3"}, {"addOption", "org.apache.commons.cli.Option", "6"}, {"addOption", "org.apache.commons.cli.Option", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {010=[ option: 010  :: 1,2]1E,52020-02-30T25:61:61 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ], 0=[ option: 0 sample  :: a :: class java.lang.Str...#279#-1461062943", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {010=[ option: 010  :: 1,2]1E,52020-02-30T25:61:61 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ], 0=[ option: 0 sample  :: a :: class java.lang.Str...#279#-1461062943", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"000", "1,2]1E,52020-02-30T25:61:61"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}, {"org.apache.commons.cli.Options", "getOptions", ""}}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "3"}, {"addOption", "org.apache.commons.cli.Option", "6"}, {"addOption", "org.apache.commons.cli.Option", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {000=[ option: 000  :: 1,2]1E,52020-02-30T25:61:61 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ], 0=[ option: 0 sample  :: a :: class java.lang.Str...#279#-1948606365", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {000=[ option: 000  :: 1,2]1E,52020-02-30T25:61:61 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ], 0=[ option: 0 sample  :: a :: class java.lang.Str...#279#-1948606365", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "Hello, World", "-1."}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "Hello,  World", "-1."}}, 3), new String[][]{{"hasOption", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "Title", "[ Options: [ short "}}, 3), new String[][]{{"hasOption", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {Title=[ option: Title  :: [ Options: [ short  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaab"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   :: aaaaaaaaaaaaaaaaaaaaaaaaaaaaab :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: aaaaaaaaaaaaaaaaaaaaaaaaaaaaab :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\r", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaab"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "", "false", ".5"}}, 3), new String[][]{{"set", "int,java.lang.Object", "2"}, {"hasOptionalArg", "", "2"}, {"getArgName", "", "3"}, {"getValue", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF   :: .5 :: class java.lang.String ]} ] [ long {=[ option: 0xFFFFFFFF   :: .5 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", " ]", "true", "Title"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "", "false", "."}}, 3), new String[][]{{"set", "int,java.lang.Object", "2"}, {"hasOptionalArg", "", "2"}, {"getArgName", "", "3"}, {"getValue", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF   :: . :: class java.lang.String ]} ] [ long {=[ option: 0xFFFFFFFF   :: . :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2), new String[][]{{"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "true"}, {"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1.24", "", "false", "> [ption,: [ short .5"}, false, 14, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:5>"}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "PT1H"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "PT1H"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"[1,,2]"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "010", "true", "Title"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {010=[ option: 010  [ARG] :: Title :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"[1,,2]"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "010", "true", "Title"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "[ Options: [ short "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {010=[ option: 010  [ARG] :: Title :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"[1,,2]"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "010", "true", "Title"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "[ Options: [ short "}, {"org.apache.commons.cli.Options", "getOptions", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {010=[ option: 010  [ARG] :: Title :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "I"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "I"}}), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 18, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: null ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}, {"org.apache.commons.cli.Options", "toString", ""}}), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "1.5e300"}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "1.5e300"}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{" ] [ long ", "false", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "1.25", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], \000=[ option: \000  :: ...#247#1411123948", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], \000=[ option: \000  :: ...#247#1411123948", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"[1,,2]", " ] [ long ", "false", "TITLE"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "12"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 1=[ option: 1  :: ...#245#1338514868", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 1=[ option: 1  :: ...#245#1338514868", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2", "12"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 2=[ option: 2  :: ...#245#-2031960138", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 2=[ option: 2  :: ...#245#-2031960138", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2", "02"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 2=[ option: 2  :: ...#245#-331219659", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 2=[ option: 2  :: ...#245#-331219659", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "02"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 1=[ option: 1  :: ...#245#-1255711949", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 1=[ option: 1  :: ...#245#-1255711949", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"B", "02"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], B=[ option: B  :: ...#245#1575755093", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], B=[ option: B  :: ...#245#1575755093", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0", "true", "12"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] :: 12 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0", "true", "112"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] :: 112 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "--1", "1.5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 16, new String[][]{}), new String[][]{{"hasShortOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 16, new String[][]{}), new String[][]{{"hasShortOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 16, new String[][]{}), new String[][]{{"hasShortOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 16, new String[][]{}), new String[][]{{"hasShortOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 16, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"1.123456789012\t4568"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "i"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"c"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "2020-01-01"}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", " "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}}), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}), new String[][]{{"set", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"A"}, false, 12, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}), new String[][]{{"ensureCapacity", "int", "7"}, {"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1", "1", "false", "0x1F"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "12:30:45", "-1.5", "true", "0"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1=[ option: 1 1  :: 0x1F :: class java.lang.String ]} ] [ long {1=[ option: 1 1  :: 0x1F :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1=[ option: 1 1  :: 0x1F :: class java.lang.String ]} ] [ long {1=[ option: 1 1  :: 0x1F :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1", "1e10", "false", "0x1F"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "12:30:45", "-1.5", "true", "0"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1=[ option: 1 1e10  :: 0x1F :: class java.lang.String ]} ] [ long {1e10=[ option: 1 1e10  :: 0x1F :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1=[ option: 1 1e10  :: 0x1F :: class java.lang.String ]} ] [ long {1e10=[ option: 1 1e10  :: 0x1F :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1", "71e10", "false", "0x1F"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "12:30:45", "\n", "true", "0"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1=[ option: 1 71e10  :: 0x1F :: class java.lang.String ]} ] [ long {71e10=[ option: 1 71e10  :: 0x1F :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1=[ option: 1 71e10  :: 0x1F :: class java.lang.String ]} ] [ long {71e10=[ option: 1 71e10  :: 0x1F :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1", "71e10", "false", "0y1F"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "\n"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "12:30:45", "\n1.12345678901234567", "true", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1=[ option: 1 71e10  :: 0y1F :: class java.lang.String ]} ] [ long {71e10=[ option: 1 71e10  :: 0y1F :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1=[ option: 1 71e10  :: 0y1F :: class java.lang.String ]} ] [ long {71e10=[ option: 1 71e10  :: 0y1F :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1", "71e10", "false", "0y1F"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "\n"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "12:30:45", "\n1.12345678901234567", "true", "0"}}), new String[][]{{"getRequiredOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1=[ option: 1 71e10  :: 0y1F :: class java.lang.String ]} ] [ long {71e10=[ option: 1 71e10  :: 0y1F :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false), new String[][]{{"containsAll", "java.util.Collection", "4"}, {"lastIndexOf", "java.lang.Object", "6"}, {"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "true"}}), new String[][]{{"containsAll", "java.util.Collection", "4"}, {"lastIndexOf", "java.lang.Object", "6"}, {"addAll", "java.util.Collection", "7"}, {"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "-1", "false", "\u00e9"}}), new String[][]{{"containsAll", "java.util.Collection", "4"}, {"lastIndexOf", "java.lang.Object", "6"}, {"addAll", "java.util.Collection", "7"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "-1", "false", "\u00e9"}}), new String[][]{{"containsAll", "java.util.Collection", "4"}, {"lastIndexOf", "java.lang.Object", "6"}, {"addAll", "java.util.Collection", "7"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: null ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "3"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "2020-02-30T25:61:61"}}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"-021474816481.1234567890123a4566true"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "0"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "++1", "12:F0945"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"-D0"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "++1", "13:F0945"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "1L", "\t", "true", " "}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1L=[ option: 1L \t  [ARG] ::   :: class java.lang.String ]} ] [ long {\t=[ option: 1L \t  [ARG] ::   :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"-+0"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "++1", "13:F0945"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "1L", "\t", "true", " <a>b</a>"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1L=[ option: 1L \t  [ARG] ::  <a>b</a> :: class java.lang.String ]} ] [ long {\t=[ option: 1L \t  [ARG] ::  <a>b</a> :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "<null>", "1.5f", "false", "I"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1.5f=[ option: null 1.5f  :: I :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {1.5f=[ option: null 1.5f  :: I :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1.5f=[ option: null 1.5f  :: I :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {1.5f=[ option: null 1.5f  :: I :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  :: null ]} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: null ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"0x12345679", "1.25", "false", "0x1F"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0x12345679=[ option: 0x12345679 1.25  :: 0x1F :: class java.lang.String ]} ] [ long {1.25=[ option: 0x12345679 1.25  :: 0x1F :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x12345679=[ option: 0x12345679 1.25  :: 0x1F :: class java.lang.String ]} ] [ long {1.25=[ option: 0x12345679 1.25  :: 0x1F :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false), new String[][]{{"contains", "java.lang.Object", "6"}, {"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"."}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"."}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"."}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "I", "null", "true", "123456789012345678901234567890"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {I=[ option: I null  [ARG] :: 123456789012345678901234567890 :: class java.lang.String ]} ] [ long {null=[ option: I null  [ARG] :: 123456789012345678901234567890 :: class java.lang...#212#692677335", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "a", "http://example.com/a?b=c", "false", "2020-02-30T25:61:61"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a http://example.com/a?b=c  :: 2020-02-30T25:61:61 :: class java.lang.String ]} ] [ long {http://example.com/a?b=c=[ option: a http://example.com/a?b=c  :: 2020-02-30T2...#238#441648884", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "a", "http://example.com/a?b=c", "false", "2020-002-30T25:61:61"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a http://example.com/a?b=c  :: 2020-002-30T25:61:61 :: class java.lang.String ]} ] [ long {http://example.com/a?b=c=[ option: a http://example.com/a?b=c  :: 2020-002-30...#240#571415288", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}, {"org.apache.commons.cli.Options", "getOption", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:7>"}}), new String[][]{{"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}, {"org.apache.commons.cli.Options", "getOption", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:7>"}}), new String[][]{{"listIterator", "", "1"}, {"nextIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}, {"org.apache.commons.cli.Options", "getOption", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:7>"}}), new String[][]{{"listIterator", "", "1"}, {"hasPrevious", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "<b>b</a>"}}), new String[][]{{"clear", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "<b>b</a>c"}}), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "<b>b</a>c"}}), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "010"}}), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: 0  [ARG] ::  :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"abc", "false", "[1,2]"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {abc=[ option: abc  :: [1,2] :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {abc=[ option: abc  :: [1,2] :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"abch", "false", "[1,2]"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {abch=[ option: abch  :: [1,2] :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {abch=[ option: abch  :: [1,2] :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", " ", "false", "1.5"}}), new String[][]{{"set", "int,java.lang.Object", "2"}, {"hasOptionalArg", "", "2"}, {"getArgName", "", "3"}, {"getValue", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 0xFFFFFFFF=[ optio...#326#1454331056", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", " ", "false", "1.5"}}), new String[][]{{"set", "int,java.lang.Object", "2"}, {"hasOptionalArg", "", "2"}, {"getArgName", "", "3"}, {"getValue", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF    :: 1.5 :: class java.lang.String ]} ] [ long { =[ option: 0xFFFFFFFF    :: 1.5 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", " ", "false", ".5"}}), new String[][]{{"set", "int,java.lang.Object", "2"}, {"hasOptionalArg", "", "2"}, {"getArgName", "", "3"}, {"getValue", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF    :: .5 :: class java.lang.String ]} ] [ long { =[ option: 0xFFFFFFFF    :: .5 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "123456789012345678901234567890", "true", "1.5f"}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {123456789012345678901234567890=[ option: 123456789012345678901234567890  [ARG] :: 1.5f :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {123456789012345678901234567890=[ option: 123456789012345678901234567890  [ARG] :: 1.5f :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "12345678I012345678901234567890", "true", "1.5f"}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {12345678I012345678901234567890=[ option: 12345678I012345678901234567890  [ARG] :: 1.5f :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {12345678I012345678901234567890=[ option: 12345678I012345678901234567890  [ARG] :: 1.5f :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"010", "[1,2]", "false", "> [ption-: [ short .5"}, false, 14, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:7>"}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", ""}}), new String[][]{{"getOptions", "", "7"}, {"isEmpty", "", "1"}, {"remove", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], =[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], =[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "abc"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "Title", "false", "Title"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], Title=[ option: Title  :: Title :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], Title=[ option: Title  :: Title :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false), new String[][]{{"remove", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "0x123456789", "0x12345679"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {0x123456789=[ option: 0x123456789  :: 0x12345679 :: class java.lang.String ], 0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:2>"}, false), new String[][]{{"getRequiredOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}, 2), new String[][]{{"getRequiredOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"--2\u00e90I0"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"--2\u00e90I0"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"123456789012\"45678901234567890"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}), new String[][]{{"addAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"PT1H1F-"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "0x123456789", "abc"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x123456789=[ option: 0x123456789  :: abc :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"012"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "\013"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", " "}}, 3), new String[][]{{"set", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:8>"}, false, 11, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "-0.0", "1.12345678", "true", "i"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "Hell, Worlb"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 2), new String[][]{{"getMatchingOptions", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}), new String[][]{{"getMatchingOptions", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}), new String[][]{{"getMatchingOptions", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "1", "\n"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}), new String[][]{{"getMatchingOptions", "java.lang.String", "5"}, {"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1=[ option: 1  :: \n :: class java.lang.String ], 0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"12", "false", "1E-5"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {12=[ option: 12  :: 1E-5 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {12=[ option: 12  :: 1E-5 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"12", "false", "1Ec-5"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {12=[ option: 12  :: 1Ec-5 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {12=[ option: 12  :: 1Ec-5 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"12", "false", "1Ec5"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {12=[ option: 12  :: 1Ec5 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {12=[ option: 12  :: 1Ec5 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "1.5d"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "1.5d"}}, 2), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "1.25", "true", " "}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0", "false", "010"}}, 2), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  :: 010 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null", "0x123456789"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "1.25"}}), new String[][]{{"getMatchingOptions", "java.lang.String", "4"}, {"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], null=[ option: nul...#260#1426552290", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"n", "0x123456789"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "1.25"}}), new String[][]{{"getMatchingOptions", "java.lang.String", "4"}, {"removeAll", "java.util.Collection", "1"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"tr0e", "-1.5"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "Hello, World", "12", "true", "i"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {tr0e=[ option: tr0e  :: -1.5 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {tr0e=[ option: tr0e  :: -1.5 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"tr0e", "-1.5"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "Hello, World", "12", "true", "i"}}, 1), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {tr0e=[ option: tr0e  :: -1.5 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"tr0e", "-1.5"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "Hello, World", "12", "true", "i"}}), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {tr0e=[ option: tr0e  :: -1.5 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:1>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "1;  ]", "12"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  :: null ]} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: null ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "2020-02-30U25:61:61"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "1.1234567", "0.5d", "false", "{\"a\":1}"}}, 3), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "0x123456789", "<a>b</a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x123456789=[ option: 0x123456789  :: <a>b</a> :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"1L-1"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "0x123456789", "+a>b</a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x123456789=[ option: 0x123456789  :: +a>b</a> :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"1M", "false", "PT1HI"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}), new String[][]{{"getMatchingOptions", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ], 1M=[ option: 1M  :: PT1HI :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]...#203#-216370144", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"1M", "false", "PT1HI"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}}), new String[][]{{"getMatchingOptions", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], 1M=[ option: 1M  :: PT1HI :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1", "Title", "true", "2020-01-01"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "1L", "0x123456789"}}), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "6"}, {"getOption", "java.lang.String", "0"}, {"getOptions", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: 1L  :: 0x123456789 :: class java.lang.String ], [ option: 1 Title  [ARG] :: 2020-01-01 :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1L=[ option: 1L  :: 0x123456789 :: class java.lang.String ], 1=[ option: 1 Title  [ARG] :: 2020-01-01 :: class java.lang.String ]} ] [ long {Title=[ option: 1 Title  [ARG] :: 2020-...#236#-238342156", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"", "Title", "true", "2020-01-01"}, false, 12, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "1L", "0x123456789--1"}}), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "6"}, {"getOption", "java.lang.String", "0"}, {"getOpt", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1L=[ option: 1L  :: 0x123456789--1 :: class java.lang.String ], =[ option:  Title  [ARG] :: 2020-01-01 :: class java.lang.String ]} ] [ long {Title=[ option:  Title  [ARG] :: 2020-...#236#-501073220", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"", "itle", "false", "2020-01-01"}, false, 12, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "1L", "0"}, {"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:0>"}}), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "6"}, {"getOption", "java.lang.String", "0"}, {"getOpt", "", "4"}, {"setRequired", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option:  itle  :: 2020-01-01 :: class java.lang.String ] {getArgName=null, getArgs=-1, getDescription=2020-01-01, getId=!StringIndexOutOfBoundsException, getLongOpt=itle, getOpt=, getValue=null, get...#361#830368087", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1L=[ option: 1L  :: 0 :: class java.lang.String ], =[ option:  itle  :: 2020-01-01 :: class java.lang.String ]} ] [ long {itle=[ option:  itle  :: 2020-01-01 :: class java.lang.Str...#208#-1849855256", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"`aaaaaaaaaaaaaaaaasaaaaaaaaaa"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"1e10", "true", "\t"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1e10=[ option: 1e10  [ARG] :: \t :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1e10=[ option: 1e10  [ARG] :: \t :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"1e10", "true", "\007"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1e10=[ option: 1e10  [ARG] :: \007 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1e10=[ option: 1e10  [ARG] :: \007 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"1e10", "false", "\007"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1e10=[ option: 1e10  :: \007 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1e10=[ option: 1e10  :: \007 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"Title", "0xFFFFFFFF", "true", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "false", " ] [ long "}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}), new String[][]{{"hasShortOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ::  ] [ long  :: class java.lang.String ], Title=[ option: Title 0xFFFFFFFF  [ARG] :: true :: class java.la...#306#1091534542", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"Title", "0xFFFFFFFF", "true", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "false", " ] [ long "}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 1), new String[][]{{"hasShortOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ::  ] [ long  :: class java.lang.String ], Title=[ option: Title 0xFFFFFFFF  [ARG] :: true :: class java.la...#306#1091534542", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"Title", "0xFFFFFFFF", "true", "+1"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "false", " ] [ long "}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 1), new String[][]{{"hasShortOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ::  ] [ long  :: class java.lang.String ], Title=[ option: Title 0xFFFFFFFF  [ARG] :: +1 :: class java.lang...#302#1885009630", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"Title", "0xFFFFFFFF[1,2]", "true", ",1"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "false", " ] [ long "}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 1), new String[][]{{"hasShortOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ::  ] [ long  :: class java.lang.String ], Title=[ option: Title 0xFFFFFFFF[1,2]  [ARG] :: ,1 :: class java...#317#721055199", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"Sitle", "0xFFFFFFFF[1,2]", "true", ",1"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "false", " ] [ long "}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 1), new String[][]{{"hasShortOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ::  ] [ long  :: class java.lang.String ], Sitle=[ option: Sitle 0xFFFFFFFF[1,2]  [ARG] :: ,1 :: class java...#317#1646956764", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"Sitle", "0xFFFFFFFF[1,2]", "false", ",1"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "false", " ] [ long "}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 1), new String[][]{{"hasShortOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa=[ option: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ::  ] [ long  :: class java.lang.String ], Sitle=[ option: Sitle 0xFFFFFFFF[1,2]  :: ,1 :: class java.lang....#305#1430674400", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"1"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"5.", "1M", "true", "c"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"_H", "2020-02-30T25:61:61-11L", "true", "+2"}, false, 3, new String[][]{}, 2), new String[][]{{"hasOption", "java.lang.String", "1"}, {"addOptionGroup", "org.apache.commons.cli.OptionGroup", "6"}, {"addOption", "org.apache.commons.cli.Option", "4"}, {"getMatchingOptions", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {_H=[ option: _H 2020-02-30T25:61:61-11L  [ARG] :: +2 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {2020-02-30T25:61:61-11L=[ option: _H...#268#-1089830405", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"_H", "2020-02-30T25:61:61-11L", "true", "*2"}, false, 3, new String[][]{}, 2), new String[][]{{"hasOption", "java.lang.String", "1"}, {"addOptionGroup", "org.apache.commons.cli.OptionGroup", "6"}, {"addOption", "org.apache.commons.cli.Option", "4"}, {"getMatchingOptions", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {_H=[ option: _H 2020-02-30T25:61:61-11L  [ARG] :: *2 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {2020-02-30T25:61:61-11L=[ option: _H...#268#-88386213", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"_H", "2020-02-30T25:61;61-11L", "true", "*2"}, false, 3, new String[][]{}, 2), new String[][]{{"hasOption", "java.lang.String", "1"}, {"addOptionGroup", "org.apache.commons.cli.OptionGroup", "6"}, {"addOption", "org.apache.commons.cli.Option", "4"}, {"getMatchingOptions", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {_H=[ option: _H 2020-02-30T25:61;61-11L  [ARG] :: *2 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {2020-02-30T25:61;61-11L=[ option: _H...#268#519024858", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"_I", "2020-02-30T25:61;61-11L", "true", "*2"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "5.", "true", "[1,2]"}}, 2), new String[][]{{"hasOption", "java.lang.String", "1"}, {"addOptionGroup", "org.apache.commons.cli.OptionGroup", "6"}, {"addOption", "org.apache.commons.cli.Option", "4"}, {"getMatchingOptions", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {_I=[ option: _I 2020-02-30T25:61;61-11L  [ARG] :: *2 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {2020-02-30T25:61;61-11L=[ option: _I...#268#1282525883", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"_I", "2020-02-30T25:61;61-11L", "true", "*2"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}, 2), new String[][]{{"hasOption", "java.lang.String", "1"}, {"addOptionGroup", "org.apache.commons.cli.OptionGroup", "6"}, {"addOption", "org.apache.commons.cli.Option", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {_I=[ option: _I 2020-02-30T25:61;61-11L  [ARG] :: *2 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {2020-02-30T25:61;61-11L=[ option: _I...#268#1282525883", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {_I=[ option: _I 2020-02-30T25:61;61-11L  [ARG] :: *2 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {2020-02-30T25:61;61-11L=[ option: _I...#268#1282525883", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "true", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "true", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "true", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"O/a/b", "1"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0x123456789--1", "true", "\u00e9"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "1.12345678901234567"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"removeAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "PT1HI", "Title"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {PT1HI=[ option: PT1HI  :: Title :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "PPT1HI", "Title"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {PPT1HI=[ option: PPT1HI  :: Title :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"Ab"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "<null>", "0", "true", "0xFFFFFFFF"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: null 0  [ARG] :: 0xFFFFFFFF :: class java.lang.String ]} ] [ long {0=[ option: null 0  [ARG] :: 0xFFFFFFFF :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"?cc"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "<null>", "0", "true", "0xFFFFFFFF"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: null 0  [ARG] :: 0xFFFFFFFF :: class java.lang.String ]} ] [ long {0=[ option: null 0  [ARG] :: 0xFFFFFFFF :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"?cc"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "<null>", "0", "true", "0xFFFFFFFF"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ], 0=[ option: null 0  [ARG] :: 0xFFFFFFFF :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: c...#295#-256721057", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"?cc"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "<null>", "0", "true", "0xFFFFFFFF"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ], 0=[ option: null 0  [ARG] :: 0xFFFFFFFF :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: c...#295#-256721057", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"?cc"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"?cc"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "123456789012345678901234567890", "false", "1.5"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {123456789012345678901234567890=[ option: 123456789012345678901234567890  :: 1.5 :: class java.lang.String ], sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ l...#266#661731404", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{""}, false, 10, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "123456789012345678901234567890", "false", "1.5"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {123456789012345678901234567890=[ option: 123456789012345678901234567890  :: 1.5 :: class java.lang.String ], sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ l...#266#661731404", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"@"}, false, 8, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "TITLE", "false", "1.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {TITLE=[ option: TITLE  :: 1.5 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"ubc"}, false, 8, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"0x123456789--1", "true", "1L"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"+1", "true", "1{12"}, false, 8, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "2020-01-01", "[1,2]"}, {"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "helpOptions", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"0x11F\t", "C", "true", "Hello, World"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "http://example.com/a?b=c"}, {"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "1.5"}}, 2), new String[][]{{"getRequiredOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "2020-01-01"}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "1.5"}}, 2), new String[][]{{"getRequiredOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "2020-01-01"}, {"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "1.5"}}, 2), new String[][]{{"getRequiredOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "c,1"}}, 2), new String[][]{{"getMatchingOptions", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 2), new String[][]{{"getMatchingOptions", "java.lang.String", "0"}, {"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:8>"}, false, 12, new String[][]{}, 2), new String[][]{{"getMatchingOptions", "java.lang.String", "0"}, {"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 12, new String[][]{}, 2), new String[][]{{"getMatchingOptions", "java.lang.String", "6"}, {"listIterator", "", "3"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"_", "false", "PT1HJ"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {_=[ option: _  :: PT1HJ :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {_=[ option: _  :: PT1HJ :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"_X", "false", "PT1HJ"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {_X=[ option: _X  :: PT1HJ :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {_X=[ option: _X  :: PT1HJ :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "1.5e300", "0x12345678912"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "", "0x12345679"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "-0.0", "true", "0x123456789--1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: 0x12345679 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "1.5e300", "0x12345678912"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "", "0x12445679"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "\t", "true", "0x123456789--1"}}, 2), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: 0x12445679 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", ""}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}), new String[][]{{"getMatchingOptions", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "12:30:45"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"0xFFFFFFFF", "1.12345678901234567", "false", "010"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "true"}, {"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:0>"}}), new String[][]{{"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: 0xFFFFFFFF 1.12345678901234567  :: 010 :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF 1.12345678901234567  :: 010 :: class java.lang.String ]} ] [ long {1.12345678901234567=[ option: 0xFFFFFFFF 1.12345678901234567  :: 010 :: class jav...#218#1222956283", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false), new String[][]{{"getOptions", "", "4"}, {"size", "", "1"}, {"removeAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}}, 1), new String[][]{{"getOptions", "", "0"}, {"size", "", "1"}, {"removeAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "1.25"}, {"org.apache.commons.cli.Options", "toString", ""}}), new String[][]{{"hasShortOption", "java.lang.String", "3"}, {"addOption", "java.lang.String,java.lang.String", "3"}, {"hasShortOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample  ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}}), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}, {"org.apache.commons.cli.Options", "getOption", "java.lang.String", " ] [ long "}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "0x12345679", "1.12345678", "false", "0x1F"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0x12345679=[ option: 0x12345679 1.12345678  :: 0x1F :: class java.lang.String ]} ] [ long {1.12345678=[ option: 0x12345679 1.12345678  :: 0x1F :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x12345679=[ option: 0x12345679 1.12345678  :: 0x1F :: class java.lang.String ]} ] [ long {1.12345678=[ option: 0x12345679 1.12345678  :: 0x1F :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "0x12345679", "1.12345678", "false", "0x1F"}}, 2), new String[][]{{"addOption", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0x12345679=[ option: 0x12345679 1.12345678  :: 0x1F :: class java.lang.String ], 0=[ option: 0  :: sample :: class java.lang.String ]} ] [ long {1.12345678=[ option: 0x12345679 1.1...#247#486568834", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x12345679=[ option: 0x12345679 1.12345678  :: 0x1F :: class java.lang.String ], 0=[ option: 0  :: sample :: class java.lang.String ]} ] [ long {1.12345678=[ option: 0x12345679 1.1...#247#486568834", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:2>"}, false, 0, null, 2), new String[][]{{"addOption", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "5."}}), new String[][]{{"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "5.+1"}}), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], =[ option:   :: a ...#242#-1131935282", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"d ]"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "0x12345679"}, {"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "/a"}, {"org.apache.commons.cli.Options", "helpOptions", ""}}, 3), new String[][]{{"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "i", "Hello, World", "false", "1M"}}), new String[][]{{"size", "", "6"}, {"add", "java.lang.Object", "1"}, {"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {i=[ option: i Hello, World  :: 1M :: class java.lang.String ]} ] [ long {Hello, World=[ option: i Hello, World  :: 1M :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"[1,,2]"}, false, 11, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "2020-01-01"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "0x12345679", "-0.0"}, {"org.apache.commons.cli.Options", "helpOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x12345679=[ option: 0x12345679  :: -0.0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"Vb1.5e3/0"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "Title", "1.5f", "true", "1.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {Title=[ option: Title 1.5f  [ARG] :: 1.5 :: class java.lang.String ]} ] [ long {1.5f=[ option: Title 1.5f  [ARG] :: 1.5 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", "1e10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "[ Options: [ shoqt "}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", " ] [ long "}}, 2), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "[ Options: [ shoqt "}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}}, 2), new String[][]{{"indexOf", "java.lang.Object", "2"}, {"addAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "2147483648", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {2147483648=[ option: 2147483648  :: 0 :: class java.lang.String ]} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {2147483648=[ option: 2147483648  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<null>"}, {"org.apache.commons.cli.Options", "toString", ""}, {"org.apache.commons.cli.Options", "helpOptions", ""}}, 1), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<null>"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<null>"}, {"org.apache.commons.cli.Options", "helpOptions", ""}}, 1), new String[][]{{"addAll", "java.util.Collection", "4"}, {"remove", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<null>"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<null>"}, {"org.apache.commons.cli.Options", "helpOptions", ""}}, 1), new String[][]{{"addAll", "java.util.Collection", "4"}, {"remove", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: null ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
}
