package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=2020-01-01, getOptPrefix=, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"dc", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "2147483647", "", "9ntre744t", "<sample:5>", "-1073741736", "-2147483648", "\n", "false"}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "b b"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "a7{c", "<sample:4>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "2147483647", "\n\n", "1x}20\rZ1,,2]1.1244{5678901c334568", "<sample:1>", "5", "0", "\u00e9", "false"}, false, 8, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "-2..5\n22020-02-30T2:61:61Tiptle", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:0>", "4", "T-0.0", "1.5e300", "<sample:4>", "-30", "30", "e+PU\"E"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", " | ", "B", "<sample:5>", "-.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "2", "\013<IITF\n.--L1-111K\t1.5e300", ".1.}}30\rZ1+,2]1/124E4 5L789", "<sample:2>", "-2147482603", "4", ".1_/10\rZb1,2", "false"}, false, 9, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "\01371.\t234567W90123456", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:1>"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "18", "linf.sfeparatto", "   ", "<sample:5>", "1.1234567890123456", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<null>", "2", "<sample:1>", "-4", "-2147482603"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<empty>", "-74", "<null>", "W1.}}30\rZ1+,2P]1/134E4 5L789", "<sample:9>", "-74", "-2147483648", "1.5e300"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"1<aa>b</a>", "a,b+c", "<sample:4>", "[1,2]", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:2>", "18", "\013<IITF|\n.--.L1-111KK\t1.5e30074\t", "xJ5a\r,b,c0", "<sample:0>", "2", "28", "1.5d"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "linf.seeparator"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=linf.seeparator, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{".1.}}30\rZ1+,2]1/124E4 5L789", "3", "2"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-2, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"-0.0I1.1234567890123456"}, false, 12, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "1073741818"}, {"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "[1,2]"}, {"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0I1.1234567890123456", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=[1,2], getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=1073741818}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"22", " pGWe`Kl-o, World", "si1L.[21.<1344561L", "<sample:4>", "", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "32776"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "-2147482653", "74", "TITLE", "<sample:2>", " ", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "3", "J\r,,c", " ", "<sample:2>", ","}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=32776, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"1.5d", " <", "<sample:2>", "5."}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "2"}, {"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "0x1F"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=0x1F, getDescPadding=2, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:0>", "4", "2020-02-30T25:61:61", "{\"a\":1}", "<sample:1>", "75", "10", "1.5e300", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"10", "linf.seeparator", "214647936a", "<sample:1>", "`"}, false, 12, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "0", "[", "a b", "<sample:1>", "a b"}, {"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"72", "linf.sfepasatto", "1.25", "<sample:0>", "]"}, false, 12, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"72", "linf.sfepasatto", "--1", "<sample:0>", ""}, false, 12, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "usage: ", "2147483647", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"\u00e9null", "abc", "<sample:5>", "1L", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "H"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=H, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"\u00ebnull", "`dc", "<sample:4>", "1L.5", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "H"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=H, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"\u00ebelllnull", "dc", "<sample:4>", "1L.5", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "3"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "H"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"\u00ebdelllnll-0.0", "b", "<sample:4>", "+1", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "3"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "H"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=H, getWidth=3}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"\u00e9", "b", "<sample:4>", "1L.5", "true"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"   "}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "\u00ebelllnull"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=\u00ebelllnull, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=1, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=+1, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"+1<"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=+1<, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"["}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=[, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"dc", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:3>", "74", "Hello,6World", "1.12345678901234567", "<sample:0>", "72", "-1", "5."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "73"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=73, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=2147483647, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "2147481599"}, {"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=2147481599, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"b--1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=b--1, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"b--11.12345678901234567"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=b--11.12345678901234567, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"c--11.12345678901234567"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=c--11.12345678901234567, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"c--11.123456789012,4567"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=c--11.123456789012,4567, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"c--11.123456789012,4467"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=c--11.123456789012,4467, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"1e10", "true", "<sample:5>", "a,b,c", "true"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<null>", "2147483647", "72", "0xFFFFFFFF"}, {"org.apache.commons.cli.HelpFormatter", "getOptionComparator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<null>", "75", "2147483648"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,java.lang.String", "<sample:3>", "-1", "Hello,6World"}, {"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<null>", "1", "3", "usage: "}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<null>", "75", "2147483648"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,java.lang.String", "<sample:3>", "-1", "Iello,6World"}, {"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<sample:2>", "1", "3", "usage: "}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:4>", "75", "2147483648"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,java.lang.String", "<sample:3>", "-1", "Iello,6World"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "2", "b2020-02-30T25:61:61", "-1", "<sample:5>", "ec"}, {"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<sample:2>", "1", "3", "usage: "}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "21474836485."}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=1.1234567, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<empty>", "2", "<sample:0>", "72", "-2147483648"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "\u00ebnull"}, {"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getWidth", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.HelpFormatter$OptionComparator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:2>", "4", "<sample:4>", "2", "1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample  -a\n   <\n   a\n   r\n   g\n   >\n  -b\n   <\n   a\n   r\n   g\n   >\n  -t\n   <\n   a\n   r\n   g\n   > {length=95}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:2>", "4", "<sample:4>", "2", "1"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<null>", "3", "-2147483648", "2020-02-30T25:61:61"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "I", "1e10", "<sample:3>", "0", "true"}}, 2), new String[][]{{"insert", "int,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sa0mple  -a\n   <\n   a\n   r\n   g\n   >\n  -b\n   <\n   a\n   r\n   g\n   >\n  -t\n   <\n   a\n   r\n   g\n   > {length=96}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:2>", "7", "<sample:4>", "2", "1"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<null>", "3", "-2147483648", "2020-02-30T25:61:61"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "I", "1e10", "<sample:3>", "0", "true"}}, 2), new String[][]{{"insert", "int,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sa0mple  -a\n      <\n      a\n      r\n      g\n      >\n  -b\n      <\n      a\n      r\n      g\n      >\n  -t\n      <\n      a\n      r\n      g\n      > {length=141}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<null>", "7", "<sample:4>", "2", "1"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<null>", "3", "-2147483648", "2020-02-30T25:61:61"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "I", "1e10", "<sample:3>", "0", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "7", "<sample:4>", "2097160", "37"}, false, 15, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "I", "1e10", "<sample:3>", "0", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "linf.sfepCaratto", ".5", "<sample:3>", "1e10", "true"}}, 2), new String[][]{{"insert", "int,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("\n      -\n      a\n      <\n      a\n      r\n      g\n      >\n\n      -\n      b\n      <\n      a\n      r\n      g\n      >\n\n      -\n      t\n      <\n      a\n      r\n      g\n      > {length=170}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:1>", "7", "<sample:0>", "2097160", "37"}, false, 15, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "I", "1e10", "<sample:3>", "0", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "linf.sfepCaratto", ".5", "<sample:3>", "1e10", "true"}, {"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<sample:3>", "0", "73", "1<aa>b</a>"}}, 2), new String[][]{{"insert", "int,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:1>", "2", "<sample:0>", "2097160", "37"}, false, 15, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "I", "1e10", "<sample:3>", "0", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "linf.sfepCaratto", ".5", "<sample:3>", "1e10", "true"}, {"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<sample:3>", "0", "73", "1<aa>b</a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:0>", "-32695", "-1"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "\n", "mull", "<sample:4>", "74"}, {"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<empty>", "-1", "<sample:7>", "3", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:0>", "0", "x1"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "\n", "mull\u00e9", "<sample:4>", "74"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:1>", "0", "TITLE", "{\"a\":1}", "<sample:3>", "3", "10", "74"}, {"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<empty>", "-1", "<sample:7>", "3", "-2147483602"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:0>", "-2", "1"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "", "mull\u00e9", "<sample:4>", "74"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:1>", "0", "TITLE", "{\"", "<sample:3>", "3", "10", "74"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"]"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=], getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:4>", "2147483647", "\""}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "-\037| ", "<sample:4>", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"-2", "<a>b</a>>", "010", "<sample:7>", "", "true"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"2147483647", "<a>b</a>>", "011/", "<sample:5>", "", "true"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"0", "<a>b</a>", "7", "<sample:1>", "", "true"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"2L", "21474883548", "<sample:8>", "<a>b<0a>"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "usage: ", "74", "73"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "+112:30:45"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=+112:30:45, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"2L0x1F", "2147{9835H8-1.5 <", "<sample:7>", "<a>b<0a>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "usage: ", "37", "73"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:0>", "3", "2147483648", "{\"a\":1}", "<sample:5>", "2147483647", "0", "linf.seeparator"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"c,bc", "--", "<sample:2>", "Hello, Worldnull"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "4", "dc", "I", "<sample:5>", "\u00ea", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "-1.5"}, {"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=-1.5, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"71", "linf.sdeparator", "73", "<null>", "1.15"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"99---1/5"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("99---1/5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"99-.-1/5"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("99-.-1/5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"99-/-1/5"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("99-/-1/5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"lif.sf"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=lif.sf, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"lifsf"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=lifsf, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"lifsf01.25"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=lifsf01.25, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"lifsf01.5"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=lifsf01.5, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"lifssf01.5"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=lifssf01.5, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "0", "214647936", "a b", "<sample:1>", "2147483647", "1073741818", " | ", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "-2147483648", "214647936", "a b", "<sample:1>", "2147483647", "1073741818", " | ", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<null>", "10", "22364729261.25", "` a", "<sample:6>", "2147483647", "-1", "|\n I", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "-2", "08.6", "74", "<sample:3>", "5."}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "<a>b</a>", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:4>", "-368", "--", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:2>"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "usage: "}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=usage: , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<null>", "0", "1L", "` aHello, World", "<sample:0>", "-2147483625", "8388607", "|\n II", "false"}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "=a>c</a>", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<empty>", "-368", "t-", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:2>", "10", "74", "1L"}, false, 0, null, 1), new String[][]{{"append", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1L-1 {length=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "4", "xJa\r,b,c", " GWe`2l-o, World", "<sample:4>", "-2147483648", "-1", "<a>b</a>", "true"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "/", "-0.0", "<sample:2>", "si1L.51.123456"}, {"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "2147483647"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "=`?c</a>", "<sample:4>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:0>", "72", "-0X0   ", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:2>", "2147483647", "75", "-1"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "<a>b</a>", "/1L", "<sample:7>", "214647936"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<empty>", "10", "3"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=10, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "-2147483648", "", "9ntrue74", "<sample:5>", "-2147483643", "-2147483648", "1n1.<6", "true"}, false, 10, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "a{c", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:1>", "-2", "abc", "1E-5", "<sample:3>", "3", "3", "--"}, {"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"75", "line.separator", "2147483648", "<sample:1>", "a"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=0}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"10", "line.separator", "2147483648", "<sample:1>", "a"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"10", "liff.separator", "2147479362147483648", "<sample:6>", "a"}, false, 11, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"10", "linf.seeparator", "214647936", "<sample:1>", "`"}, false, 11, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "0", "[", "a b", "<sample:1>", "a b"}, {"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=10, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "3", "0x123456789", "0x123456789", "<sample:3>", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"0", "linf.seeparato", "214647r36a", "<sample:0>", "1.25"}, false, 12, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "printOptions", "java.io.PrintWriter,int,org.apache.commons.cli.Options,int,int", "<empty>", "4", "<sample:0>", "0", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:1>", "10", "73", "usage: "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("usage: {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"0", "linf.sfeparatto", "21447r37a", "<sample:0>", "2n44"}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:3>"}, {"org.apache.commons.cli.HelpFormatter", "printOptions", "java.io.PrintWriter,int,org.apache.commons.cli.Options,int,int", "<empty>", "4", "<sample:0>", "0", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:0>", "-2147483648", "a b", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<null>", "-1", "--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"\u00e9", "abc", "<sample:5>", "1L", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "I"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=I, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"\u00e9null", "abc", "<sample:5>", "1L", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "H"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=H, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"\u00ebelllnull", "`dc", "<sample:4>", "1L.5", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}, {"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "75"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "H"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=H, getWidth=75}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"\u00ebelllnull", "`dc", "<sample:4>", "1L.5", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}, {"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "72"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "H"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=H, getWidth=72}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"\u00ebelllnull", "dc", "<sample:4>", "1L.5", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "3"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "H"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"\u00e9", "b", "<sample:4>", "1L.5", "true"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"\u00ea", "b", "<sample:4>", "i1L.5", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "74"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=74, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.HelpFormatter$OptionComparator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-2147483648, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"]"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"{4a\":1}I", "", "<sample:5>", "1<aa>b</a>", "false"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<sample:0>", "3", "-1", "Hello,6World"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,java.lang.String", "<null>", "4", "\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"1<aa>b</a>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=1<aa>b</a>, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"11<aa>b</a>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=11<aa>b</a>, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=2020-01-01, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"20020-01-01"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=20020-01-01, getOptPrefix=, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"1<aa>b</a>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=1<aa>b</a>, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"1<aa>b<.a>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=1<aa>b<.a>, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"/"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "`dc"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=`dc, getNewLine=/, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"/"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "\t", "TITLE", "<sample:2>", "214647936", "false"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=, getNewLine=/, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=0}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"-2147483584"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-2147483584}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"-2147483584"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "--"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=--, getSyntaxPrefix=usage: , getWidth=-2147483584}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"-2147483584"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "--"}, {"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "75"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=75, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=--, getSyntaxPrefix=usage: , getWidth=-2147483584}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"<a>b</a>", "2020-01-01", "<sample:2>", "null"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<null>", "73", "\u00ebnull"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<null>", "-1048430", "\u00ebnull"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "I"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=I, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 19, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:3>", "3", "<null>", "75", "2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:3>", "1", "<null>", "124", "-4"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "73"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=73, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptionComparator", new String[]{"java.util.Comparator"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "   ", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<null>", "10", "-1", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"["}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptionComparator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=[, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"<"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptionComparator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=<, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=1.5d, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-1, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-13"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "12:30:45", "75", "74"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-13, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"12"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "12:30:45", "75", "74"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=12, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"16777228"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "12:30:45", "75", "74"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=16777228, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:2>", "75", "line.separator", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "1.5e300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=2020-02-30T25:61:61, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"2020-02-3025:61:61"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "1.5e300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=2020-02-3025:61:61, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"20A0-02-3025:61:61"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "1.5e300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=20A0-02-3025:61:61, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"20A0-2-3025:61:61"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "1.5e300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=20A0-2-3025:61:61, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"20A0-2-3025:61:61"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "1.5e300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=0xFFFFFFFF, getSyntaxPrefix=20A0-2-3025:61:61, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "{4a\":1}I"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "9", "2n44", "-", "<sample:0>", "null", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{4a\":1}I", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine={4a\":1}I, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "{4a\":1}I"}, {"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "73"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "9", "2n44nulpl", "-", "<sample:0>", "null", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{4a\":1}I", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=73, getLongOptPrefix=--, getNewLine={4a\":1}I, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "{4a\":1}I"}, {"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "2"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "9", "2n44nulpl", "-", "<sample:0>", "null", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{4a\":1}I", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=2, getLongOptPrefix=--, getNewLine={4a\":1}I, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "{4a\":1}I1L"}, {"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "2"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "9", "2n44nulpl", "-", "<sample:0>", "null", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{4a\":1}I1L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=2, getLongOptPrefix=--, getNewLine={4a\":1}I1L, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "{4a\":1}I1L"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "9", "2n44nulpl", "-", "<sample:0>", "null", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{4a\":1}I1L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine={4a\":1}I1L, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "{3a\":1}I1L"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "9", "2n44nulpl", "-", "<sample:0>", "null", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{3a\":1}I1L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine={3a\":1}I1L, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "2020-02-30T25:61:61", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=2, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<null>", "75", "2147483648"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,java.lang.String", "<sample:3>", "-1", "Hello,6World"}, {"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<null>", "1", "3", "usage: "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptionComparator", new String[]{"java.util.Comparator"}, new String[]{"<null>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptionComparator", new String[]{"java.util.Comparator"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=1.5, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"Hello,6World"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=Hello,6World, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"Hello,6Worlc"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=Hello,6Worlc, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=a,b,c, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=-1, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"11"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=11, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "73"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=4, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:3>", "4", "<null>", "-72", "-42"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:3>", "4", "`dc", "1.1234567", "<sample:1>", "72", "1", "-"}, {"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:1>", "2147483647", "\u00e9", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"   ", "75", "2"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<empty>", "2147483647", "<sample:3>", "-2147483648", "74"}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.HelpFormatter$OptionComparator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=0, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "10", "1L.5", "1", "<sample:3>", "\t\t", "true"}, {"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<empty>", "2147483647", "<sample:3>", "-2147483648", "74"}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "]"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.HelpFormatter$OptionComparator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=], getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<empty>", "2147483647", "<sample:3>", "2147483647", "74"}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "]"}}), new String[][]{{"thenComparing", "java.util.Comparator", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=], getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<empty>", "2147483647", "<sample:6>", "2", "-2147483648"}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "^"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.HelpFormatter$OptionComparator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=^, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<empty>", "2147483647", "<sample:6>", "2", "-2147483648"}}), new String[][]{{"thenComparingLong", "java.util.function.ToLongFunction", "1"}, {"thenComparingInt", "java.util.function.ToIntFunction", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:2>", "4", "<sample:4>", "2", "1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample  -a\n   <\n   a\n   r\n   g\n   >\n  -b\n   <\n   a\n   r\n   g\n   >\n  -t\n   <\n   a\n   r\n   g\n   > {length=95}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{" | ", "-1", "3"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:0>", "73", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "\n", "null", "<sample:4>", "74"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:0>", "-32695", "-1"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "\n", "null", "<sample:4>", "74"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:2>", "73", "<sample:5>", "10", "74"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:4>", "-2", "1\t"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "", "mull\u00e9", "<sample:4>", "74"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:1>", "0", "TITLE", "{\"", "<sample:3>", "3", "10", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:2>", "3", ""}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "-", "<sample:4>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:3>", "73", "<sample:2>", "4", "10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:3>", "2", ".5", "1.5e300", "<sample:0>", "72", "10", ".5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:2>", "2", "]", "0.5e300--1", "<sample:0>", "72", "10", "-5"}, {"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "73"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=73}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "114"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=114}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "-114"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-114}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<empty>", "4", "-1.5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:0>", "1073741823", "-1.5"}, false, 11, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "a"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=a, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:0>", "1073741818", "-1.5"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "21447r37a"}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "`"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=`, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:0>", "1073741818", "-1.5"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:3>", "10", ".5", "0", "<sample:0>", "3", "1", "0xFFFFFFFF"}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "31447s37a"}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "`"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=`, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=2147483647, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:0>", "536870802", "3L"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "2"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:1>", "10", ".5", "0", "<sample:0>", "3", "0", "0xFFFFFFFF"}, {"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "-1073741818"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=2}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"1073741818", "<a>b</a>", "010", "<sample:7>", "dc", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"-2", "<a>b</a>", "010", "<sample:7>", "dc", "true"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"2045", "<aa>\rb</a>", "", "<sample:5>", "", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "`"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=`, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "-75", "<sample:4>", "32", "4"}, false, 15, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:0>", "2", ">", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"linf.seeparator", "2147483548", "<sample:5>", "<a>b<0a>"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "usage: ", "74", "73"}, {"org.apache.commons.cli.HelpFormatter", "printOptions", "java.io.PrintWriter,int,org.apache.commons.cli.Options,int,int", "<sample:2>", "2", "<sample:1>", "0", "73"}, {"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "75"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=75}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"1L", "21474883548", "<sample:8>", "<a>b<0a>"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "usage: ", "74", "73"}, {"org.apache.commons.cli.HelpFormatter", "printOptions", "java.io.PrintWriter,int,org.apache.commons.cli.Options,int,int", "<empty>", "2", "<sample:1>", "0", "73"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "+1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=+1, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"2L", "21474883548", "<sample:8>", "<a>b<0a>"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "usage: ", "74", "73"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "+112:30:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=+112:30:45, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"3", "linf.seeparator", "74", "<null>", "1.25"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"/"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"9"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"99--"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("99--", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"99---1.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("99---1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"99---1/5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("99---1/5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "0", "214647936", "a b", "<sample:1>", "2147483647", "1073741818", " | ", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "-262144", "2246472926", "a b", "<sample:6>", "2147483647", "1073741886", "}\n I", "false"}, false, 9, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "-2", "1L.5", "010", "<sample:1>", "1.12345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "\t", "<null>", "<sample:5>", "0x1F", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:0>", "-2", "1.12345678901234567", "i", "<sample:3>", "75", "2", "2n44"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("          ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "2", "xJ5a\r,b,c0", " GWed2l-o, World", "<sample:6>", "2147483647", "-2", "<d>b2147483648", "true"}, false, 9, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "/1L", "-0X0   ", "<sample:2>", "si1L.51.123456"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "=`?c</a>", "<sample:4>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "Title"}, {"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "   "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=Title, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix={\"a\":1}, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "0", "-pmg2", "", "<null>", "2147483647", "17", "03t09i45.5[1,2]", "true"}, false, 12, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "i"}, {"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<null>"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", ">?c</a=0x123556789", "<sample:4>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptionComparator", new String[]{"java.util.Comparator"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "/1L"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=/1L, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<null>", "1", "2", "1.1234567"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"-", "<null>"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "010", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"H", "a", "<null>", "H", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<null>", "1073741818", "75", "\u00e9"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "1073741818", "Title", "-0X0   ", "<sample:6>", "1.12345678"}, {"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:2>", "74", "1<aa>b</a>", "xJ5a\r,b,c0", "<sample:1>", "73", "-2147483648", "   "}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getArgName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "2147483647", "", "9ntrue74", "<sample:5>", "-1073741823", "-2147483647", "\nr", "false"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<sample:2>", "-2", "214647936"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "a{c", "<sample:4>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"i1L.5"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=i1L.5, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"75"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                           ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("  ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"dc", "<sample:7>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "73"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("73", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=73, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"\n", "I", "<sample:3>", "i1L.5"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"si1L.51.123456", "line.separator", "<null>", "["}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "--"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=1.25, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=--, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:2>", "73", "-1.5"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=0, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "26", "", "1_.12", "<sample:5>", "2147483647", "1073741800", "}--22468974-", "true"}, false, 10, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "-2.5\n", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "\u00ebelll3ull", "2020-01-01", "<sample:2>", "1\t"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:2>", "4", " GWe`2l-o, World", "1E-5", "<null>", "-1073741826", "3", "SIPULE"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"010", "3", "75"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "10", "1\t", "--", "<sample:5>", "Hello, World", "false"}, {"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "2n44"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=2n44, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "1", "\t", "1_/10\rZ1,,2]", "<sample:6>", "2147483647", "2147483647", "|-2246888-1e0;", "true"}, false, 14, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "-2.5\n22020-02-30T25:61:61", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:0>", "4", " HWe`A2l-o, World", "1E/5", "<sample:0>", "74", "-2", "S+PULE"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<null>", "2", "\t", "1_/10\rZ1,,2]", "<sample:5>", "-4", "-28", "|92\"246888--1e0;", "false"}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "-2.5\n22020-02-30T25:61:61Tiptle", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:0>", "4", " IWe`A2l-o, World", "1E/[5", "<sample:4>", "-74", "-2", "S+PULE"}, {"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "2", "\n", "1_/10\rZ1,,2]", "<sample:5>", "-4", "-56", "|92\"246888--1e0;", "false"}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "-2.5\n22020-02-30T25:61:61Tiptle", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:0>", "4", " IWe`A2l-o, World", "1E/[5", "<sample:4>", "-74", "-2", "S+PULE"}, {"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "20", "\n", "1_}10\rZ1,,2]", "<sample:5>", "-4", "-56", "|92\"246888--1e0;", "false"}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "-2.5\n22020-02-30T25:61:61Tiptle", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:0>", "4", " IWe`A2l-o, World", "1E/[5", "<sample:4>", "-74", "-2", "S+PULE"}, {"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"<a>b</a>", "\n", "<sample:4>", "Hello, World", "true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:0>", "0", "10", "\t"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "2020-02-30T25:61:61"}, {"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=2020-02-30T25:61:61, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"-"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptionComparator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=-, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"I", " IWe`A2l-o, World", "<sample:1>", "`dc"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:2>", "-1", "0", "\u00ebnull"}, {"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"2n44", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "a b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=a b, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "-0.0"}, {"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=-0.0, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<null>", "10", "\013<ITF\n--L1-11L", "1.}}30\rZ1,,2]1/124D4 56789", "<sample:2>", "-2147483648", "534773753", ".1_/10\rZ1,,2]", "false"}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "\01371.1234567890123456", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<sample:2>", "72", "2020]x01-01"}, {"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"0xFFFFFFFF", "<sample:7>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"4"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=4, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"3"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("   ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{".5", "<null>", "false"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "PT1H"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"-56"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "4", ">", "a,b,c", "<sample:5>", "123456789012345678901234567890", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-56, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "32776", "\013<IITF|\n.--.L1-111KK\t1.5e30074\t", "W1.}}30\rZ1+,2P]1/134E4 5L789", "<sample:6>", "-2147483648", "-2147482653", "   ", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "\01371.\n23i467W90123456", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "18", "linf.sfeparatto", "    ", "<sample:9>", "1.1234567890123456", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptionComparator", new String[]{"java.util.Comparator"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getArgName", ""}, {"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "1<aa>b</a>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=-0.0, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "-"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=b, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<sample:1>", "75", "0", "line.separator"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:0>"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "2147483647", "]", "Title", "<null>", "linf.sfepasatto", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"21447r37a"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-2147482653"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21447r37a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-2147482653, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<empty>", "10", "2\t", "<sample:3>"}, false, 14, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<empty>", "10", "2\t", "<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-2147482653"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-2147482653, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<empty>", "10", "010", "<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-2147482683"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-2147482683, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<empty>", "10", "010", "<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "-4"}, {"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-2147482683"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-2147482683, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-4}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<null>", "10", "010", "<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "-4"}, {"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-2147482683"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"74"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=74, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<null>", "10", "010", "<sample:3>"}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "2147482603"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:2>", "10", "010", "<sample:3>"}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "2147482603"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=2147482603, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:2>", "10", "010", "<sample:3>"}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "2147482603"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=2147482603, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:2>", "-32", "+1", "<sample:3>"}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"{4a\":1}I", "-4", "4"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:2>", "3", "[1,2]", "{\"", "<sample:7>", "32776", "-2147482603", " <"}, {"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:2>", "18", "2", "\013<IITF\n.--L1-111K\t1.5e300"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"null", "-4", "4"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:2>", "3", "[1,2]", "{\"", "<sample:7>", "32776", "-2147482603", " <"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"null", "-42", "75"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:2>", "3", "a", "{\"", "<sample:7>", "32776", "-2147482603", " <"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"nul", "0", "75"}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "\u00e9"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:2>", "3", "a", "{\"", "<sample:7>", "75", "-2147482603", " <\t"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\u00e9, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"48"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=48}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"1073741823"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"1073741876"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=1073741876}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"-2147482804"}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getArgName", ""}, {"org.apache.commons.cli.HelpFormatter", "getOptPrefix", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<null>", "73", "1.5f", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:0>", "-73", "6.5f", "<sample:0>"}, false, 12, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:0>", "3", "0x1F", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "S+PULE"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=S+PULE, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"-1", "\u00ebelllnull", "]", "<sample:4>", "1.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"-1", "P\u00ebelllnul", "", "<sample:4>", "1.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<sample:4>", "-2", "W1.}}30\rZ1+,2P]1/134E4 5L789"}, {"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:2>", "-2147483648", "2147483647", "2020-01-01"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "\u00e9"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:4>", "1", " <", "\u00ebnull", "<sample:1>", "75", "2147483647", "1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\u00e9, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=12:30:45, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:4>", "2", "TITLE", "7", "<sample:9>", "-74", "2147483647", ".5"}, {"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "32776"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"2020-01-01", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:4>", "2", "TITLE", "7", "<sample:9>", "-74", "2147483647", ".5"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "\013<IITF|\n.--.L1-111KK\t1.5e30074\t"}, {"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "32776"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=\013<IITF|\n.--.L1-111KK\t1.5e30074\t, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"2020-01-01", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:4>", "2", "TITLE", "7", "<sample:9>", "-74", "2147483647", "/"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "\013<IITF|\n.--.L1-111KK1.5e30074\t"}, {"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "16388"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=\013<IITF|\n.--.L1-111KK1.5e30074\t, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"2020-01-01", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:4>", "2", "TITLE", "7", "<sample:9>", "-74", "2147483647", "/"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "\013<IITF|\n.--.L1-111KK1.5e30074\t"}, {"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "16388"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=\013<IITF|\n.--.L1-111KK1.5e30074\t, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"202-01-/1", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:4>", "2", "TITLE", "7", "<sample:9>", "-74", "2147483647", "/"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "\013<IITF|\n.--.L1-111KK1.5e30074\t"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=\013<IITF|\n.--.L1-111KK1.5e30074\t, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"S+PtLE"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "a,b,c-", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "mull\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("S+PtLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=mull\u00e9, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"S8tL"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "mtll\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("S8tL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=mtll\u00e9, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:0>", "1", "73", "dc"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:0>", "32776", "-2147483648", "=`?c</a>"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "-74", "=`?c</a>", "usage: ", "<sample:3>", "1.12345678901234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<null>", "33", "73", "[dc"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}, {"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<sample:1>", "74", "<sample:6>", "1", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:1>", "33", "73", "1.12335678"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}, {"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<sample:1>", "74", "<sample:6>", "1", "1"}}), new String[][]{{"codePointCount", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"-0.0", "<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=4, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"`"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:3>"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "5."}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=5., getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=`, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"P`"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:3>"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "5."}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=5., getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=P`, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"Pa"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:3>"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "5."}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=5., getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=Pa, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
}
