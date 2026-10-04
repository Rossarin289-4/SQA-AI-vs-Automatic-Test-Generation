package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "setSourceNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferReturnStatementsAsLastResort", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferReturnStatementsAsLastResort", "com.google.javascript.rhino.Node", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:1>", "<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferInheritance", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTopMostDefiningType", new String[]{"java.lang.String"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSubTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isUnknownType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "buildAndRegister", ""}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "buildAndRegister", ""}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferInheritance", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferTemplateTypeName", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "buildAndRegister", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:1>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node", "<null>", "<sample:2>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferTemplateTypeName", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setSource", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getReturnType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferInheritance", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferInheritance", "com.google.javascript.rhino.JSDocInfo", "<null>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", "com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node", "<sample:2>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, ...#403#429703790", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "matchesObjectContext", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isRegexpType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"getTypeOfThis", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("0 {getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getReferenceName=0, hasReferenceName=true, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, ...#381#-1614565400", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"getTopMostDefiningType", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setImplementedInterfaces", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasEqualCallType", "com.google.javascript.rhino.jstype.FunctionType", "<sample:5>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "0"}, {"getReturnType", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("0 {getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getReferenceName=0, hasReferenceName=true, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, ...#381#-1614565400", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "5"}, {"isInstanceType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (...[*]): None {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=...#432#-1165780811", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "isFunctionTypeDeclaration", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"getPropertyType", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasReferenceName=false, isAllType=false,...#383#-711003990", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"getAllImplementedInterfaces", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPropertyJSDocInfo", new String[]{"java.lang.String", "com.google.javascript.rhino.JSDocInfo", "boolean"}, new String[]{"@implements", "<null>", "true"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasProperty", "java.lang.String", "1.12345678"}, {"com.google.javascript.rhino.jstype.FunctionType", "isNativeObjectType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferTemplateTypeName", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "setSourceNode", "com.google.javascript.rhino.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeInferred", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:2>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeDeclared", new String[]{"java.lang.String"}, new String[]{"ORDINARY"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getPropertyType", "java.lang.String", "prototype"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isStringObjectType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasInstanceType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "setImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:6>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getSuperClassConstructor", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeInferred", new String[]{"java.lang.String"}, new String[]{"prototype"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getConstructor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forInterface", new String[]{"com.google.javascript.rhino.jstype.JSTypeRegistry", "java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "Heello, rWorlc", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:7>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrototype", new String[]{"com.google.javascript.rhino.jstype.FunctionPrototypeType"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isEmptyType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "unboxesTo", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "matchesInt32Context", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferInheritance", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo", "<null>", "<null>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.JSDocInfo", "<sample:9>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "buildAndRegister", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferInheritance", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.JSDocInfo", "<sample:11>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "buildAndRegister", ""}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferReturnType", "com.google.javascript.rhino.JSDocInfo", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferReturnType", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferTemplateTypeName", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo", "<sample:3>", "<sample:8>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferInheritance", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:7>", "<sample:1>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=false, hasReferenceName=true...#400#54120065", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forInterface", new String[]{"com.google.javascript.rhino.jstype.JSTypeRegistry", "java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "function (", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (this:function (): ? {canBeCalled=true, getMaxArguments=0, getMinArguments=0, getNormalizedReferenceName=function , getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValue...#412#-1195708833", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:5>", "<sample:4>", "<sample:10>"}, true), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "5"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forInterface", new String[]{"com.google.javascript.rhino.jstype.JSTypeRegistry", "java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "buildAndRegister", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferReturnStatementsAsLastResort", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo", "<null>", "<sample:4>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo", "<sample:6>", "<sample:5>"}}, 3), new String[][]{{"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "buildAndRegister", new String[]{}, new String[]{}, false, 33, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", "com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node", "<sample:1>", "<sample:4>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", "com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:3>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}, 1), new String[][]{{"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getPropertiesCount=2147483647, getReferenceName=null, getTem...#408#-1262204203", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrototype", new String[]{"com.google.javascript.rhino.jstype.FunctionPrototypeType"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getImplementedInterfaces", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "setImplementedInterfaces", "java.util.List", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:7>", "<sample:2>", "<sample:10>"}, true, 0, null, 1), new String[][]{{"findPropertyType", "java.lang.String", "5"}, {"getOwnPropertyNames", "", "7"}, {"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:7>", "<sample:6>", "<sample:2>"}, true), new String[][]{{"isPropertyInExterns", "java.lang.String", "6"}, {"isEnumType", "", "4"}, {"clearResolved", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=false, hasReferenceName=true...#400#54120065", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "setSourceNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "setSourceNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferReturnStatementsAsLastResort", "com.google.javascript.rhino.Node", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hashCode", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getIndexType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getIndexType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "equals", "java.lang.Object", "<i:-1>"}, {"com.google.javascript.rhino.jstype.FunctionType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:1>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getIndexType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}, {"com.google.javascript.rhino.jstype.FunctionType", "equals", "java.lang.Object", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}, {"com.google.javascript.rhino.jstype.FunctionType", "equals", "java.lang.Object", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getReturnType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "canBeCalled", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:1>", "<sample:10>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferInheritance", "com.google.javascript.rhino.JSDocInfo", "<sample:1>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}, {"com.google.javascript.rhino.jstype.FunctionType", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getImplicitPrototype", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.FunctionType", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSubTypes", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isUnknownType", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeDeclared", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getNormalizedReferenceName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeDeclared", new String[]{"java.lang.String"}, new String[]{"Heello, rWorlc"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setPrototype", "com.google.javascript.rhino.jstype.FunctionPrototypeType", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeDeclared", new String[]{"java.lang.String"}, new String[]{"Heello, rWorlc"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setPrototype", "com.google.javascript.rhino.jstype.FunctionPrototypeType", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "forgiveUnknownNames", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTemplateTypeName", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.rhino.jstype.FunctionType", "isUnknownType", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferInheritance", "com.google.javascript.rhino.JSDocInfo", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:0>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node", "<null>", "<sample:2>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferTemplateTypeName", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:1>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferTemplateTypeName", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node", "<sample:2>", "<sample:7>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node", "<sample:7>", "<sample:0>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo", "<null>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node", "<sample:6>", "<null>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo", "<null>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:10>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", "com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:6>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node", "<sample:5>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean", "JSC_INEXISTANS_PARAM", "<sample:3>", "false"}, {"com.google.javascript.rhino.jstype.FunctionType", "isNativeObjectType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:2>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:3>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isArrayType", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "hasUnknownSupertype", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isReturnTypeInferred", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getTopMostDefiningType", "java.lang.String", "1.12345678"}, {"com.google.javascript.rhino.jstype.FunctionType", "setInstanceType", "com.google.javascript.rhino.jstype.ObjectType", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:2>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "visit", "com.google.javascript.rhino.jstype.Visitor", "<sample:2>"}, {"com.google.javascript.rhino.jstype.FunctionType", "isCheckedUnknownType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "visit", "com.google.javascript.rhino.jstype.Visitor", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "visit", "com.google.javascript.rhino.jstype.Visitor", "<sample:1>"}, {"com.google.javascript.rhino.jstype.FunctionType", "isCheckedUnknownType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isBooleanValueType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferInheritance", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", "com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node", "<sample:2>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=false, hasReferenceName=true...#400#54120065", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isUnknownType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, ...#403#429703790", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, ...#403#429703790", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"isNoObjectType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=false, hasReferenceName=true...#400#54120065", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getPropertiesCount=2147483647, getReferenceName=null, getTem...#408#-1262204203", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, ...#403#429703790", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getPropertiesCount=2147483647, getReferenceName=null, getTem...#408#-1262204203", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getPropertiesCount=2147483647, getReferenceName=null, getTem...#408#-1262204203", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"isEnumType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=false, hasReferenceName=true...#400#54120065", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"isConstructor", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"getIndexType", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toObjectType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"getPrototype", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionPrototypeType", actual.getClass().getName());
  assertEquals("0.prototype {getNormalizedReferenceName=0.prototype, getPossibleToBooleanOutcomes=TRUE, getReferenceName=0.prototype, hasReferenceName=true, isAllType=false, isArrayType=false, isBooleanObjectType=fal...#410#-310408607", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"getParametersNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LP {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=83, hasChildre...#377#-202823702", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"getJSDocInfo", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isConstructor", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isCheckedUnknownType=false, isConstructor=false, ...#373#1736952704", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTopMostDefiningType", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNominalType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isUnknownType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isRegexpType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"getJSDocInfo", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "5"}, {"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrototypeBasedOn", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getReferenceName", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"getImplementedInterfaces", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrettyPrint", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "buildAndRegister", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertiesCount", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferReturnType", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setImplementedInterfaces", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferInheritance", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "setSourceNode", "com.google.javascript.rhino.Node", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "detectImplicitPrototypeCycle", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setPrototypeBasedOn", "com.google.javascript.rhino.jstype.ObjectType", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "setSourceNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "setSourceNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "buildAndRegister", ""}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferReturnStatementsAsLastResort", "com.google.javascript.rhino.Node", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "canBeCalled", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getParametersNode", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "setInstanceType", "com.google.javascript.rhino.jstype.ObjectType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "testForEqualityHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isEnumType", ""}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getParameterType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hashCode", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getParameterType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getIndexType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isConstructor", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getReturnType", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:1>", "<sample:6>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferInheritance", "com.google.javascript.rhino.JSDocInfo", "<sample:1>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:0>", "<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferInheritance", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "buildAndRegister", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:2>", "<sample:8>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferInheritance", "com.google.javascript.rhino.JSDocInfo", "<sample:1>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isCheckedUnknownType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasUnknownSupertype", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTemplateTypeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isEnumElementType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTemplateTypeName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getInstanceType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forInterface", new String[]{"com.google.javascript.rhino.jstype.JSTypeRegistry", "java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "call", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getNormalizedReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferTemplateTypeName", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "buildAndRegister", ""}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "buildAndRegister", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isResolved", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNative", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:9>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferTemplateTypeName", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "buildAndRegister", ""}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:10>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node", "<null>", "<sample:2>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferTemplateTypeName", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "canTestForEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:7>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isRecordType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isRegexpType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyInExterns", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasCachedValues", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNullable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "matchesUint32Context", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getAllImplementedInterfaces", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isInterface", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isStringObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getInternalArrowType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNamedType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasUnknownSupertype", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isArrayType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNullType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isPropertyInExterns", "java.lang.String", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isReturnTypeInferred", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setInstanceType", "com.google.javascript.rhino.jstype.ObjectType", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "visit", "com.google.javascript.rhino.jstype.Visitor", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "visit", "com.google.javascript.rhino.jstype.Visitor", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "visit", "com.google.javascript.rhino.jstype.Visitor", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNullable", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isPropertyInExterns", "java.lang.String", "1.1234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", new String[]{"com.google.javascript.rhino.JSDocInfo", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:3>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferInheritance", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferThisType", "com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node", "<sample:2>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isFunctionType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isStringObjectType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getPropertiesCount=2147483647, getReferenceName=null, getTem...#408#-1262204203", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ArrowType", actual.getClass().getName());
  assertEquals("{canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDateT...#366#1024313498", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoObjectType", actual.getClass().getName());
  assertEquals("NoObject {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=null, get...#411#1123732112", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getCtorImplementedInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,boolean", "Function", "<sample:0>", "true", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=false, hasReferenceName=true...#400#54120065", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getOwnPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNominalType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"getPropertyNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesUint32Context", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "resolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<null>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"getSuperClassConstructor", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (this:Object, *): ? {canBeCalled=true, getMaxArguments=1, getMinArguments=0, getNormalizedReferenceName=Object, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=tr...#407#-1272829117", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"isNoObjectType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "testForEqualityHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isStringObjectType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isStringValueType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"getTemplateTypeName", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean", "2020-01-01", "<sample:3>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isTemplateType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}, {"com.google.javascript.rhino.jstype.FunctionType", "hasCachedValues", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "unboxesTo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isOrdinaryFunction", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"getPrototype", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionPrototypeType", actual.getClass().getName());
  assertEquals("0.prototype {getNormalizedReferenceName=0.prototype, getPossibleToBooleanOutcomes=TRUE, getReferenceName=0.prototype, hasReferenceName=true, isAllType=false, isArrayType=false, isBooleanObjectType=fal...#410#-310408607", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "collectPropertyNames", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNoObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getConstructor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getParametersNode", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeInferred", new String[]{"java.lang.String"}, new String[]{"abc"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}, {"com.google.javascript.rhino.jstype.FunctionType", "equals", "java.lang.Object", "<b:true>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isBooleanValueType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasEqualCallType", new String[]{"com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean", "boolean"}, new String[]{"0x123456789", "<sample:7>", "false", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineInferredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean"}, new String[]{"1.12345678901234567", "<sample:6>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEnumElementType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setPrettyPrint", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toDebugHashCodeString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "canTestForShallowEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:7>", "<sample:0>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=false, hasReferenceName=true...#400#54120065", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(function (this:0, *, *, *): 0|sample.<boolean>) {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#415#-1083326656", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "matchesUint32Context", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypeOfThis", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesNumberContext", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertyType", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEnumType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setInstanceType", "com.google.javascript.rhino.jstype.ObjectType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getInstanceType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isInterface", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getTemplateTypeName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferReturnType", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forceResolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isUnknownType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasUnknownSupertype", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isString", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isBooleanObjectType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "clearResolved", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesStringContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNumberValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getTopMostDefiningType", "java.lang.String", "JSC_TYPE_REDEFINITION"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferInheritance", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}, {"com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isVoidType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean"}, new String[]{"JSC_INEXISTANT_PARAM", "<sample:2>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getRestrictedTypeGivenToBooleanOutcome", "boolean", "true"}, {"com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeDeclared", "java.lang.String", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferReturnStatementsAsLastResort", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferReturnStatementsAsLastResort", "com.google.javascript.rhino.Node", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isRegexpType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNominalType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEquivalent", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNative", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isUnionType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasReferenceName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getSource", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "hasCachedValues", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesInt32Context", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNumberObjectType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "autoboxesTo", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isEnumType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getMinArguments", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeDeclared", new String[]{"java.lang.String"}, new String[]{"1.25"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "cast", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasReferenceName=true, ...#398#1245317421", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferTemplateTypeName", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isBooleanObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getSuperClassConstructor", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferParameterTypes", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isRecordType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isFunctionPrototypeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasOwnDeclaredProperty", "java.lang.String", ", "}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:7>"}, {"com.google.javascript.rhino.jstype.FunctionType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forgiveUnknownNames", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "dereference", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getMinArguments", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setInstanceType", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNoObjectType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPrototype", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isAllType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasOwnDeclaredProperty", new String[]{"java.lang.String"}, new String[]{"JSC_EXTENDS_NON_OBJECT"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<null>", "<sample:7>", "<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isDateType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getPropertiesCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isTheObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "canAssignTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isBooleanObjectType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getImplementedInterfaces", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "cast", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=false, hasReferenceName=true...#400#54120065", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSuperClassConstructor", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEnumElementType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isVoidType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeDeclared", "java.lang.String", "0xFFFFFFFF"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toString", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isStringValueType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setResolvedTypeInternal", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrototype", new String[]{"com.google.javascript.rhino.jstype.FunctionPrototypeType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setValidator", "com.google.common.base.Predicate", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "cast", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNumberObjectType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isResolved", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "detectImplicitPrototypeCycle", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setImplementedInterfaces", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getMinArguments", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getTopMostDefiningType", "java.lang.String", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionTypeBuilder", "com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", new String[]{"com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionTypeBuilder", "inferFromOverriddenFunction", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node", "<sample:5>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertiesCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isTemplateType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getRestrictedTypeGivenToBooleanOutcome", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "equals", "java.lang.Object", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "5"}, {"isInstanceType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setImplementedInterfaces", new String[]{"java.util.List"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNumber", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNativeObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setResolvedTypeInternal", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:6>"}, {"com.google.javascript.rhino.jstype.FunctionType", "matchesObjectContext", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setPrototypeBasedOn", "com.google.javascript.rhino.jstype.ObjectType", "<sample:7>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getCtorImplementedInterfaces", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getImplementedInterfaces", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getOwnPropertyNames", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isStringValueType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:6>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrettyPrint", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "matchesStringContext", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isCheckedUnknownType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNoType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNumberObjectType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesObjectContext", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getNormalizedReferenceName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getNormalizedReferenceName", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
}
