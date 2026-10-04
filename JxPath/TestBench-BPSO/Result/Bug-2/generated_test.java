package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeContextDependent", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeContextDependent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeContextDependent", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "isContextDependent", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.Expression$PointerIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:10>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false), new String[][]{{"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "isContextDependent", ""}}), new String[][]{{"hasNext", "", "3"}, {"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 2), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=t...#217#-1938886699", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false), new String[][]{{"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 4, new String[][]{}), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeContextDependent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "isContextDependent", ""}}, 2), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeContextDependent", ""}}), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 1), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 0, null, 2), new String[][]{{"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "isContextDependent", ""}}, 2), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}), new String[][]{{"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}), new String[][]{{"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "isContextDependent", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "isContextDependent", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "isContextDependent", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.Expression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 3), new String[][]{{"hasNext", "", "3"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 2), new String[][]{{"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:10>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.Expression$PointerIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeContextDependent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 0, null, 3), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeContextDependent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.Expression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 2), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}), new String[][]{{"next", "", "5"}, {"setAttribute", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=true, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#55284394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "isContextDependent", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 2), new String[][]{{"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 3), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeContextDependent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeContextDependent", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 0, null, 3), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 2), new String[][]{{"hasNext", "", "5"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeContextDependent", ""}}, 3), new String[][]{{"next", "", "5"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 2), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 3), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 0, null, 3), new String[][]{{"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, null, 3), new String[][]{{"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "isContextDependent", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}, 1), new String[][]{{"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 2), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "isContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeContextDependent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}}, 1), new String[][]{{"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "isContextDependent", ""}}, 3), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:13>"}, false, 3, new String[][]{}, 1), new String[][]{{"hasNext", "", "2"}, {"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "isContextDependent", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "isContextDependent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "isContextDependent", ""}}, 3), new String[][]{{"next", "", "3"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 2), new String[][]{{"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "isContextDependent", ""}}, 2), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.Expression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.Expression$PointerIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 1), new String[][]{{"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:9>"}, false, 0, null, 1), new String[][]{{"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "isContextDependent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 3), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "isContextDependent", ""}}, 3), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeContextDependent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.Expression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeContextDependent", ""}}, 1), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 2), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'0' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#-1757929833", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "isContextDependent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeContextDependent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.Expression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 1), new String[][]{{"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 1), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'0' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#-1757929833", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 1), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=t...#217#-1938886699", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 1), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 3), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=t...#217#-1938886699", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.Expression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.Expression$PointerIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Constant", "isContextDependent", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' {isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
