package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getSlot", new String[]{"java.lang.String"}, new String[]{"Title"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getSlot", new String[]{"java.lang.String"}, new String[]{"1.1234567990123456"}, false, 15, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getSlot", new String[]{"java.lang.String"}, new String[]{"1.1234567990123456"}, false, 15, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getRootNode", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "java.util.List", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "java.util.List", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getScope", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getScope", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.GlobalNamespace", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getScope", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:5>"}, {"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "-0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=global this, hasAnyTemplat...#418#1784958497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getAllSymbols", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "java.util.List", "<sample:1>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getReferences", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getReferences", "com.google.javascript.jscomp.GlobalNamespace$Name", "<null>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getReferences", "com.google.javascript.jscomp.GlobalNamespace$Name", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getRootNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "java.util.List", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getAllSymbols", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getScope", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getAllSymbols", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getScope", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getAllSymbols", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{",callGets="}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getParentScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"java.util.List"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getAllSymbols", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:4>"}, false), new String[][]{{"getScope", "com.google.javascript.jscomp.GlobalNamespace$Name", "6"}, {"getRootNode", "", "7"}, {"getReferences", "com.google.javascript.jscomp.GlobalNamespace$Name", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getScope", "com.google.javascript.jscomp.GlobalNamespace$Name", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=global this, hasAnyTemplat...#418#1784958497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getReferences", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:6>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", ", totalGets="}}), new String[][]{{"getTypeOfThis", "", "7"}, {"clearCachedValues", "", "1"}, {"isArrayType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", ", tDotalGets="}}), new String[][]{{"getTypeOfThis", "", "7"}, {"clearCachedValues", "", "1"}, {"isArrayType", "", "4"}, {"getRestrictedTypeGivenToBooleanOutcome", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#413#-1184760881", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false), new String[][]{{"defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "4"}, {"isAllType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getParentScope", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", ", tDotalGets="}}, 1), new String[][]{{"getTypeOfThis", "", "7"}, {"clearCachedValues", "", "1"}, {"isArrayType", "", "4"}, {"getRestrictedTypeGivenToBooleanOutcome", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#413#-1184760881", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:7>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", ", tDoNtalGets="}}, 1), new String[][]{{"getTypeOfThis", "", "7"}, {"hasAnyTemplateTypes", "", "1"}, {"isArrayType", "", "4"}, {"getRestrictedTypeGivenToBooleanOutcome", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=global this, hasAnyTemplat...#418#1784958497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", ", tDoNtalGets="}}), new String[][]{{"getTypeOfThis", "", "7"}, {"hasAnyTemplateTypes", "", "1"}, {"isArrayType", "", "4"}, {"getRestrictedTypeGivenToBooleanOutcome", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=global this, hasAnyTemplat...#418#1784958497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", ", tDoNtalGets="}}, 2), new String[][]{{"getTypeOfThis", "", "7"}, {"hasAnyTemplateTypes", "", "1"}, {"isArrayType", "", "4"}, {"getRestrictedTypeGivenToBooleanOutcome", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=global this, hasAnyTemplat...#418#1784958497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}}, 2), new String[][]{{"getTypeOfThis", "", "4"}, {"hasAnyTemplateTypes", "", "1"}, {"isArrayType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}}, 2), new String[][]{{"getTypeOfThis", "", "4"}, {"hasAnyTemplateTypes", "", "1"}, {"findPropertyType", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getAllSymbols", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}}), new String[][]{{"getTypeOfThis", "", "4"}, {"hasAnyTemplateTypes", "", "1"}, {"findPropertyType", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}}, 1), new String[][]{{"getTypeOfThis", "", "4"}, {"hasAnyTemplateTypes", "", "1"}, {"findPropertyType", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getRootNode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "1.5"}, {"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getReferences", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getRootNode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getReferences", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getReferences", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getReferences", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getRootNode", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.GlobalNamespace", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=global this, hasAnyTemplat...#418#1784958497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "-3"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getAllSymbols", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getParentScope", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getSlot", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getRootNode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getReferences", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getRootNode", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "java.util.List", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getReferences", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:9>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getOwnSlot", "java.lang.String", "1.5e300"}, {"com.google.javascript.jscomp.GlobalNamespace", "getOwnSlot", "java.lang.String", "SITLE"}, {"com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getParentScope", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "a"}, {"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "1.25"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "CALL_GET"}, {"com.google.javascript.jscomp.GlobalNamespace", "getParentScope", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "CALL_GET"}, {"com.google.javascript.jscomp.GlobalNamespace", "getParentScope", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"E.5"}, false, 2, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "java.util.List", "<null>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getAllSymbols", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getScope", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:6>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}), new String[][]{{"hasReferenceName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getScope", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:6>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getScope", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:0>"}}, 2), new String[][]{{"hasReferenceName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getScope", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:6>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getScope", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:0>"}}, 2), new String[][]{{"hasReferenceName", "", "3"}, {"clearResolved", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=global this, hasAnyTemplat...#418#1784958497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "+1123456789012345678901234567890"}}, 3), new String[][]{{"getSlot", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getParentScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getRootNode", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getRootNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:6>"}, false, 0, null, 3), new String[][]{{"getRootNode", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getSlot", new String[]{"java.lang.String"}, new String[]{"ALIASING_GET"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "ALIASING_GET"}, {"com.google.javascript.jscomp.GlobalNamespace", "getAllSymbols", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getScope", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:1>"}, {"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "java.util.List", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.GlobalNamespace", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getParentScope", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getRootNode", ""}}), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "7"}, {"getConstructor", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:global this, *): number {canBeCalled=true, getDisplayName=global this, getExtendedInterfacesCount=0, getMaxArguments=1, getMinArguments=1, getNormalizedReferenceName=global this, getPoss...#444#-2017876466", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getRootNode", ""}}, 1), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "7"}, {"getConstructor", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:global this, *): number {canBeCalled=true, getDisplayName=global this, getExtendedInterfacesCount=0, getMaxArguments=1, getMinArguments=1, getNormalizedReferenceName=global this, getPoss...#444#-2017876466", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:0>"}, false, 0, null, 1), new String[][]{{"getSlot", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getAllSymbols", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getReferences", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:0>"}}, 3), new String[][]{{"getDisplayName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("global this", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getAllSymbols", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getReferences", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:0>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "PROTOTYPE_GET"}}), new String[][]{{"getDisplayName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("global this", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getNormalizedReferenceName", "", "1"}, {"getImplicitPrototype", "", "0"}, {"isEnumType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "1.12345678"}, {"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "java.util.List", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.GlobalNamespace", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "1.12345678"}, {"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "java.util.List", "<null>"}}, 3), new String[][]{{"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=global this, hasAnyTemplat...#418#1784958497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "1.1234567890123456 "}}, 1), new String[][]{{"hasReferenceName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "1.1234567890123456 "}}, 1), new String[][]{{"getPropertyNames", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getRootNode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getParentScope", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}}), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}}), new String[][]{{"getOwnSlot", "java.lang.String", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}}, 1), new String[][]{{"getOwnSlot", "java.lang.String", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getScope", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:1>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 3), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getParentScope", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getOwnSlot", "java.lang.String", "0x123456789"}}, 2), new String[][]{{"getAllSymbols", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getParentScope", "", "7"}, {"getOwnPropertyJSDocInfo", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}}, 3), new String[][]{{"getOwnPropertyNames", "", "3"}, {"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"getConstructor", "", "3"}, {"getRestrictedTypeGivenToBooleanOutcome", "boolean", "7"}, {"getNormalizedReferenceName", "", "2"}, {"getParametersNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("PARAM_LIST {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, ge...#356#-829931776", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getReferences", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:6>"}}, 1), new String[][]{{"extendTemplateTypeMap", "com.google.javascript.rhino.jstype.TemplateTypeMap", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getReferences", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:6>"}}, 1), new String[][]{{"hasAnyTemplateTypes", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1), new String[][]{{"getImplicitPrototype", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("global this.prototype {canBeCalled=false, getDisplayName=global this.prototype, getNormalizedReferenceName=global this.prototype, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceN...#458#-166877855", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"getTypeOfThis", "", "7"}, {"getOwnPropertyNames", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:3>"}, false, 0, null, 3), new String[][]{{"getTypeOfThis", "", "4"}, {"defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "0"}, {"getNormalizedReferenceName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("global this", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getReferences", "com.google.javascript.jscomp.GlobalNamespace$Name", "<sample:3>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "0x123456789"}, {"com.google.javascript.jscomp.GlobalNamespace", "getParentScope", ""}}, 2), new String[][]{{"getCtorImplementedInterfaces", "", "7"}, {"firstMatch", "com.google.common.base.Predicate", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.common.base.Absent", actual.getClass().getName());
  assertEquals("Optional.absent() {isPresent=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "hasExternsRoot", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "GET"}}, 2), new String[][]{{"getCtorImplementedInterfaces", "", "7"}, {"skip", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "DT"}}, 2), new String[][]{{"getCtorImplementedInterfaces", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getRootNode", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getSlot", "java.lang.String", "PQT11x"}}, 2), new String[][]{{"getCtorImplementedInterfaces", "", "6"}, {"toSet", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getTypeOfThis", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 3), new String[][]{{"getPropertyNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getScope", new String[]{"com.google.javascript.jscomp.GlobalNamespace$Name"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getParentScope", ""}}, 3), new String[][]{{"getScope", "com.google.javascript.jscomp.GlobalNamespace$Name", "3"}, {"getTypeOfThis", "", "6"}, {"getRestrictedTypeGivenToBooleanOutcome", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#413#-1184760881", SearchInputFactory_scaffolding.observe(actual));
 }
}
