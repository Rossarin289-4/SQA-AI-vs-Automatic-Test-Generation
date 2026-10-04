package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "number", new String[]{"double"}, new String[]{"1.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER 1.0 {getCharno=-1, getChildCount=0, getDouble=1.0, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosition=-1, getS...#327#1570335706", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "trueNode", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("TRUE {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#348#1779239419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "pos", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("POS {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSou...#345#426526214", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "paramList", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "objectlit", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "returnNode", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("RETURN {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, get...#349#-431907903", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "script", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "string", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING /a/b {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1...#329#-754295460", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "stringKey", new String[]{"java.lang.String"}, new String[]{"..5"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING_KEY ..5 {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset...#332#-1246835914", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "script", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, get...#351#-2089906198", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "thisNode", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("THIS {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=this, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#348#424841622", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "neg", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("NEG {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSou...#345#-1145382431", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "returnNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("RETURN {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, get...#347#-1651992178", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "objectlit", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("OBJECTLIT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, ...#353#60935495", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "assign", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "exprResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EXPR_RESULT {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1...#354#-819845091", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "ifNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "paramList", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("PARAM_LIST {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1,...#354#1652651458", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "forIn", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:1>", "<sample:13>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "sheq", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SHEQ {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#346#-946548327", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "sub", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:12>", "<sample:15>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SUB {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSou...#345#950210393", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "voidNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("VOID {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#347#43345549", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "or", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("OR {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSour...#345#-1738988575", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "forNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:10>", "<sample:7>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:15>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ADD {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSou...#344#-1712509202", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "tryCatchFinally", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:17>", "<sample:0>", "<sample:14>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "switchNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:12>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "labelName", new String[]{"java.lang.String"}, new String[]{""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "and", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("AND {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSou...#346#-2106485972", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "arraylit", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ARRAYLIT {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, g...#350#-527369511", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "switchNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:15>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SWITCH {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, get...#349#1389407086", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#350#-117756380", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "eq", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:12>", "<sample:13>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EQ {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSour...#344#-1134271836", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "throwNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("THROW {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#347#-6853831", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "hook", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:6>", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("HOOK {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#346#767744636", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "var", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:15>", "<sample:13>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "tryCatch", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:14>", "<sample:12>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "not", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("NOT {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSou...#345#1006324231", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "doNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:14>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("DO {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSour...#345#333811958", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "getelem", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GETELEM {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, ge...#349#1564110428", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "paramList", new String[]{"java.util.List"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("PARAM_LIST {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1,...#354#1652651458", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "forNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:13>", "<sample:12>", "<sample:14>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("FOR {getCharno=-1, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSou...#346#-653976903", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "regexp", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("REGEXP {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, get...#348#-2146874849", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "forNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:15>", "<sample:20>", "<sample:0>", "<sample:15>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "defaultCase", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:14>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("DEFAULT_CASE {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#355#1277881874", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:20>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#348#1468079217", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:16>"}, true, 0, null, 1), new String[][]{{"getNext", "", "7"}, {"getStaticSourceFile", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "regexp", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("REGEXP {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, get...#348#920046078", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "tryFinally", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:14>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "catchNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:26>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "function", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:26>", "<sample:13>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "call", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:15>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("CALL {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#346#573515635", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "var", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:26>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("VAR {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSou...#346#-1895959757", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "caseNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:13>", "<sample:14>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("CASE {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#347#-173846572", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "ifNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:14>", "<sample:13>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "getprop", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GETPROP {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, ge...#349#-266245134", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "assign", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:26>", "<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ASSIGN {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, get...#348#-972723990", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "paramList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:26>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("PARAM_LIST {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1,...#352#1681603949", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "comma", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:22>"}, true, 0, null, 1), new String[][]{{"getLineno", "", "3"}, {"getChildBefore", "com.google.javascript.rhino.Node", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "label", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:24>", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "continueNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:24>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("CONTINUE {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, g...#351#-1743389708", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "breakNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:24>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BREAK {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#348#1239082781", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "newNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:23>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"children", "", "7"}, {"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "forIn", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:26>", "<sample:11>", "<sample:14>"}, true), new String[][]{{"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "newNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:5>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "continueNode", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("CONTINUE {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, g...#353#1742092519", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "getelem", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "throwNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "empty", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EMPTY {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#350#-441360507", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "newNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node[]"}, new String[]{"<null>", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "paramList", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("PARAM_LIST {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1,...#354#1652651458", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "name", new String[]{"java.lang.String"}, new String[]{"1-12345678"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME 1-12345678 {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=1-12345678, getSideEffectFlags=0, getSourceFileName=null, getSourc...#345#-1729318912", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "defaultCase", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "getelem", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "returnNode", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("RETURN {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, get...#349#-431907903", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "regexp", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "stringKey", new String[]{"java.lang.String"}, new String[]{"ab"}, true, 0, null, 1), new String[][]{{"getJSType", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "paramList", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getIndexOfChild", "com.google.javascript.rhino.Node", "1"}, {"getParent", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "or", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "neg", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "thisNode", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "breakNode", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BREAK {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#350#-1139999280", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "script", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "and", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "paramList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "objectlit", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "propdef", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "sub", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "and", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "number", new String[]{"double"}, new String[]{"Infinity"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER Infinity {getCharno=-1, getChildCount=0, getDouble=Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePositio...#337#-686066598", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "neg", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "not", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "number", new String[]{"double"}, new String[]{"-0.0"}, true, 0, null, 1), new String[][]{{"getSideEffectFlags", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "number", new String[]{"double"}, new String[]{"-Infinity"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "newNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:10>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "objectlit", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "returnNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "newNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("NEW {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSou...#345#1356427708", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "tryCatchFinally", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:7>", "<sample:12>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "neg", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("NEG {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSou...#345#-1145382431", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "nullNode", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getNext", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "sub", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:14>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "objectlit", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "breakNode", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BREAK {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#350#-1139999280", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "paramList", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "thisNode", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"isCall", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "arraylit", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "hook", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:8>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "forIn", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:14>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "regexp", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "comma", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:13>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "continueNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:19>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "assign", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "sheq", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "sheq", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:8>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "continueNode", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("CONTINUE {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, g...#353#1742092519", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "var", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "regexp", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:17>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "function", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:16>", "<sample:17>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "or", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "returnNode", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"appendStringTree", "java.lang.Appendable", "4"}, {"getChildCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "arraylit", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "objectlit", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "hook", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:9>", "<sample:13>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "continueNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#350#-117756380", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "thisNode", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getDouble", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "not", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:13>"}, true, 0, null, 1), new String[][]{{"isBlock", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "function", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:3>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "number", new String[]{"double"}, new String[]{"Infinity"}, true, 0, null, 3), new String[][]{{"isCase", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "labelName", new String[]{"java.lang.String"}, new String[]{"11"}, true, 0, null, 3), new String[][]{{"getCharno", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "returnNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "paramList", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "breakNode", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BREAK {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#350#-1139999280", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "getprop", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "ifNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "ifNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:6>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "sheq", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "catchNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "falseNode", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("FALSE {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#349#1715388561", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "sheq", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "caseNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "switchNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:3>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "doNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "paramList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "throwNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "regexp", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "regexp", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "paramList", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "sub", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "number", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, true), new String[][]{{"appendStringTree", "java.lang.Appendable", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -1.7976931348623157E308 {getCharno=-1, getChildCount=0, getDouble=-1.7976931348623157E308, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#367#1899337350", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "newNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:3>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "catchNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "returnNode", new String[]{}, new String[]{}, true), new String[][]{{"getChildAtIndex", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "arraylit", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "var", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "number", new String[]{"double"}, new String[]{"-48.0"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -48.0 {getCharno=-1, getChildCount=0, getDouble=-48.0, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosition=-1, ...#331#-1979552294", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "name", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"isBlock", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "nullNode", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("NULL {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#348#-59202217", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#350#-117756380", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "number", new String[]{"double"}, new String[]{"NaN"}, true), new String[][]{{"getDouble", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "nullNode", new String[]{}, new String[]{}, true), new String[][]{{"addChildrenAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "and", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "number", new String[]{"double"}, new String[]{"Infinity"}, true), new String[][]{{"isAssign", "", "2"}, {"getSourceFileName", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "call", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:2>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("CALL {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#346#-654530734", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "ifNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:7>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "neg", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "name", new String[]{"java.lang.String"}, new String[]{"0x1F "}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME 0x1F  {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=0x1F , getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1...#330#1866774213", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "continueNode", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("CONTINUE {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, g...#353#1742092519", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "number", new String[]{"double"}, new String[]{"Infinity"}, true), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "tryCatchFinally", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "paramList", new String[]{}, new String[]{}, true), new String[][]{{"getLastChild", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "propdef", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "var", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "paramList", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("PARAM_LIST {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1,...#354#1652651458", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "returnNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true), new String[][]{{"getIndexOfChild", "com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "continueNode", new String[]{}, new String[]{}, true), new String[][]{{"getStaticSourceFile", "", "2"}, {"getNext", "", "2"}, {"getParent", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "or", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "trueNode", new String[]{}, new String[]{}, true), new String[][]{{"getInputId", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "tryCatch", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "returnNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "call", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:10>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "sub", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "paramList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "objectlit", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "pos", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true), new String[][]{{"isBreak", "", "6"}, {"children", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$SiblingNodeIterable", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "and", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "stringKey", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:611.1234567"}, true), new String[][]{{"cloneTree", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING_KEY 2020-02-30T25:61:611.1234567 {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#382#1334492874", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{}, new String[]{}, true), new String[][]{{"getDouble", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "assign", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{}, new String[]{}, true), new String[][]{{"getExistingIntProp", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "not", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "pos", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "breakNode", new String[]{}, new String[]{}, true), new String[][]{{"isCall", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "pos", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "function", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:12>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "voidNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "tryFinally", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:12>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "call", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:13>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "continueNode", new String[]{}, new String[]{}, true), new String[][]{{"getLineno", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "neg", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, true), new String[][]{{"isCall", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "label", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "number", new String[]{"double"}, new String[]{"Infinity"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER Infinity {getCharno=-1, getChildCount=0, getDouble=Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePositio...#337#-686066598", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "forIn", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:15>", "<sample:0>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "breakNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "newNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:7>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "labelName", new String[]{"java.lang.String"}, new String[]{"202002-30T5:61:61"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("LABEL_NAME 202002-30T5:61:61 {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, g...#360#-817593396", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "nullNode", new String[]{}, new String[]{}, true), new String[][]{{"getAncestor", "int", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "number", new String[]{"double"}, new String[]{"-Infinity"}, true), new String[][]{{"getLastChild", "", "1"}, {"getSideEffectFlags", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "nullNode", new String[]{}, new String[]{}, true), new String[][]{{"getIntProp", "int", "4"}, {"isBlock", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "arraylit", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "number", new String[]{"double"}, new String[]{"NaN"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER NaN {getCharno=-1, getChildCount=0, getDouble=NaN, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosition=-1, getS...#327#-824237686", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "exprResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "nullNode", new String[]{}, new String[]{}, true), new String[][]{{"getIntProp", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "eq", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:12>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "labelName", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("LABEL_NAME .5 {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=...#330#-980860048", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "stringKey", new String[]{"java.lang.String"}, new String[]{"0xFFFEFFFF"}, true), new String[][]{{"isAnd", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "comma", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:12>", "<sample:14>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "defaultCase", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "stringKey", new String[]{"java.lang.String"}, new String[]{"<"}, true), new String[][]{{"getChildBefore", "com.google.javascript.rhino.Node", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "exprResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true), new String[][]{{"getDirectives", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{}, new String[]{}, true), new String[][]{{"isCase", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "comma", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:17>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("COMMA {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#347#1677636753", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "var", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "stringKey", new String[]{"java.lang.String"}, new String[]{"1.551.5f"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING_KEY 1.551.5f {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceO...#342#1787674954", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "stringKey", new String[]{"java.lang.String"}, new String[]{"1L"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING_KEY 1L {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=...#330#-727557174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "falseNode", new String[]{}, new String[]{}, true), new String[][]{{"hasChildren", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "returnNode", new String[]{}, new String[]{}, true), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "string", new String[]{"java.lang.String"}, new String[]{"W1E-"}, true), new String[][]{{"getSideEffectFlags", "", "3"}, {"appendStringTree", "java.lang.Appendable", "7"}, {"cloneTree", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING W1E- {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1...#329#-1248192900", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "stringKey", new String[]{"java.lang.String"}, new String[]{"234567889012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING_KEY 234567889012345678901234567890 {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFil...#386#-1100220694", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "hook", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:16>", "<sample:0>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "string", new String[]{"java.lang.String"}, new String[]{"1.5"}, true), new String[][]{{"getBooleanProp", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "nullNode", new String[]{}, new String[]{}, true), new String[][]{{"getCharno", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "doNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:16>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "forNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:15>", "<sample:13>", "<sample:16>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "breakNode", new String[]{}, new String[]{}, true), new String[][]{{"getJSType", "", "5"}, {"getProp", "int", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "breakNode", new String[]{}, new String[]{}, true), new String[][]{{"getIndexOfChild", "com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "assign", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "string", new String[]{"java.lang.String"}, new String[]{"**1"}, true), new String[][]{{"getExistingIntProp", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "continueNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:16>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "ifNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:15>", "<sample:13>", "<sample:16>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "regexp", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:19>", "<sample:13>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "name", new String[]{"java.lang.String"}, new String[]{"202002-30T5:61:61"}, true), new String[][]{{"getStaticSourceFile", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "switchNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:15>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "falseNode", new String[]{}, new String[]{}, true), new String[][]{{"getInputId", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "stringKey", new String[]{"java.lang.String"}, new String[]{"1.1,234567890123456"}, true), new String[][]{{"getStaticSourceFile", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "name", new String[]{"java.lang.String"}, new String[]{";;..5"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME ;;..5 {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=;;..5, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1...#330#1591227479", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "forNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:13>", "<sample:13>", "<sample:11>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "name", new String[]{"java.lang.String"}, new String[]{" "}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME   {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName= , getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSou...#318#-379250046", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "returnNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true), new String[][]{{"getIntProp", "int", "7"}, {"isBlock", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "getelem", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:14>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "labelName", new String[]{"java.lang.String"}, new String[]{"0C0"}, true), new String[][]{{"isCatch", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "stringKey", new String[]{"java.lang.String"}, new String[]{"{\"a\":11}"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING_KEY {\"a\":11} {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceO...#342#-1066330806", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "caseNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:15>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "returnNode", new String[]{}, new String[]{}, true), new String[][]{{"isCatch", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "string", new String[]{"java.lang.String"}, new String[]{"1.5-1.5"}, true), new String[][]{{"getLineno", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{}, new String[]{}, true), new String[][]{{"getQualifiedName", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "hook", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<null>", "<sample:12>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "paramList", new String[]{}, new String[]{}, true), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Node tree inequality:\nTree1:\nPARAM_LIST\n\n\nTree2:\nNUMBER -Infinity\n\n\nSubtree1: PARAM_LIST\n\n\nSubtree2: NUMBER -Infinity\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "paramList", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"isCase", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "labelName", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("LABEL_NAME 0x123456789 {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#348#-1452731124", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "or", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:14>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "stringKey", new String[]{"java.lang.String"}, new String[]{".5-1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING_KEY .5-1.5 {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOff...#338#-1680806102", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "forIn", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:11>", "<sample:10>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "pos", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, true), new String[][]{{"isCall", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "eq", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:11>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EQ {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSour...#344#-1134271836", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "arraylit", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:3>"}, true), new String[][]{{"getDouble", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "forNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>", "<sample:13>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "ifNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:12>", "<sample:11>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "forNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:1>", "<sample:12>", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "falseNode", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getExistingIntProp", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "thisNode", new String[]{}, new String[]{}, true), new String[][]{{"children", "", "5"}, {"removeAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "labelName", new String[]{"java.lang.String"}, new String[]{"1-12345678"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("LABEL_NAME 1-12345678 {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourc...#346#1334292368", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "labelName", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFF"}, true), new String[][]{{"getChildAtIndex", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "sub", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SUB {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSou...#345#950210393", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "arraylit", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"children", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "name", new String[]{"java.lang.String"}, new String[]{"/a/bTHTLE"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME /a/bTHTLE {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=/a/bTHTLE, getSideEffectFlags=0, getSourceFileName=null, getSourceO...#342#2087207990", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "forNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:5>", "<sample:10>", "<sample:16>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "script", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<empty>"}, true), new String[][]{{"isAssign", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "getelem", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "string", new String[]{"java.lang.String"}, new String[]{"itle"}, true, 0, null, 2), new String[][]{{"getDouble", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "block", new String[]{}, new String[]{}, true), new String[][]{{"getIndexOfChild", "com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "labelName", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("LABEL_NAME aaaaaaaaaaaaaaaaaaaaa {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=nul...#368#103755508", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "breakNode", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getExistingIntProp", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "continueNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "eq", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:9>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.IR", "com.google.javascript.rhino.IR", "voidNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
}
