package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DevirtualizePrototypeMethods", "com.google.javascript.jscomp.DevirtualizePrototypeMethods", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:3>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.DevirtualizePrototypeMethods", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isOrdinaryFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeInferred", "java.lang.String", "11E-5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "canBeCalled", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}, {"com.google.javascript.rhino.jstype.FunctionType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSource", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getMaxArguments=3, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanceType=true, hasUnkno...#392#-1599666771", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getImplementedInterfaces", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isInterface", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getConstructor", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getOwnPropertyJSDocInfo", "java.lang.String", "a"}, {"com.google.javascript.rhino.jstype.FunctionType", "isInterface", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasProperty", new String[]{"java.lang.String"}, new String[]{"1.4"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "matchesObjectContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSuperClassConstructor", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "unboxesTo", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoObjectType", actual.getClass().getName());
  assertEquals("NoObject {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=null, getTemplateTypeName=null, hasCachedV...#398#-1799864820", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTopMostDefiningType", new String[]{"java.lang.String"}, new String[]{"thisTApe"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setResolvedTypeInternal", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setSource", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.rhino.jstype.FunctionType", "setImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 1, new String[][]{}, 1), new String[][]{{"getTopMostDefiningType", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,boolean", "prototype", "<sample:6>", "false", "false"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:5>", "<sample:0>", "<sample:6>"}, true, 0, null, 1), new String[][]{{"isAllType", "", "4"}, {"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("0 {getPossibleToBooleanOutcomes=TRUE, getReferenceName=0, hasReferenceName=true, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, is...#372#520374148", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPropertyJSDocInfo", new String[]{"java.lang.String", "com.google.javascript.rhino.JSDocInfo", "boolean"}, new String[]{"1.5e200", "<null>", "true"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isRegexpType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:5>", "<sample:3>", "<sample:6>"}, true, 0, null, 3), new String[][]{{"getAllImplementedInterfaces", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNativeObjectType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeInferred", "java.lang.String", "prototype"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setImplementedInterfaces", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasUnknownSupertype", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "equals", "java.lang.Object", "<b:false>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrototype", new String[]{"com.google.javascript.rhino.jstype.FunctionPrototypeType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getParameters", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEnumElementType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setPrototype", "com.google.javascript.rhino.jstype.FunctionPrototypeType", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 0, null, 2), new String[][]{{"getSubTypes", "", "3"}, {"getInstanceType", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertyType", new String[]{"java.lang.String"}, new String[]{"prototype"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "dereference", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>", "<sample:5>"}, true), new String[][]{{"isInstanceType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"isTemplateType", "", "7"}, {"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "5"}, {"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "cast", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, true), new String[][]{{"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>", "<sample:12>"}, true), new String[][]{{"getConstructor", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (this:Boolean, *): boolean {canBeCalled=true, getMaxArguments=1, getMinArguments=1, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanceType=true, ha...#398#-482772886", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getMinArguments", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isBooleanValueType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getReferenceName", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{...}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isOrdinaryFunction", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isDateType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEmptyType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getInstanceType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNumberObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getAllImplementedInterfaces", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNullable", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:1>"}, {"com.google.javascript.rhino.jstype.FunctionType", "isBooleanValueType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "canAssignTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeInferred", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456ORDINARY0x123456789"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "canAssignTo", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getOwnPropertyJSDocInfo", new String[]{"java.lang.String"}, new String[]{"prototype"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasEqualCallType", new String[]{"com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getCtorImplementedInterfaces", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "dereference", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isOrdinaryFunction", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "autoboxesTo", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getImplementedInterfaces", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,boolean", "Function", "<sample:0>", "true", "true"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSuperClassConstructor", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "canTestForEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:14>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeInferred", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isArrayType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isInstanceType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertiesCount", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isBooleanValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isOrdinaryFunction", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getConstructor", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNoObjectType", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isOrdinaryFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setSource", "com.google.javascript.rhino.Node", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNoType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getImplementedInterfaces", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isStringValueType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getParametersNode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNumberValueType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isFunctionType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesUint32Context", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getIndexType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasReferenceName", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasOwnDeclaredProperty", new String[]{"java.lang.String"}, new String[]{"P0x1F"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "clearResolved", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isVoidType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"forgiveUnknownNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getJSDocInfo", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNumberObjectType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "clearResolved", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isFunctionPrototypeType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "autoboxesTo", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setImplementedInterfaces", "java.util.List", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"/5"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNominalType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getParameterType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getAllImplementedInterfaces", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNative", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "canBeCalled", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrototype", new String[]{"com.google.javascript.rhino.jstype.FunctionPrototypeType"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getSource", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isNumberObjectType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasInstanceType", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forgiveUnknownNames", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayType=false,...#381#740315998", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getOwnPropertyJSDocInfo", new String[]{"java.lang.String"}, new String[]{"1e20"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNominalType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasReferenceName", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getConstructor", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toObjectType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "dereference", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isStringValueType", ""}}, 1), new String[][]{{"canBeCalled", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNullable", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "canTestForEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasUnknownSupertype", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "findPropertyType", "java.lang.String", "Hlllo, World"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasOwnProperty", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isBooleanObjectType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNominalType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "detectImplicitPrototypeCycle", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeDeclared", "java.lang.String", "12:30:45"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toObjectType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "detectImplicitPrototypeCycle", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "dereference", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"isInstanceType", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNoType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNullType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:4>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "collectPropertyNames", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isUnknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "detectImplicitPrototypeCycle", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:0>", "<sample:6>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isArrayType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasReferenceName", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "hasProperty", "java.lang.String", "i"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isObject", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNamedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNativeObjectType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPrototype", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:9>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasUnknownSupertype", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getOwnPropertyNames", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesStringContext", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isResolved", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isFunctionType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasUnknownSupertype", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getPropertyType", "java.lang.String", "INTERFACE"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "dereference", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isRegexpType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "detectImplicitPrototypeCycle", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeInferred", "java.lang.String", "(.5d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNumberObjectType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNativeObjectType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forgiveUnknownNames", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrototype", new String[]{"com.google.javascript.rhino.jstype.FunctionPrototypeType"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeDeclared", new String[]{"java.lang.String"}, new String[]{"true"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNoType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasOwnProperty", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:5>", "<sample:6>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getMaxArguments=3, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanceType=true, hasUnkno...#392#-1599666771", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSuperClassConstructor", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeInferred", new String[]{"java.lang.String"}, new String[]{"-l.0"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isEmptyType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "canTestForShallowEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasCachedValues", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "autoboxesTo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNative", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getMinArguments", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "findPropertyType", "java.lang.String", "0e1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasProperty", new String[]{"java.lang.String"}, new String[]{"...["}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyInExterns", new String[]{"java.lang.String"}, new String[]{"--"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getJSDocInfo", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTemplateTypeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNamedType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getImplicitPrototype", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isBooleanValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "matchesInt32Context", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isNominalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineInferredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean"}, new String[]{"ORDJNARY-1", "<sample:1>", "false"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getImplementedInterfaces", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isFunctionPrototypeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEmptyType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setInstanceType", "com.google.javascript.rhino.jstype.ObjectType", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getAllImplementedInterfaces", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasReferenceName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNamedType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getParametersNode", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isInterface", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "unboxesTo", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNoType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isStringValueType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasUnknownSupertype", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getIndexType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isVoidType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isUnionType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:2>"}, true), new String[][]{{"isInstanceType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getMaxArguments=3, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanceType=true, hasUnkno...#392#-1599666771", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean"}, new String[]{"a,b,c", "<sample:5>", "false"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isAllType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesUint32Context", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getReturnType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getOwnPropertyJSDocInfo", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61Titld"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toObjectType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "clearResolved", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getParameterType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getSource", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPropertyJSDocInfo", new String[]{"java.lang.String", "com.google.javascript.rhino.JSDocInfo", "boolean"}, new String[]{"0.12345678901234567", "<sample:0>", "false"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNominalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getJSDocInfo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "unboxesTo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeDeclared", "java.lang.String", "i"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isTheObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:1>"}, true), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasEqualCallType", new String[]{"com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getInstanceType", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setImplementedInterfaces", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setSource", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setSource", "com.google.javascript.rhino.Node", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "dereference", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNoObjectType", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "resolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasEqualCallType", "com.google.javascript.rhino.jstype.FunctionType", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getCtorImplementedInterfaces", ""}}), new String[][]{{"isString", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isOrdinaryFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNativeObjectType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getPossibleToBooleanOutcomes=EMPTY, getPropertiesCount=2147483647, getReferenceName=null, getTemplateTypeName=null, hasCachedValu...#395#-1657693781", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "canTestForEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setSource", "com.google.javascript.rhino.Node", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean", "this:", "<sample:6>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false), new String[][]{{"hasInstanceType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesInt32Context", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}, {"com.google.javascript.rhino.jstype.FunctionType", "isRecordType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "cast", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayType=false,...#381#740315998", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setResolvedTypeInternal", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNullable", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isFunctionType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getImplicitPrototype", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getCtorImplementedInterfaces", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false), new String[][]{{"getCtorImplementedInterfaces", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"*2"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isEnumType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getReferenceName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{...}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getCtorImplementedInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}, {"com.google.javascript.rhino.jstype.FunctionType", "isRecordType", ""}}), new String[][]{{"removeAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isRegexpType", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isArrayType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertiesCount", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "canBeCalled", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:16>"}, true, 0, null, 1), new String[][]{{"getRestrictedTypeGivenToBooleanOutcome", "boolean", "1"}, {"isUnionType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "autoboxesTo", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertyType", new String[]{"java.lang.String"}, new String[]{"--1I"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasCachedValues", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:4>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isStringObjectType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "collectPropertyNames", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "restrictByNotNullOrUndefined", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DevirtualizePrototypeMethods", "com.google.javascript.jscomp.DevirtualizePrototypeMethods", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.DevirtualizePrototypeMethods", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setSource", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"getPossibleToBooleanOutcomes", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNullable", ""}}, 2), new String[][]{{"getSuperClassConstructor", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getCtorImplementedInterfaces", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getPossibleToBooleanOutcomes=EMPTY, getPropertiesCount=2147483647, getReferenceName=null, getTemplateTypeName=null, hasCachedValu...#395#-1657693781", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isOrdinaryFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getOwnPropertyJSDocInfo", "java.lang.String", "oull"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasProperty", new String[]{"java.lang.String"}, new String[]{"11E-5"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toObjectType", ""}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEnumElementType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "canBeCalled", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:0>", "<sample:0>", "<sample:0>"}, true), new String[][]{{"findPropertyType", "java.lang.String", "5"}, {"isInstanceType", "", "1"}, {"isNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNativeObjectType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isInterface", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypeOfThis", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEnumElementType", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 4, new String[][]{}), new String[][]{{"findPropertyType", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean", "boolean"}, new String[]{"1.", "<sample:1>", "true", "true"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "matchesUint32Context", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getMaxArguments", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false), new String[][]{{"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getCtorImplementedInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 1), new String[][]{{"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean", "boolean"}, new String[]{"1.f", "<sample:5>", "true", "false"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hashCode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isStringObjectType", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean"}, new String[]{"11.5d", "<sample:4>", "false"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"isArrayType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEnumElementType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getAllImplementedInterfaces", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasProperty", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeDeclared", "java.lang.String", "functioon ("}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasOwnDeclaredProperty", new String[]{"java.lang.String"}, new String[]{"1.5e"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getReturnType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyInExterns", new String[]{"java.lang.String"}, new String[]{"0u"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "matchesStringContext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getAllImplementedInterfaces", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getSubTypes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNominalType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getParameters", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "dereference", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toObjectType", ""}}), new String[][]{{"getIndexType", "", "5"}, {"isCheckedUnknownType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getMinArguments", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNoType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertiesCount", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getInstanceType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "dereference", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getImplicitPrototype", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getJSDocInfo", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isTemplateType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isBooleanObjectType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getMaxArguments", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isRegexpType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNumberValueType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "clearResolved", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isFunctionType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toObjectType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSource", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSubTypes", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isEmptyType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasOwnProperty", new String[]{"java.lang.String"}, new String[]{"call"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesObjectContext", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<null>", "<sample:4>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNativeObjectType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isAllType", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:3>", "<sample:0>", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayType=false,...#381#740315998", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isObject", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isObject", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isTemplateType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isArrayType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isBooleanObjectType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesInt32Context", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasReferenceName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "collectPropertyNames", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSubTypes", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "canAssignTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypeOfThis", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrototypeBasedOn", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toString", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNullType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "detectImplicitPrototypeCycle", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getConstructor", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isInterface", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setImplementedInterfaces", "java.util.List", "<null>"}, {"com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeDeclared", "java.lang.String", "prototype"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "testForEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}), new String[][]{{"getJSDocInfo", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getMaxArguments", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeDeclared", "java.lang.String", "$self1.5d"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasEqualCallType", new String[]{"com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hashCode", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertiesCount", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
