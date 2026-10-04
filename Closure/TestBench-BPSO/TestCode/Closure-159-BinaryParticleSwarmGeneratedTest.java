package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "enableSpecialization", new String[]{"com.google.javascript.jscomp.SpecializeModule$SpecializationState"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", "com.google.javascript.jscomp.InlineFunctions$FunctionState", "<sample:5>"}, {"com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", new String[]{"com.google.javascript.jscomp.InlineFunctions$FunctionState"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "enableSpecialization", new String[]{"com.google.javascript.jscomp.SpecializeModule$SpecializationState"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "isCandidateUsage", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "isCandidateUsage", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"1E"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=true, canInlineDirectly=false, canRemove=true, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"0x11F123456789012345678901234567890"}, false, 0, null, 2), new String[][]{{"canInline", "", "4"}, {"getModule", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "isCandidateUsage", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", new String[]{"com.google.javascript.jscomp.InlineFunctions$FunctionState"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "enableSpecialization", "com.google.javascript.jscomp.SpecializeModule$SpecializationState", "<sample:3>"}, {"com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", "java.lang.String", "I010"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaabaaaaaaaa"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", "com.google.javascript.jscomp.InlineFunctions$FunctionState", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=true, canInlineDirectly=false, canRemove=true, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"0.12346678901234567"}, false, 6, new String[][]{}), new String[][]{{"setFn", "com.google.javascript.jscomp.InlineFunctions$Function", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=true, canInlineDirectly=false, canRemove=true, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"-0d0"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=true, canInlineDirectly=false, canRemove=true, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", "java.lang.String", "-10xFFFFFFFFF"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", "java.lang.String", "1a0b"}}, 3), new String[][]{{"getModule", "", "1"}, {"canRemove", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", "java.lang.String", "Inlined!functi5on: "}}), new String[][]{{"setNamesToAlias", "java.util.Set", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=true, canInlineDirectly=false, canRemove=true, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"PS1I"}, false, 6, new String[][]{}), new String[][]{{"setInline", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=true, canInlineDirectly=false, canRemove=true, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"11.1234567890134567"}, false), new String[][]{{"setInline", "boolean", "4"}, {"setSafeFnNode", "com.google.javascript.rhino.Node", "6"}, {"getSafeFnNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationException, getType...#373#1387726836", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "isCandidateUsage", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"a]b"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", "java.lang.String", "2147.8648"}}, 2), new String[][]{{"setHasInnerFunctions", "boolean", "4"}, {"canInlineDirectly", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"1LPS1I"}, false, 7, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", ""}}), new String[][]{{"setInline", "boolean", "5"}, {"inlineDirectly", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=true, canInlineDirectly=true, canRemove=true, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"1E-52020-01-01"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", ""}}), new String[][]{{"getSafeFnNode", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"1PS1I"}, false, 3, new String[][]{}), new String[][]{{"hasReferences", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "enableSpecialization", new String[]{"com.google.javascript.jscomp.SpecializeModule$SpecializationState"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"<a?b</a>Title"}, false), new String[][]{{"canInlineDirectly", "", "1"}, {"addReference", "com.google.javascript.jscomp.InlineFunctions$Reference", "2"}, {"getNamesToAlias", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"  "}, false, 7, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", ""}}, 2), new String[][]{{"getReference", "com.google.javascript.rhino.Node", "1"}, {"setFn", "com.google.javascript.jscomp.InlineFunctions$Function", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=true, canInlineDirectly=false, canRemove=true, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{""}, false), new String[][]{{"setReferencesThis", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=true, canInlineDirectly=false, canRemove=true, getReferencesThis=true, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", "java.lang.String", "b010"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"1.123456785.1E"}, false, 5, new String[][]{}), new String[][]{{"setRemove", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=true, canInlineDirectly=false, canRemove=true, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"http<://examplFe.com/a?b=c"}, false, 5, new String[][]{}), new String[][]{{"getModule", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "enableSpecialization", new String[]{"com.google.javascript.jscomp.SpecializeModule$SpecializationState"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"8E-51e10"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", "com.google.javascript.jscomp.InlineFunctions$FunctionState", "<sample:1>"}, {"com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", "java.lang.String", "5."}}, 3), new String[][]{{"getFn", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"crll"}, false, 5, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "enableSpecialization", "com.google.javascript.jscomp.SpecializeModule$SpecializationState", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=true, canInlineDirectly=false, canRemove=true, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"5/123456789012345678901234567890"}, false), new String[][]{{"addReference", "com.google.javascript.jscomp.InlineFunctions$Reference", "7"}, {"getReferences", "", "3"}, {"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "enableSpecialization", new String[]{"com.google.javascript.jscomp.SpecializeModule$SpecializationState"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"a]c"}, false), new String[][]{{"addReference", "com.google.javascript.jscomp.InlineFunctions$Reference", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=true, canInlineDirectly=false, canRemove=true, getReferencesThis=false, hasBlockInliningReferences=true, hasInnerFunctions=false, hasReferences=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 3, new String[][]{}), new String[][]{{"addReference", "com.google.javascript.jscomp.InlineFunctions$Reference", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=true, canInlineDirectly=false, canRemove=true, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", new String[]{"com.google.javascript.jscomp.InlineFunctions$FunctionState"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", "java.lang.String", "icallI"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"0x.123456789"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "enableSpecialization", "com.google.javascript.jscomp.SpecializeModule$SpecializationState", "<sample:0>"}}, 1), new String[][]{{"setFn", "com.google.javascript.jscomp.InlineFunctions$Function", "1"}, {"getFn", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", new String[]{"com.google.javascript.jscomp.InlineFunctions$FunctionState"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", "java.lang.String", "1.134567"}, {"com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", "com.google.javascript.jscomp.InlineFunctions$FunctionState", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=true, canInlineDirectly=false, canRemove=true, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", new String[]{"com.google.javascript.jscomp.InlineFunctions$FunctionState"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"1.123456785.1Ei"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", ""}, {"com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", ""}}, 1), new String[][]{{"canRemove", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", ""}}, 2), new String[][]{{"getReference", "com.google.javascript.rhino.Node", "3"}, {"canInline", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"5/12345678901234567891123456789011.1234567890134567"}, false), new String[][]{{"getReferences", "", "5"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", ""}, {"com.google.javascript.jscomp.InlineFunctions", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"5/1234567890123456789012345678901.1234567"}, false, 3, new String[][]{}), new String[][]{{"canInline", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", new String[]{"com.google.javascript.jscomp.InlineFunctions$FunctionState"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:10>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 6, new String[][]{}), new String[][]{{"setInline", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=false, canInlineDirectly=false, canRemove=false, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"true"}, false, 4, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", ""}, {"com.google.javascript.jscomp.InlineFunctions", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:2>"}}, 1), new String[][]{{"getNamesToAlias", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"0x123456789a"}, false, 3, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", ""}, {"com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", ""}}, 3), new String[][]{{"getSafeFnNode", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", "com.google.javascript.jscomp.InlineFunctions$FunctionState", "<sample:6>"}, {"com.google.javascript.jscomp.InlineFunctions", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:7>"}}, 1), new String[][]{{"hasInnerFunctions", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 6, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:4>"}}, 3), new String[][]{{"hasReferences", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"0x1G"}, false, 6, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:2>"}}), new String[][]{{"getNamesToAlias", "", "1"}, {"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", ""}}), new String[][]{{"setModule", "com.google.javascript.jscomp.JSModule", "1"}, {"setRemove", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=true, canInlineDirectly=false, canRemove=false, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 3, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", "com.google.javascript.jscomp.InlineFunctions$FunctionState", "<sample:6>"}}), new String[][]{{"setFn", "com.google.javascript.jscomp.InlineFunctions$Function", "3"}, {"getSafeFnNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"0+1Title"}, false, 7, new String[][]{}), new String[][]{{"setFn", "com.google.javascript.jscomp.InlineFunctions$Function", "1"}, {"setFn", "com.google.javascript.jscomp.InlineFunctions$Function", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"."}, false, 6, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", "java.lang.String", "1.4d"}, {"com.google.javascript.jscomp.InlineFunctions", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:5>"}}, 1), new String[][]{{"getReference", "com.google.javascript.rhino.Node", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", new String[]{"com.google.javascript.jscomp.InlineFunctions$FunctionState"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", "com.google.javascript.jscomp.InlineFunctions$FunctionState", "<null>"}, {"com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"1LPS1ITITLE"}, false, 7, new String[][]{}, 3), new String[][]{{"getNamesToAlias", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", "java.lang.String", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"PS1I{\"a\":1}"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", ""}}), new String[][]{{"getNamesToAlias", "", "0"}, {"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", "java.lang.String", "2L"}, {"com.google.javascript.jscomp.InlineFunctions", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "isCandidateUsage", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "isCandidateUsage", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"i11.1234567890134567"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", ""}, {"com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", ""}}, 1), new String[][]{{"getSafeFnNode", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "isCandidateUsage", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", new String[]{"com.google.javascript.jscomp.InlineFunctions$FunctionState"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", "java.lang.String", "0e20"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 7, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", ""}}), new String[][]{{"addReference", "com.google.javascript.jscomp.InlineFunctions$Reference", "3"}, {"addReference", "com.google.javascript.jscomp.InlineFunctions$Reference", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=true, canInlineDirectly=false, canRemove=true, getReferencesThis=false, hasBlockInliningReferences=true, hasInnerFunctions=false, hasReferences=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"0.25"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", "com.google.javascript.jscomp.InlineFunctions$FunctionState", "<sample:1>"}}, 2), new String[][]{{"getSafeFnNode", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"1/5e301"}, false, 2, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>"}, {"com.google.javascript.jscomp.InlineFunctions", "enableSpecialization", "com.google.javascript.jscomp.SpecializeModule$SpecializationState", "<sample:0>"}}), new String[][]{{"getModule", "", "1"}, {"setSafeFnNode", "com.google.javascript.rhino.Node", "5"}, {"getSafeFnNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationExce...#383#1808116099", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"\t0x11F1234567890123456678901234567890"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "trimCanidatesUsingOnCost", ""}, {"com.google.javascript.jscomp.InlineFunctions", "enableSpecialization", "com.google.javascript.jscomp.SpecializeModule$SpecializationState", "<sample:7>"}}, 3), new String[][]{{"setInline", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=false, canInlineDirectly=false, canRemove=false, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "isCandidateUsage", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"0x11F12345678901234F678901234567890"}, false, 4, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "removeInlinedFunctions", ""}}), new String[][]{{"setNamesToAlias", "java.util.Set", "7"}, {"getNamesToAlias", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 7, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", "com.google.javascript.jscomp.InlineFunctions$FunctionState", "<null>"}, {"com.google.javascript.jscomp.InlineFunctions", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:3>"}}, 3), new String[][]{{"getReferences", "", "3"}, {"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"\"--1"}, false, 2, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "verifyAllReferencesInlined", "com.google.javascript.jscomp.InlineFunctions$FunctionState", "<sample:8>"}}, 2), new String[][]{{"getNamesToAlias", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"`"}, false, 4, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>"}}, 2), new String[][]{{"setInline", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=false, canInlineDirectly=false, canRemove=false, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"b010"}, false, 0, null, 1), new String[][]{{"setInline", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.InlineFunctions$FunctionState", actual.getClass().getName());
  assertEquals("{canInline=false, canInlineDirectly=false, canRemove=false, getReferencesThis=false, hasBlockInliningReferences=false, hasInnerFunctions=false, hasReferences=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineFunctions", "com.google.javascript.jscomp.InlineFunctions", "getOrCreateFunctionState", new String[]{"java.lang.String"}, new String[]{"1.12345677"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineFunctions", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:8>"}}, 2), new String[][]{{"getReferences", "", "1"}, {"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
}
