package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArg", new String[]{"boolean"}, new String[]{"false"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArg", new String[]{"boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withValueSeparator", new String[]{"char"}, new String[]{"0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withValueSeparator", new String[]{"char"}, new String[]{"f"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withValueSeparator", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArgs", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withType", new String[]{"java.lang.Object"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArgs", new String[]{"int"}, new String[]{"-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{}, new String[]{}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"\000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: \000  :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasArgs=...#289#483207378", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{" "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option:    :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=32, getLongOpt=null, getOpt= , getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasArgs...#290#-1320177255", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{" "}, true, 0, null, 1), new String[][]{{"hasArgName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"E"}, true), new String[][]{{"hasArgName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"/"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withType", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "isRequired", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasOptionalArgs", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasOptionalArgs", new String[]{"int"}, new String[]{"0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"D"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: D  :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=68, getLongOpt=null, getOpt=D, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasArgs...#290#-259440618", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 1  :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=49, getLongOpt=null, getOpt=1, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasArgs...#290#1096288339", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 2  :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=50, getLongOpt=null, getOpt=2, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasArgs...#290#1206483741", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"2"}, true), new String[][]{{"getOpt", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withArgName", new String[]{"java.lang.String"}, new String[]{"--1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"=a>c</a>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"null"}, true, 0, null, 2), new String[][]{{"setDescription", "java.lang.String", "4"}, {"getOpt", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"cull"}, true, 0, null, 2), new String[][]{{"setDescription", "java.lang.String", "4"}, {"getOpt", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("cull", String.valueOf(actual));
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"ctll"}, true, 0, null, 2), new String[][]{{"setDescription", "java.lang.String", "4"}, {"getOpt", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ctll", String.valueOf(actual));
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"ctlm"}, true, 0, null, 2), new String[][]{{"setDescription", "java.lang.String", "4"}, {"getOpt", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ctlm", String.valueOf(actual));
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"cflm"}, true, 0, null, 2), new String[][]{{"setDescription", "java.lang.String", "4"}, {"getOpt", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("cflm", String.valueOf(actual));
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"flm"}, true, 0, null, 2), new String[][]{{"setDescription", "java.lang.String", "4"}, {"getOpt", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("flm", String.valueOf(actual));
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"f"}, true, 0, null, 2), new String[][]{{"setDescription", "java.lang.String", "4"}, {"getOpt", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("f", String.valueOf(actual));
 }
 public void testGeneratedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"\uffff"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"s"}, true, 0, null, 3), new String[][]{{"addValue", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withType", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasOptionalArgs", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withValueSeparator", new String[]{"char"}, new String[]{"a"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArg", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasOptionalArgs", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "isRequired", new String[]{"boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasOptionalArg", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArg", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArgs", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArgs", new String[]{"int"}, new String[]{"-7"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withValueSeparator", new String[]{"char"}, new String[]{"l"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withLongOpt", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withLongOpt", new String[]{"java.lang.String"}, new String[]{"-1-I"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"6"}, true, 0, null, 3), new String[][]{{"setValueSeparator", "char", "3"}, {"getArgs", "", "4"}, {"getValueSeparator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"a"}, true, 0, null, 3), new String[][]{{"setValueSeparator", "char", "3"}, {"getArgs", "", "4"}, {"getValueSeparator", "", "7"}, {"getValue", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option:   :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=fal...#318#1770942641", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"getValue", "", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"getValue", "", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArg", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArg", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasOptionalArgs", new String[]{"int"}, new String[]{"-42"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasOptionalArg", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArg", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withArgName", new String[]{"java.lang.String"}, new String[]{"--1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withArgName", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "isRequired", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArgs", new String[]{"int"}, new String[]{"-78"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"1M"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 1M  :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=49, getLongOpt=null, getOpt=1M, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasAr...#292#-1056663911", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"1a"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 1a  :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=49, getLongOpt=null, getOpt=1a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasAr...#292#672236481", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"1ra"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 1ra  :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=49, getLongOpt=null, getOpt=1ra, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, has...#294#-1542129677", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"1r"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 1r  :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=49, getLongOpt=null, getOpt=1r, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasAr...#292#1282808355", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withValueSeparator", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"b"}, true, 0, null, 3), new String[][]{{"setArgName", "java.lang.String", "0"}, {"hasArg", "", "2"}, {"setArgs", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: b [ARG...] :: null ] {getArgName=, getArgs=3, getDescription=null, getId=98, getLongOpt=null, getOpt=b, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, has...#293#1000457185", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"a"}, true, 0, null, 3), new String[][]{{"setArgName", "java.lang.String", "0"}, {"hasArg", "", "2"}, {"setArgs", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: a [ARG...] :: null ] {getArgName=, getArgs=3, getDescription=null, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, has...#293#-859832704", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withDescription", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasOptionalArgs", new String[]{"int"}, new String[]{"-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"\uffff"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"7"}, true, 0, null, 1), new String[][]{{"setRequired", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 7  :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=55, getLongOpt=null, getOpt=7, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasArgs...#289#-2097849775", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"e"}, true, 0, null, 1), new String[][]{{"setRequired", "boolean", "5"}, {"hasLongOpt", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "isRequired", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withArgName", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "isRequired", new String[]{"boolean"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasOptionalArg", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "isRequired", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"1e10"}, true, 0, null, 3), new String[][]{{"setType", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 1e10  :: null :: b ] {getArgName=arg, getArgs=-1, getDescription=null, getId=49, getLongOpt=null, getOpt=1e10, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=tr...#301#-81911539", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"1e00"}, true, 0, null, 3), new String[][]{{"setType", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 1e00  :: null :: b ] {getArgName=arg, getArgs=-1, getDescription=null, getId=49, getLongOpt=null, getOpt=1e00, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=tr...#301#-690019795", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withDescription", new String[]{"java.lang.String"}, new String[]{"\n"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withDescription", new String[]{"java.lang.String"}, new String[]{"arg"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withType", new String[]{"java.lang.Object"}, new String[]{"<i:645>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "isRequired", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"0"}, true, 0, null, 1), new String[][]{{"setArgName", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 0  :: null ] {getArgName=a, getArgs=-1, getDescription=null, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasArgs=f...#288#1069730015", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"9"}, true, 0, null, 1), new String[][]{{"setArgName", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 9  :: null ] {getArgName=a, getArgs=-1, getDescription=null, getId=57, getLongOpt=null, getOpt=9, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasArgs=f...#288#83703649", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"L"}, true, 0, null, 1), new String[][]{{"setArgName", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: L  :: null ] {getArgName=a, getArgs=-1, getDescription=null, getId=76, getLongOpt=null, getOpt=L, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasArgs=f...#288#899001956", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"abc"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: abc  :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=97, getLongOpt=null, getOpt=abc, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, has...#294#-1458620550", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"ue10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: ue10  :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=117, getLongOpt=null, getOpt=ue10, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, ...#297#1845042025", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"ue14http://example.com/a?b=c"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"u"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: u  :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=117, getLongOpt=null, getOpt=u, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasArg...#291#74799285", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"u"}, true, 0, null, 1), new String[][]{{"getDescription", "", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "isRequired", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArgs", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArg", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArg", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 3), new String[][]{{"isRequired", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 1), new String[][]{{"setArgs", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: a [ARG...] :: null ] {getArgName=arg, getArgs=3, getDescription=null, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=true, h...#295#-1542630259", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"setArgs", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option:  [ARG...] :: null ] {getArgName=arg, getArgs=3, getDescription=null, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, has...#323#402372060", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"1e10"}, true, 0, null, 1), new String[][]{{"setArgs", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 1e10 [ARG...] :: null ] {getArgName=arg, getArgs=3, getDescription=null, getId=49, getLongOpt=null, getOpt=1e10, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=t...#301#-72837396", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{}, new String[]{}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withValueSeparator", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withLongOpt", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withDescription", new String[]{"java.lang.String"}, new String[]{"<"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withLongOpt", new String[]{"java.lang.String"}, new String[]{"]"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"\uffff"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"?"}, true, 0, null, 2), new String[][]{{"getOpt", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"2"}, true, 0, null, 2), new String[][]{{"getOpt", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"1"}, true, 0, null, 2), new String[][]{{"getOpt", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"E"}, true, 0, null, 2), new String[][]{{"getOpt", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E", String.valueOf(actual));
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"X"}, true, 0, null, 2), new String[][]{{"getOpt", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X", String.valueOf(actual));
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"W"}, true, 0, null, 2), new String[][]{{"getOpt", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("W", String.valueOf(actual));
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"char"}, new String[]{"V"}, true, 0, null, 2), new String[][]{{"getOpt", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("V", String.valueOf(actual));
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasOptionalArg", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option:   :: null ] {getArgName=arg, getArgs=-1, getDescription=null, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=fal...#318#1770942641", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasOptionalArgs", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArgs", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withValueSeparator", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{}, new String[]{}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasOptionalArgs", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArgs", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
}
