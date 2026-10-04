package generated.algorithm;

import junit.framework.TestCase;

public class BinaryParticleSwarmGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.AlreadySelectedException", thrown.getClass().getName());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}), new String[][]{{"setSelected", "org.apache.commons.cli.Option", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[- 0] {getSelected=, isRequired=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- 0] {getSelected=, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}}), new String[][]{{"setSelected", "org.apache.commons.cli.Option", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[- 0, -sample 0] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- 0, -sample 0] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}}, 2), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 1), new String[][]{{"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}}, 3), new String[][]{{"setSelected", "org.apache.commons.cli.Option", "7"}, {"isRequired", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 1), new String[][]{{"getNames", "", "7"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 , -\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 2), new String[][]{{"getOptions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[[ option: 0 sample  :: a ], [ option: sample   [ARG] :: 0 ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 a, -sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "false"}}, 2), new String[][]{{"isEmpty", "", "0"}, {"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 2), new String[][]{{"clear", "", "5"}, {"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 2), new String[][]{{"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 a] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}}, 3), new String[][]{{"setSelected", "org.apache.commons.cli.Option", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000 null] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, null, 3), new String[][]{{"getOptions", "", "0"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:9>"}, false, 1, new String[][]{}, 3), new String[][]{{"setSelected", "org.apache.commons.cli.Option", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 sample] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 sample] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}}, 2), new String[][]{{"setSelected", "org.apache.commons.cli.Option", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000 null] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 2), new String[][]{{"addOption", "org.apache.commons.cli.Option", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 , - 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 , - 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 1), new String[][]{{"isRequired", "", "0"}, {"getSelected", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-sample 0] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 3), new String[][]{{"addOption", "org.apache.commons.cli.Option", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 , -sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 , -sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000 null] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}}, 2), new String[][]{{"getSelected", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-\000 null, -0 sample] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"getSelected", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 2), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}, {"org.apache.commons.cli.OptionGroup", "toString", ""}}, 2), new String[][]{{"retainAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 2), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 0, null, 1), new String[][]{{"setRequired", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000 null] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 2), new String[][]{{"isRequired", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "getNames", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 1), new String[][]{{"addOption", "org.apache.commons.cli.Option", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000 null, -sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null, -sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 3), new String[][]{{"iterator", "", "2"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"setRequired", "boolean", "1"}, {"getSelected", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}, {"org.apache.commons.cli.OptionGroup", "toString", ""}}, 1), new String[][]{{"isRequired", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:8>"}, false, 7, new String[][]{}, 3), new String[][]{{"setRequired", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000 null] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 3), new String[][]{{"retainAll", "java.util.Collection", "6"}, {"add", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 2), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$ValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"setSelected", "org.apache.commons.cli.Option", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[- a] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"removeAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:6>"}}, 2), new String[][]{{"remove", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "false"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false), new String[][]{{"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[[ option:   :: a ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false), new String[][]{{"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-a 0] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-a 0] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}), new String[][]{{"setRequired", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}), new String[][]{{"getSelected", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"addAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "getOptions", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000 null, -0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null, -0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}, {"org.apache.commons.cli.OptionGroup", "getSelected", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "3"}, {"getNames", "", "4"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 , - a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}}), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}), new String[][]{{"getOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[[ option: \000  :: null ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false), new String[][]{{"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[[ option: 0  [ARG] ::  ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "5"}, {"setSelected", "org.apache.commons.cli.Option", "7"}, {"addOption", "org.apache.commons.cli.Option", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-0 a, -\000 null] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 a, -\000 null] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}}), new String[][]{{"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[[ option: sample   [ARG] :: 0 ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "3"}, {"size", "", "4"}, {"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}), new String[][]{{"containsAll", "java.util.Collection", "3"}, {"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}, {"org.apache.commons.cli.OptionGroup", "isRequired", ""}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionGroup", actual.getClass().getName());
  assertEquals("[-\000 null, - 0] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null, - 0] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}, {"org.apache.commons.cli.OptionGroup", "getNames", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}}), new String[][]{{"retainAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "addOption", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false), new String[][]{{"getSelected", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}}), new String[][]{{"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$ValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}, {"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.OptionGroup", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-sample 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}, {"org.apache.commons.cli.OptionGroup", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}), new String[][]{{"contains", "java.lang.Object", "6"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$ValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[[ option: 0  [ARG] ::  ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<null>"}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[\000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}, {"org.apache.commons.cli.OptionGroup", "getSelected", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}}), new String[][]{{"removeAll", "java.util.Collection", "3"}, {"removeAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[[ option:   [ARG] :: 0 ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 1), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.OptionGroup", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[[ option: sample   [ARG] :: 0 ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}}, 3), new String[][]{{"addAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}}, 1), new String[][]{{"retainAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$ValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}}, 1), new String[][]{{"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.AlreadySelectedException", thrown.getClass().getName());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-0 a] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 1), new String[][]{{"remove", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 3), new String[][]{{"iterator", "", "4"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "false"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "false"}}, 2), new String[][]{{"iterator", "", "4"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}}, 2), new String[][]{{"removeAll", "java.util.Collection", "3"}, {"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}, {"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-0 ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 2), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}, {"org.apache.commons.cli.OptionGroup", "toString", ""}}, 2), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$ValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:8>"}}, 1), new String[][]{{"removeAll", "java.util.Collection", "0"}, {"retainAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.OptionGroup", "getNames", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}}, 2), new String[][]{{"isEmpty", "", "4"}, {"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.AlreadySelectedException", thrown.getClass().getName());
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:8>"}}, 3), new String[][]{{"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 3), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$ValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[\000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 3), new String[][]{{"removeAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:6>"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "2"}, {"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}, {"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "false"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}, {"org.apache.commons.cli.OptionGroup", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}}, 3), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-0 sample] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-\000 null, - 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-\000 null, - 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:8>"}}, 1), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "isRequired", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.AlreadySelectedException", thrown.getClass().getName());
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}, {"org.apache.commons.cli.OptionGroup", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.OptionGroup", "toString", ""}}, 1), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:6>"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}}, 1), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 1), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.OptionGroup", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}}, 3), new String[][]{{"remove", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "false"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[\000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getSelected", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}, 3), new String[][]{{"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setSelected", new String[]{"org.apache.commons.cli.Option"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-\000 null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:6>"}}, 3), new String[][]{{"retainAll", "java.util.Collection", "3"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "isRequired", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:8>"}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}, {"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[[ option: \000  :: null ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "getNames", ""}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}}, 3), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[[ option: \000  :: null ]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}, {"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}, {"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}, {"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}, {"org.apache.commons.cli.OptionGroup", "isRequired", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[- a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[- 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}, {"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-a 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-a 0] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "false"}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:9>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[-0 sample] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-sample 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-0 a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:8>"}, {"org.apache.commons.cli.OptionGroup", "getOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[- 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[- a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=sample, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "getSelected", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[- 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.OptionGroup", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-0 a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:3>"}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-\000 null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:5>"}, {"org.apache.commons.cli.OptionGroup", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-0 ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "toString", ""}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-\000 null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "getOptions", ""}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-0 a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[- a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- a] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-a 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.OptionGroup", "setSelected", "org.apache.commons.cli.Option", "<sample:0>"}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[- 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[- 0] {getSelected=a, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:4>"}, {"org.apache.commons.cli.OptionGroup", "getSelected", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-\000 null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-\000 null] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.OptionGroup", "setRequired", "boolean", "true"}, {"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-0 ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-0 ] {getSelected=null, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-sample 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-sample 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionGroup", "org.apache.commons.cli.OptionGroup", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.OptionGroup", "addOption", "org.apache.commons.cli.Option", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[-a 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-a 0] {getSelected=null, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
