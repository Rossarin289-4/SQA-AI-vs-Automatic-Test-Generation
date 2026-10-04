package generated.algorithm;

import junit.framework.TestCase;

public class BinaryParticleSwarmGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "false"}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "1"}, {"setSelected", "org.apache.commons.cli.Option", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[- a, -0 ] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- a, -0 ] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.AlreadySelectedException", thrown.getClass().getName());
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"0x1F", "\n a,b,c", "true", "a"}, false, 3, new String[][]{}, 1), new String[][]{{"hasOption", "java.lang.String", "1"}, {"getMatchingOptions", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x1F=[ option: 0x1F \n a,b,c  [ARG] :: a :: class java.lang.String ]} ] [ long {\n a,b,c=[ option: 0x1F \n a,b,c  [ARG] :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"I", "false", "+ "}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "a"}}), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "1"}, {"getOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: a  :: sample :: class java.lang.String ] {getArgName=null, getArgs=-1, getDescription=sample, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=...#322#1908511823", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {I=[ option: I  :: +  :: class java.lang.String ], a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"abc", "1.25"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}}), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "0"}, {"hasOption", "java.lang.String", "7"}, {"getOption", "java.lang.String", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {abc=[ option: abc  :: 1.25 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}), new String[][]{{"hasOption", "java.lang.String", "7"}, {"hasShortOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "1.5f"}, {"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}), new String[][]{{"hasOption", "java.lang.String", "2"}, {"getMatchingOptions", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"1", "false", "aaaaaaaaaaaaaaaaaaaaaaaaaa`aaa2147483648"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "-0.0aaaaaaaaaaaaaaaaaa8aaaaaaaaaaaa2020-01-01"}, {"org.apache.commons.cli.Options", "getOptions", ""}}, 1), new String[][]{{"hasShortOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 1=[ option: 1  :: ...#283#1951133703", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"10xFFFFFFFF", "1e10", "true", "5"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "0w1F", "true", "<a>b</a>Hello, World"}}, 3), new String[][]{{"getMatchingOptions", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[1e10]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0w1F=[ option: 0w1F  [ARG] :: <a>b</a>Hello, World :: class java.lang.String ], 10xFFFFFFFF=[ option: 10xFFFFFFFF 1e10  [ARG] :: 5 :: class java.lang.String ]} ] [ long {1e10=[ opt...#264#1601921969", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e1", "7TITLt"}, false, 0, null, 1), new String[][]{{"addOption", "java.lang.String,java.lang.String", "0"}, {"getOptionGroup", "org.apache.commons.cli.Option", "1"}, {"hasOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1e1=[ option: 1e1  :: 7TITLt :: class java.lang.String ], =[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "aaaaaaaaaaaaaaaaaa8aaaaaaaaaaaa"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"--0.0", "-1", "false", "-1ntrue"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"addAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasShortOption", "java.lang.String", " ] [ longcg "}}, 1), new String[][]{{"add", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"12r:30f:45"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"t>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "http://example.comna?b=c2147483648", "true", "-1n"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"J-1n"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"12:30:450", "true", "a"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:5>"}}, 2), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"\u00e9null"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"removeAll", "java.util.Collection", "7"}, {"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", ".5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}, {"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 1), new String[][]{{"isRequired", "", "3"}, {"isRequired", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 1), new String[][]{{"isRequired", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 a, -a 0] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "l[1,2]"}, {"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}, 1), new String[][]{{"getRequiredOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"addAll", "java.util.Collection", "0"}, {"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"0xFFFFFFFF1.5e300", "false", "----"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}}, 3), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "1.5e3/0"}}, 1), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "1E\r-5"}}, 1), new String[][]{{"hasOption", "java.lang.String", "4"}, {"hasShortOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-\000]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"mull]", "1.4d", "true", "2L"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "a/b"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "Tittle", "true", "abT"}}, 1), new String[][]{{"getRequiredOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {Tittle=[ option: Tittle  [ARG] :: abT :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<null>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 sample] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 sample] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"0x1234567889"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"TITLF", "true", "1.+234567890123456"}, false, 0, null, 3), new String[][]{{"hasLongOption", "java.lang.String", "6"}, {"hasShortOption", "java.lang.String", "7"}, {"getOption", "java.lang.String", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {TITLF=[ option: TITLF  [ARG] :: 1.+234567890123456 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "+1[ Options: [ short ", "a,b+c", "true", "T"}, {"org.apache.commons.cli.Options", "hasOption", "java.lang.String", ".-1-1"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 1), new String[][]{{"getOption", "java.lang.String", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "\r1.123", "false", "1.123467890123456"}}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", " ", "true", "1.1234567890123456"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}, {"org.apache.commons.cli.OptionGroup", "toString", ""}}, 3), new String[][]{{"setRequired", "boolean", "2"}, {"setRequired", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"02F", "false", "d"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {02F=[ option: 02F  :: d :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {02F=[ option: 02F  :: d :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{",\n-1"}, false, 6, new String[][]{}, 3), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.OptionGroup", "getNames", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 3, new String[][]{}, 1), new String[][]{{"getMatchingOptions", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"\\a"}, false, 0, null, 3), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 3), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "4"}, {"hasOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "3"}, {"getOptions", "", "2"}, {"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "\r\\", "true", "2147483648"}}, 1), new String[][]{{"getOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ], [ option: \000  :: null :: class java.lang.Str...#206#-70151386", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], \000=[ option: \000  :: ...#247#1411123948", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"0xFFFFFFFFF", "1.5f1L", "true", "a"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], 0xFFFFFFFFF=[ option: 0xFFFFFFFFF 1.5f1L  [ARG] :: a :: class java.lang.String ]} ] [ long {1.5f1L=[ option: 0xFFFFFFFFF 1.5f1L ...#242#-2116429860", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], 0xFFFFFFFFF=[ option: 0xFFFFFFFFF 1.5f1L  [ARG] :: a :: class java.lang.String ]} ] [ long {1.5f1L=[ option: 0xFFFFFFFFF 1.5f1L ...#242#-2116429860", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 3), new String[][]{{"addOption", "java.lang.String,java.lang.String", "4"}, {"getRequiredOptions", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"retainAll", "java.util.Collection", "0"}, {"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1E--5", ", 1L", "false", "12:20:45"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "\u00e9", "true", "1e10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"10", "Hdlln, World", "false", "I"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {10=[ option: 10 Hdlln, World  :: I :: class java.lang.String ]} ] [ long {Hdlln, World=[ option: 10 Hdlln, World  :: I :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {10=[ option: 10 Hdlln, World  :: I :: class java.lang.String ]} ] [ long {Hdlln, World=[ option: 10 Hdlln, World  :: I :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "toString", ""}}, 1), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasLongOption", new String[]{"java.lang.String"}, new String[]{"-1n"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{"\\"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}}), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"TITLF", "2147483648", "false", "aaaaaaaaaaaaaaaaaa8aaaaaaaaaaaanull"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {TITLF=[ option: TITLF 2147483648  :: aaaaaaaaaaaaaaaaaa8aaaaaaaaaaaanull :: class java.lang.String ]} ] [ long {2147483648=[ option: TITLF 2147483648  :: aaaaaaaaaaaaaaaaaa8aaaaaaa...#240#1729915587", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {TITLF=[ option: TITLF 2147483648  :: aaaaaaaaaaaaaaaaaa8aaaaaaaaaaaanull :: class java.lang.String ]} ] [ long {2147483648=[ option: TITLF 2147483648  :: aaaaaaaaaaaaaaaaaa8aaaaaaa...#240#1729915587", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"12:30:45a,b,c", "false", ",  "}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"remove", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"removeAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "1.1234g67", "true", "+1"}}), new String[][]{{"get", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "getOptions", ""}}), new String[][]{{"getRequiredOptions", "", "6"}, {"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"http://example.cpm/a?b=c", "[aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "true", "P41H"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "0xFFFFPFFFF"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false), new String[][]{{"getRequiredOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasShortOption", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"iterator", "", "2"}, {"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[[ option: sample   [ARG] :: 0 :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "4"}, {"setRequired", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:10>"}, false), new String[][]{{"isRequired", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "", "0x12345?789", "true", "}.5f"}}), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:  0x12345?789  [ARG] :: }.5f :: class java.lang.String ]} ] [ long {0x12345?789=[ option:  0x12345?789  [ARG] :: }.5f :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false), new String[][]{{"addOption", "org.apache.commons.cli.Option", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "00-"}, {"org.apache.commons.cli.Options", "getOption", "java.lang.String", "5.^"}}), new String[][]{{"addAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"J", "true", "1.25"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {J=[ option: J  [ARG] :: 1.25 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {J=[ option: J  [ARG] :: 1.25 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"5."}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:1>"}, false), new String[][]{{"addOption", "java.lang.String,java.lang.String", "7"}, {"addOption", "java.lang.String,boolean,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {sample=[ option: sample  ::  :: class java.lang.String ], a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample  ::  :: class java.lang.String ], a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}), new String[][]{{"setRequired", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}}), new String[][]{{"iterator", "", "0"}, {"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 3, new String[][]{}), new String[][]{{"setRequired", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0.0true", "1d101.1234567"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "II", "false", "xFFFFFFFF"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"1c10", "false", "-1.5-1n"}, false), new String[][]{{"getOptions", "", "6"}, {"add", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"abb", "1.12345678901234561"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {abb=[ option: abb  :: 1.12345678901234561 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {abb=[ option: abb  :: 1.12345678901234561 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false), new String[][]{{"remove", "java.lang.Object", "3"}, {"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.OptionGroup", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-0 a] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"^]"}, false), new String[][]{{"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}}), new String[][]{{"isRequired", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 a] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:7>"}, false), new String[][]{{"hasShortOption", "java.lang.String", "3"}, {"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:4>"}, false), new String[][]{{"getRequiredOptions", "", "2"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[- 0] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "6"}, {"getOption", "java.lang.String", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:7>"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 , - a] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 , - a] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1L5."}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "[1,02]i", "1L<a>b=/a>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   :: 1L5. :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: 1L5. :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "/a/b5.", "true", "1-.1234567"}}), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false), new String[][]{{"hasOption", "java.lang.String", "5"}, {"addOption", "java.lang.String,boolean,java.lang.String", "3"}, {"addOption", "java.lang.String,boolean,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {sample=[ option: sample  :: a :: class java.lang.String ], a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample  :: a :: class java.lang.String ], a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", "[ Options: [ short "}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "12:30:L5", "lL"}}), new String[][]{{"addOption", "java.lang.String,java.lang.String", "0"}, {"hasLongOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], =[ option:   :: a ...#242#-1131935282", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"1.12445<7890123456"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}), new String[][]{{"retainAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:6>"}}), new String[][]{{"setRequired", "boolean", "1"}, {"addOption", "org.apache.commons.cli.Option", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 ] {getSelected=\000, isRequired=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"0010", "123456789012345678901234567890", "true", "2"}, false, 4, new String[][]{}), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 0010=[ option: 001...#403#1677665804", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 0010=[ option: 001...#403#1677665804", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:2>"}, false), new String[][]{{"getMatchingOptions", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.St...#209#1589911799", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.St...#209#1589911799", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "0xFFFFFFFF", "1.>", "false", ""}}), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF 1.>  ::  :: class java.lang.String ], =[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {1.>=[ option: 0xFFFFFFFF 1.>  ::  :: class java...#217#46816505", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFF=[ option: 0xFFFFFFFF 1.>  ::  :: class java.lang.String ], =[ option:   [ARG] :: 0 :: class java.lang.String ]} ] [ long {1.>=[ option: 0xFFFFFFFF 1.>  ::  :: class java...#217#46816505", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"[1,2]\n"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.AlreadySelectedException", thrown.getClass().getName());
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}), new String[][]{{"iterator", "", "4"}, {"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"0x123456789", "1", "true", "aaaaaaaaa"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0x123456789=[ option: 0x123456789 1  [ARG] :: aaaaaaaaa :: class java.lang.String ]} ] [ long {1=[ option: 0x123456789 1  [ARG] :: aaaaaaaaa :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x123456789=[ option: 0x123456789 1  [ARG] :: aaaaaaaaa :: class java.lang.String ]} ] [ long {1=[ option: 0x123456789 1  [ARG] :: aaaaaaaaa :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}}), new String[][]{{"addOption", "java.lang.String,java.lang.String", "1"}, {"hasOption", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"1e20", "false", "\u00e9 "}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "11.5"}}), new String[][]{{"getOption", "java.lang.String", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {1e20=[ option: 1e20  :: \u00e9  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{" ] [ longcg 0x12345689"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", " ] Z lon?g "}}), new String[][]{{"indexOf", "java.lang.Object", "7"}, {"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}), new String[][]{{"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: \000  :: null :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"", "false", "Fi"}, false, 3, new String[][]{}), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "3"}, {"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option:   :: Fi :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: Fi :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:6>"}, false, 0, null, 3), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:3>"}}), new String[][]{{"addOption", "java.lang.String,java.lang.String", "4"}, {"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option:   :: a :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: 0 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 1), new String[][]{{"isRequired", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 1), new String[][]{{"setRequired", "boolean", "0"}, {"addOption", "org.apache.commons.cli.Option", "0"}, {"getNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeySet", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- a, -a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"PT1HH", "--1", "false", "2020-02-30T25:6"}, false, 5, new String[][]{}, 1), new String[][]{{"getOptions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: PT1HH --1  :: 2020-02-30T25:6 :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {PT1HH=[ option: PT1HH --1  :: 2020-02-30T25:6 :: class java.lang.String ]} ] [ long {--1=[ option: PT1HH --1  :: 2020-02-30T25:6 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[[ option: 0  [ARG] ::  :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:7>"}}), new String[][]{{"isEmpty", "", "4"}, {"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}, 1), new String[][]{{"addOption", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"2L", "false", "9020"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}, {"org.apache.commons.cli.Options", "getRequiredOptions", ""}}), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ], 2L=[ option: 2L  :: 9020 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ], 2L=[ option: 2L  :: 9020 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "0"}, {"getRequiredOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I", "0x123456789"}, false, 1, new String[][]{}), new String[][]{{"hasOption", "java.lang.String", "0"}, {"getRequiredOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {I=[ option: I  :: 0x123456789 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}, 2), new String[][]{{"addOption", "org.apache.commons.cli.Option", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], \000=[ option: \000  :: ...#362#-794454538", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], \000=[ option: \000  :: ...#362#-794454538", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}), new String[][]{{"clear", "", "5"}, {"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 1), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ], 0=[ option: 0 samp...#310#471152788", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}, {"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "{\"a\":1}"}}, 1), new String[][]{{"addOption", "org.apache.commons.cli.Option", "2"}, {"addOption", "java.lang.String,boolean,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   :: a :: class java.lang.String ], sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ], a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {=[ ...#258#904255360", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ], sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ], a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {=[ ...#258#904255360", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"t", "0x12456789", "false", "1.251.12345678"}, false, 1, new String[][]{}, 1), new String[][]{{"addOption", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {t=[ option: t 0x12456789  :: 1.251.12345678 :: class java.lang.String ], =[ option:   :: a :: class java.lang.String ]} ] [ long {0x12456789=[ option: t 0x12456789  :: 1.251.123456...#233#1184090521", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {t=[ option: t 0x12456789  :: 1.251.12345678 :: class java.lang.String ], =[ option:   :: a :: class java.lang.String ]} ] [ long {0x12456789=[ option: t 0x12456789  :: 1.251.123456...#233#1184090521", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<null>"}}), new String[][]{{"iterator", "", "5"}, {"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroup", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:8>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"", "1.4e", "false", "\n"}, false, 0, null, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:  1.4e  :: \n :: class java.lang.String ]} ] [ long {1.4e=[ option:  1.4e  :: \n :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:  1.4e  :: \n :: class java.lang.String ]} ] [ long {1.4e=[ option:  1.4e  :: \n :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}), new String[][]{{"containsAll", "java.util.Collection", "1"}, {"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"12:300:45"}, false, 7, new String[][]{}, 1), new String[][]{{"indexOf", "java.lang.Object", "1"}, {"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"123456789012345678901234567890", "true", "a b"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "\010", "true", "1E-5"}}), new String[][]{{"getRequiredOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\010=[ option: \010  [ARG] :: 1E-5 :: class java.lang.String ], 123456789012345678901234567890=[ option: 123456789012345678901234567890  [ARG] :: a b :: class java.lang.String ]} ] [ lon...#206#-1721983892", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"", "{--", "true", "1H12345678901234567"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "\t"}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "0x1Fnull"}}), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "1"}, {"addOptionGroup", "org.apache.commons.cli.OptionGroup", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:  {--  [ARG] :: 1H12345678901234567 :: class java.lang.String ]} ] [ long {{--=[ option:  {--  [ARG] :: 1H12345678901234567 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:  {--  [ARG] :: 1H12345678901234567 :: class java.lang.String ]} ] [ long {{--=[ option:  {--  [ARG] :: 1H12345678901234567 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 2), new String[][]{{"isRequired", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "1.123456789/123756", "true", "htup://example.comna?b=c2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-\000] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 1), new String[][]{{"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"aabaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Full", "true", "5"}, false, 3, new String[][]{}), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {aabaaaaaaaaaaaaaaaaaaaaaaaaaaa=[ option: aabaaaaaaaaaaaaaaaaaaaaaaaaaaa Full  [ARG] :: 5 :: class java.lang.String ], a=[ option: a  :: sample :: class java.lang.String ]} ] [ long...#295#123980084", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {aabaaaaaaaaaaaaaaaaaaaaaaaaaaa=[ option: aabaaaaaaaaaaaaaaaaaaaaaaaaaaa Full  [ARG] :: 5 :: class java.lang.String ], a=[ option: a  :: sample :: class java.lang.String ]} ] [ long...#295#123980084", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xGFFFFFFF", "1-5d1"}, false, 7, new String[][]{}), new String[][]{{"hasOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xGFFFFFFF=[ option: 0xGFFFFFFF  :: 1-5d1 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-0 ] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"i", "2020-02-30T25:61:61, \u00e9"}, false, 6, new String[][]{}, 1), new String[][]{{"getMatchingOptions", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {i=[ option: i  :: 2020-02-30T25:61:61, \u00e9 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"contains", "java.lang.Object", "3"}, {"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-0 sample] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 3), new String[][]{{"setRequired", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1147483648", ",\037<a>b</a>", "false", "http://example.cool/a?b=c"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {1147483648=[ option: 1147483648 ,\037<a>b</a>  :: http://example.cool/a?b=c :: class java.lang.String ]} ] [ long {,\037<a>b</a>=[ option: 1147483648 ,\037<a>b</a>  :: http://example.cool/a...#235#-2138239519", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1147483648=[ option: 1147483648 ,\037<a>b</a>  :: http://example.cool/a?b=c :: class java.lang.String ]} ] [ long {,\037<a>b</a>=[ option: 1147483648 ,\037<a>b</a>  :: http://example.cool/a...#235#-2138239519", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"getNames", "", "3"}, {"retainAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"0xFFFFFFFE", "true", "a,b,,c"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "hasLongOption", "java.lang.String", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0xFFFFFFFE=[ option: 0xFFFFFFFE  [ARG] :: a,b,,c :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0xFFFFFFFE=[ option: 0xFFFFFFFE  [ARG] :: a,b,,c :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"1", "+\t1.5f", "true", "[ Options: [ short "}, false), new String[][]{{"getMatchingOptions", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {1=[ option: 1 +\t1.5f  [ARG] :: [ Options: [ short  :: class java.lang.String ]} ] [ long {+\t1.5f=[ option: 1 +\t1.5f  [ARG] :: [ Options: [ short  :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"TITL", "true", "2020-02-30T25:51:61"}, false, 5, new String[][]{}, 1), new String[][]{{"addOption", "java.lang.String,java.lang.String", "1"}, {"getOptionGroup", "org.apache.commons.cli.Option", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {TITL=[ option: TITL  [ARG] :: 2020-02-30T25:51:61 :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,boolean,java.lang.String", "5.", "true", "1-5e3000"}}, 1), new String[][]{{"addOption", "org.apache.commons.cli.Option", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Y", "JTitle"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "aaaaaaaaaaaaaaaaaa8aaaaaaaaaaaa1.5f"}}, 3), new String[][]{{"addOption", "org.apache.commons.cli.Option", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {Y=[ option: Y  :: JTitle :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {Y=[ option: Y  :: JTitle :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 0, null, 2), new String[][]{{"addOption", "org.apache.commons.cli.Option", "1"}, {"getNames", "", "3"}, {"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"", "<`lb</a>", "true", "-0\t0/a/b"}, false, 3, new String[][]{}), new String[][]{{"getRequiredOptions", "", "1"}, {"addAll", "int,java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, null, 1), new String[][]{{"setSelected", "org.apache.commons.cli.Option", "1"}, {"setRequired", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-a 0] {getSelected=0, isRequired=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-a 0] {getSelected=0, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"12345678901234567890123456780", "true", "1htt://example.com/a?b=c"}, false, 5, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:1>"}}), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "0"}, {"hasShortOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {12345678901234567890123456780=[ option: 12345678901234567890123456780  [ARG] :: 1htt://example.com/a?b=c :: class java.lang.String ], =[ option:   [ARG] :: 0 :: class java.lang.Str...#220#-1148488452", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"HI", "?"}, false, 2, new String[][]{}), new String[][]{{"getOptions", "", "1"}, {"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {HI=[ option: HI  :: ? :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"H", "false", ""}, false), new String[][]{{"getRequiredOptions", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {H=[ option: H  ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"getMatchingOptions", "java.lang.String", "1"}, {"addAll", "java.util.Collection", "4"}, {"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", "\013"}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "0"}, {"addOption", "java.lang.String,boolean,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, null, 3), new String[][]{{"contains", "java.lang.Object", "1"}, {"isEmpty", "", "4"}, {"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"0x123456789", "true", "http://example.com/a?b=c"}, false, 1, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 3), new String[][]{{"addOption", "org.apache.commons.cli.Option", "2"}, {"hasLongOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x123456789=[ option: 0x123456789  [ARG] :: http://example.com/a?b=c :: class java.lang.String ], sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ opt...#255#939000208", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010", "214748364H8"}, false), new String[][]{{"addOption", "org.apache.commons.cli.Option", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {010=[ option: 010  :: 214748364H8 :: class java.lang.String ], 0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {010=[ option: 010  :: 214748364H8 :: class java.lang.String ], 0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"0x123456789", "\\<a>b</a>", "false", "12:30945"}, false, 5, new String[][]{}), new String[][]{{"hasOption", "java.lang.String", "0"}, {"hasOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0x123456789=[ option: 0x123456789 \\<a>b</a>  :: 12:30945 :: class java.lang.String ]} ] [ long {\\<a>b</a>=[ option: 0x123456789 \\<a>b</a>  :: 12:30945 :: class java.lang.String ]} ...#201#-1333405355", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLF", " ] [ long 12:30:45"}, false, 6, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", "1.,5", ""}}), new String[][]{{"hasOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {TITLF=[ option: TITLF  ::  ] [ long 12:30:45 :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"2147483648", "false", "1.123456L78"}, false, 0, null, 2), new String[][]{{"addOption", "org.apache.commons.cli.Option", "6"}, {"addOption", "org.apache.commons.cli.Option", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {2147483648=[ option: 2147483648  :: 1.123456L78 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {2147483648=[ option: 2147483648  :: 1.123456L78 :: class java.lang.String ], \000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a c", "..5d"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "214"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"TITLE", "false", "a,b,c"}, false, 2, new String[][]{{"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String,boolean,java.lang.String", "123456789012345678x012344567890", "11", "true", ".1n"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {123456789012345678x012344567890=[ option: 123456789012345678x012344567890 11  [ARG] :: .1n :: class java.lang.String ], TITLE=[ option: TITLE  :: a,b,c :: class java.lang.String ]}...#303#-5396036", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {123456789012345678x012344567890=[ option: 123456789012345678x012344567890 11  [ARG] :: .1n :: class java.lang.String ], TITLE=[ option: TITLE  :: a,b,c :: class java.lang.String ]}...#303#-5396036", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "3"}, {"addOption", "java.lang.String,boolean,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}}), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "\\"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {=[ option:   :: \\ :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:   :: \\ :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOptionGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroups", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"<null>", " ] [ lonpgcg ", "true", "\u00e8Hello, World"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "-1"}}), new String[][]{{"hasOption", "java.lang.String", "6"}, {"getRequiredOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ],  ] [ lonpgcg =[ op...#385#-261692710", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-0 a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"TITL", "false", "1e20"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "getOption", "java.lang.String", " ] [ mongcg "}, {"org.apache.commons.cli.Options", "getMatchingOptions", "java.lang.String", ".5"}}), new String[][]{{"hasLongOption", "java.lang.String", "0"}, {"addOption", "java.lang.String,boolean,java.lang.String", "7"}, {"getOptions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: TITL  :: 1e20 :: class java.lang.String ], [ option: sample  :: a :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {TITL=[ option: TITL  :: 1e20 :: class java.lang.String ], sample=[ option: sample  :: a :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--11.5d", "2147483648aaaaaaaaaaaaaaaaaa8aaaaaaaaaaaa"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "getOptionGroup", "org.apache.commons.cli.Option", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 1), new String[][]{{"addOption", "org.apache.commons.cli.Option", "5"}, {"addOption", "java.lang.String,boolean,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ], a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]}...#202#573859692", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0 sample  :: a :: class java.lang.String ], a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {sample=[ option: 0 sample  :: a :: class java.lang.String ]}...#202#573859692", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {sample=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ] [ long {=[ option: sample   [ARG] :: 0 :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"TITLE", "Pp", "true", "aaaaaaaaaaaaaaaaaa8aaaaaaaaaaaanull"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}), new String[][]{{"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: TITLE Pp  [ARG] :: aaaaaaaaaaaaaaaaaa8aaaaaaaaaaaanull :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {TITLE=[ option: TITLE Pp  [ARG] :: aaaaaaaaaaaaaaaaaa8aaaaaaaaaaaanull :: class java.lang.String ]} ] [ long {Pp=[ option: TITLE Pp  [ARG] :: aaaaaaaaaaaaaaaaaa8aaaaaaaaaaaanull ::...#228#244554711", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 1), new String[][]{{"setSelected", "org.apache.commons.cli.Option", "7"}, {"getSelected", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"", "[11]", "true", " "}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "1.1234567890123456"}}), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {=[ option:  [11]  [ARG] ::   :: class java.lang.String ]} ] [ long {[11]=[ option:  [11]  [ARG] ::   :: class java.lang.String ]} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOptionGroup", new String[]{"org.apache.commons.cli.OptionGroup"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}, 2), new String[][]{{"addOption", "org.apache.commons.cli.Option", "1"}, {"getOption", "java.lang.String", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {0=[ option: 0  [ARG] ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "java.lang.String", "boolean", "java.lang.String"}, new String[]{"i", "\n0.01", "true", "1.5e"}, false, 3, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "-e"}, {"org.apache.commons.cli.Options", "addOption", "java.lang.String,java.lang.String", ".5", ""}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "0"}, {"getMatchingOptions", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[\n0.01]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {i=[ option: i \n0.01  [ARG] :: 1.5e :: class java.lang.String ], a=[ option: a  :: 0 :: class java.lang.String ]} ] [ long {\n0.01=[ option: i \n0.01  [ARG] :: 1.5e :: class java.lang...#212#-1323749248", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "hasOption", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 0, null, 1), new String[][]{{"addOption", "org.apache.commons.cli.Option", "4"}, {"addOption", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], sample=[ option: sample  ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], sample=[ option: sample  ::  :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 2), new String[][]{{"setRequired", "boolean", "1"}, {"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[[ option: a  :: 0 :: class java.lang.String ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-a 0] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "helpOptions", ""}}, 2), new String[][]{{"addAll", "int,java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"java.lang.String", "boolean", "java.lang.String"}, new String[]{"Title", "true", "[ 7Options: [ short a,b,c"}, false, 6, new String[][]{}, 1), new String[][]{{"hasLongOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {Title=[ option: Title  [ARG] :: [ 7Options: [ short a,b,c :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "helpOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "1e10"}, {"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<sample:6>"}}), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getMatchingOptions", new String[]{"java.lang.String"}, new String[]{"0x123456789TITLE"}, false, 7, new String[][]{{"org.apache.commons.cli.Options", "addOptionGroup", "org.apache.commons.cli.OptionGroup", "<null>"}}), new String[][]{{"isEmpty", "", "3"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getOption", new String[]{"java.lang.String"}, new String[]{"5.12:30:45"}, false, 4, new String[][]{{"org.apache.commons.cli.Options", "hasOption", "java.lang.String", "1.123456782020-02-3T25:61:61"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Options", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ Options: [ short {\000=[ option: \000  :: null :: class java.lang.String ], a=[ option: a  :: sample :: class java.lang.String ]} ] [ long {} ]", SearchInputFactory_scaffolding.receiverState());
 }
}
