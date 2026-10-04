package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameProperties", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameWithWrappers", "java.util.Map", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:4>", "<sample:6>", "false", "false", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:2>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getObjectIdInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder,java.util.List", "<sample:0>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", "boolean", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:4>", "<sample:2>", "false", "true", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldSerialize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getInjectables", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder,java.util.List", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addInjectables", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder,java.util.List", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addGetterMethod", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>", "<sample:6>", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{",ignore="}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:4>", "true", "false", "true"}}, 2), new String[][]{{"couldSerialize", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.util.List#get(1 params)][visible=false,ignore=true,explicitName=true]] {getInternalName=0, getName=0, hasCo...#359#-1469661555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addAll", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_setterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:7>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDefaultValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#576264501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "reportProblem", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_doAddInjectable", "java.lang.Object,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findInclusion", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:2>", "<sample:6>", "false", "false", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getNonConstructorMutator", ""}}), new String[][]{{"valueFor", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface com.fasterxml.jackson.annotation.JsonInclude {getAnnotatedInterfaces=?, getAnnotations=?, getCanonicalName=com.fasterxml.jackson.annotation.JsonInclude, getClasses=[class com.fasterxml.jacks...#755#-1498942298", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addSetterMethod", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:2>", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder,java.util.List", "<sample:7>", "<sample:2>"}}), new String[][]{{"findAccess", "", "1"}, {"getInternalName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property 'null'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=null, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isEx...#282#1610690444", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "java.util.List"}, new String[]{"<sample:7>", "<empty>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getPrimaryMember", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:5>", "false", "true", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedParameter", actual.getClass().getName());
  assertEquals("[parameter #6, annotations: [null]] {getIndex=6, getModifiers=6, getName=, isPublic=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #6, annotations: [null]][visible=true,ignore=false,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasC...#362#1613654077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:6>", "<sample:1>", "true", "true", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", ""}}), new String[][]{{"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "java.lang.String"}, new String[]{"<sample:3>", ",explicitName="}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameProperties", "java.util.Map", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property ',explicitName='; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=,explicitName=, getName=,explicitName=, hasConstructorParameter=false, hasField=false, hasGe...#315#370813370", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameUsing", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<empty>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterField", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:5>", "<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addMethods", "java.util.Map", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addGetterMethod", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:0>", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterMethod", ""}}, 3), new String[][]{{"removeConstructors", "", "7"}, {"anyVisible", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<empty>", "<sample:2>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addMethods", "java.util.Map", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", "java.util.Map", "<sample:5>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterMethod", ""}}, 1), new String[][]{{"compareTo", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "0"}, {"findAccess", "", "1"}, {"mergeAnnotations", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldSerialize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "toString", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:1>", "true", "false", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values][visible=false,ignore=false,explicitName=true], getter(s): null, setter(s): null...#402#475334774", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findViews", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:1>", "<null>", "false", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", "java.util.Collection", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): [method java.lang.String#format(2 params)][visible=true,ignore=true,explicitName=false], setter(s): null] {getInternalName=sample, getName=, ha...#364#1774813701", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterMethod", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreators", "java.util.Map", "<sample:6>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", "java.util.Map", "<empty>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getConfig", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getGetter", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:5>", "false", "false", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findObjectIdInfo", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=a, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#-53468089", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getGetter", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:3>", "true", "true", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", "boolean", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "trimByVisibility", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.util.List#get(1 params)][visible=true,ignore=false,explicitName=false]] {getInternalName=, getName=, hasConstruct...#354#-1884047069", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getGetter", new String[]{}, new String[]{}, false, 33, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:1>", "<sample:7>", "false", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.lang.String#format(2 params)][visible=true,ignore=true,explicitName=false]] {getInternalName=sample, getName=, ha...#364#1612482935", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeIgnored", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:2>", "<sample:6>", "false", "false", "false"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "trimByVisibility", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeIgnored", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<null>", "<sample:0>", "true", "false", "true"}}, 3), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, i...#285#1990095436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMutator", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:4>", "false", "false", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isTypeId", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedField", actual.getClass().getName());
  assertEquals("[field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#wildcard] {getAnnotationCount=0, getFullName=generated.algorithm.SearchInputFactory_scaffolding$TypeSampl.., getModifiers=1, getNa...#246#991767119", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#wildcard][visible=false,ignore=true,explicitName=false], getter(s): null, setter(s): null]...#395#-333120387", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getWrapperName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:3>", "<i:0>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:3>", "true", "false", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.util.Arrays#asList(1 params)][visible=false,ignore=true,explicitName=false]] {getInternalName=0, getName=sampl...#369#1305937018", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getWrapperName", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findExplicitNames", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:2>", "true", "false", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.util.Arrays#asList(1 params)][visible=false,ignore=true,explicitName=true]] {getInternalName=sample, getNam...#369#1870806131", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getWrapperName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", "java.lang.String", "[1,2]"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:1>", "false", "false", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:2>", "<sample:3>", "true", "false", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:2>", "<sample:7>", "true", "false", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:1>", "<sample:1>", "true", "false", "false"}}, 3), new String[][]{{"removeNonVisible", "boolean", "6"}, {"getField", "", "4"}, {"findInclusion", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"y"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", "java.util.Collection", "<empty>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:1>", "<sample:1>", "true", "true", "true"}}, 2), new String[][]{{"removeNonVisible", "boolean", "6"}, {"getField", "", "4"}, {"findInclusion", "", "7"}, {"withValueInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_NULL,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=NON_NULL}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: [parameter #2, annotations: [null]][visible=true,ignore=true,explicitName=true], field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorPa...#348#-347166486", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{",ignor"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:7>", "false", "true", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:8>", "<sample:1>", "true", "true", "true"}}), new String[][]{{"addAll", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "7"}, {"hasGetter", "", "3"}, {"anyIgnorals", "", "7"}, {"findExplicitNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[{sample}0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #9, annotations: null][visible=true,ignore=true,explicitName=true], field(s): null, getter(s): [method java.util.Arrays#asList(1 params)][visible=true,ignore=fals...#438#518780922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"HT*m7l,!Woqlmd"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:7>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:6>", "false", "true", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:8>", "<sample:4>", "true", "true", "true"}}), new String[][]{{"removeNonVisible", "boolean", "3"}, {"anyVisible", "", "1"}, {"anyIgnorals", "", "3"}, {"findExplicitNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[<a><b>t</b></a>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: [parameter #9, annotations: null][visible=true,ignore=true,explicitName=true], field(s): null, getter(s): [method java.util.Arrays#asList(1 params)][visible=true,ignore=false,expl...#427#1359127940", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"Ttle"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:5>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:6>", "false", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:8>", "<sample:0>", "true", "true", "true"}}), new String[][]{{"removeNonVisible", "boolean", "1"}, {"anyVisible", "", "1"}, {"anyIgnorals", "", "3"}, {"findExplicitNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: [parameter #9, annotations: null][visible=true,ignore=true,explicitName=true], field(s): null, getter(s): [method java.util.Arrays#asList(1 params)][visible=true,ignore=t...#436#314306632", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{","}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:4>", "<sample:0>", "true", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:2>", "<i:1>"}}), new String[][]{{"removeNonVisible", "boolean", "1"}, {"anyVisible", "", "7"}, {"anyIgnorals", "", "3"}, {"findExplicitNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: [parameter #5, annotations: null][visible=true,ignore=true,explicitName=true], field(s): null, getter(s): null, setter(s): null] {getInternalName=<a><b>t</b></a>, getName=, has...#361#-824630775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:4>", "<sample:0>", "true", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:2>", "<i:1>"}}), new String[][]{{"removeNonVisible", "boolean", "1"}, {"anyVisible", "", "7"}, {"anyIgnorals", "", "3"}, {"findExplicitNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: [parameter #5, annotations: null][visible=true,ignore=true,explicitName=true], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstru...#354#588580532", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:0>", "true", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:1>", "<i:1>"}}), new String[][]{{"removeNonVisible", "boolean", "6"}, {"anyVisible", "", "7"}, {"anyIgnorals", "", "3"}, {"findExplicitNames", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: [parameter #6, annotations: [null]][visible=true,ignore=true,explicitName=true], field(s): null, getter(s): null, setter(s): null] {getInternalName=<a><b>t</b></a>, getName=, h...#363#651287510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_sortProperties", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getClassDef", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameWithWrappers", "java.util.Map", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_sortProperties", "java.util.Map", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getProperties", ""}}, 3), new String[][]{{"getModifiers", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedField", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:5>", "<sample:14>", "false", "false", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_setterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldDeserialize", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:6>", "<sample:3>", "true", "true", "false"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember", "java.lang.Object"}, new String[]{"<sample:4>", "<i:36>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_setterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:5>", "true", "false", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): [method java.util.Arrays#asList(1 params)][visible=false,ignore=true,explicitName=true], setter(s): null] {getInternalName=0, getName=sample...#366#-1025291121", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "java.lang.String"}, new String[]{"<sample:2>", "TITLE"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getJsonValueMethod", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", "java.util.Map,java.lang.String", "<sample:6>", "2147483648"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getIgnoredPropertyNames", ""}}), new String[][]{{"findInclusion", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:4>", "<sample:1>", "false", "false", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldDeserialize", ""}}), new String[][]{{"isPublic", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<null>", "false", "true", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:3>"}}, 2), new String[][]{{"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<null>", "false", "true", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findObjectIdInfo", ""}}, 1), new String[][]{{"hasNext", "", "4"}, {"next", "", "0"}, {"addOrOverride", "java.lang.annotation.Annotation", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #8, annotations: {class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy}][visible=true,ignore=false,explicitName=false], fi...#450#-1122050209", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false, 36, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeIgnored", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<null>", "<sample:4>", "true", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getSetter", ""}}, 2), new String[][]{{"next", "", "4"}, {"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false, 31, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:1>", "<sample:6>", "true", "true", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:2>", "<sample:6>", "false", "false", "true"}}, 1), new String[][]{{"next", "", "7"}, {"getMember", "", "6"}, {"getDeclaredAnnotations", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.annotation.Annotation;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: [parameter #3, annotations: [null]][visible=false,ignore=true,explicitName=false], [parameter #2, annotations: [null]][visible=true,ignore=false,explicitName=true], field(s): n...#432#1768846971", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addMethods", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_doAddInjectable", "java.lang.Object,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<i:0>", "<null>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_doAddInjectable", "java.lang.Object,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<i:2>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:1>", "<sample:14>", "true", "false", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:7>", "false", "true", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", ""}}, 2), new String[][]{{"next", "", "7"}, {"addIfNotPresent", "java.lang.annotation.Annotation", "4"}, {"getIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: [parameter #8, annotations: {class java.lang.Integer=GeneratedTestInputProxy}][visible=true,ignore=false,explicitName=false], field(s): null, getter(s): null, setter(s): null] {ge...#392#916271410", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_doAddInjectable", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<i:0>", "<sample:7>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreatorParam", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedAccessor", "java.util.Map", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_doAddInjectable", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<i:0>", "<sample:2>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedAccessor", "java.util.Map", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getSetter", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<null>", "<sample:2>", "false", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "findPOJOBuilderClass", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getPropertyMap", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", "java.util.Map", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_doAddInjectable", "java.lang.Object,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<i:-1>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collect", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getJsonValueMethod", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addMethods", "java.util.Map", "<empty>"}}, 2), new String[][]{{"getObjectIdInfo", "", "0"}, {"getAnnotationIntrospector", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collect", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collectAll", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addSetterMethod", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addMethods", "java.util.Map", "<sample:5>"}}, 3), new String[][]{{"getAnyGetter", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:2>", "<sample:0>", "false", "false", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", new String[]{"boolean"}, new String[]{"false"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:5>", "true", "true", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:1>", "<sample:7>", "true", "true", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonProperty$Access", actual.getClass().getName());
  assertEquals("AUTO", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#wildcard][visible=true,ignore=false,explicitName=true], getter(s): [method java.lang...#483#-2002684799", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", new String[]{"boolean"}, new String[]{"false"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:4>", "true", "false", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:0>", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.lang.String#format(2 params)][visible=false,ignore=false,explicitName=true]] {getInternalName=0, getName=0,...#365#-2072844273", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", new String[]{"boolean"}, new String[]{"false"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:4>", "true", "false", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:0>", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.lang.String#format(2 params)][visible=false,ignore=false,explicitName=true]] {getInternalName=, getName=, hasCons...#357#1635481552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:4>", "<sample:5>", "true", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDescription", ""}}), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:1>", "<sample:5>", "false", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", "boolean", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #2, annotations: [null]][visible=true,ignore=true,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasCon...#360#-1910906036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeIgnored", new String[]{}, new String[]{}, false, 36, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:11>", "<sample:5>", "true", "false", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "compareTo", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getSetter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property ''; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicitly...#274#-1269994214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#576264501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:2>", "true", "true", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#map][visible=true,ignore=true,explicitName=true], getter(s): null, setter(s): null] {getInter...#384#-1658767435", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:4>", "true", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeConstructors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#map][visible=true,ignore=true,explicitName=true], getter(s): null, setter(s): null] {getInter...#384#-1658767435", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "findPOJOBuilderClass", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:3>", "true", "true", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: null, field(s): null, getter(s): [method java.lang.String#format(2 params)][visible=true,ignore=false,explicitName=false], setter(s): null] {getInternalName=, getName=, hasConstru...#356#1183922961", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:3>", "true", "true", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: null, field(s): null, getter(s): [method java.lang.String#format(2 params)][visible=true,ignore=false,explicitName=false], setter(s): null] {getInternalName=0, getName=, hasConstr...#357#204372763", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:3>", "true", "true", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): [method java.lang.String#format(2 params)][visible=true,ignore=false,explicitName=false], setter(s): null] {getInternalName=0, getName=0,...#367#-1196630201", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:3>", "true", "true", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): [method java.lang.String#format(2 params)][visible=true,ignore=false,explicitName=false], setter(s): null] {getInternalName=, getName=, hasCons...#359#1709830984", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getName", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:3>", "true", "true", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): [method java.lang.String#format(2 params)][visible=true,ignore=false,explicitName=false], setter(s): null] {getInternalName=a, getName=0,...#367#1785756534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addInjectables", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeConstructors", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:1>", "<s:b>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", "java.util.Collection", "<empty>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldDeserialize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicitly...#274#-1269994214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:1>", "<s:b>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", "java.util.Collection", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:2>", "<s:b>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", "java.util.Collection", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#576264501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:2>", "<s:b>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", "java.util.Collection", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=a, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#-53468089", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:6>", "<b:true>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicitly...#274#-1269994214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicitly...#274#-1269994214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getObjectIdInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getPropertyMap", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", "java.util.Map,java.lang.String", "<null>", "'; ctors: "}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotations", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicitly...#274#-1269994214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getNonConstructorMutator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeConstructors", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findViews", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getConfig", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findInclusion", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnnotationIntrospector", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property '0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#-1381891122", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldDeserialize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getSetter", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getFullName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<null>", "<null>", "false", "true", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getGetter", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collectAll", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameProperties", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", "java.util.Map,java.lang.String", "<sample:0>", "Title"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameter", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<null>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameProperties", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getPrimaryMember", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeIgnored", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getSetter", ""}}, 1), new String[][]{{"remove", "java.lang.Object", "1"}, {"addAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findInclusion", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addSetterMethod", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>", "<sample:1>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getPrimaryMember", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeConstructors", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addSetterMethod", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>", "<sample:1>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "reportProblem", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "java.util.List"}, new String[]{"<null>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnnotationIntrospector", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterMethod", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldSerialize", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findViews", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getAccessor", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collect", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addGetterMethod", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:2>", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getInjectables", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collect", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getObjectIdInfo", "", "5"}, {"collect", "", "0"}, {"getAnySetterField", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getObjectIdInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreatorParam", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:1>", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameProperties", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findInclusion", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldDeserialize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "trimByVisibility", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isTypeId", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", ""}}, 2), new String[][]{{"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findObjectIdInfo", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addGetterMethod", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<null>", "<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameUsing", "java.util.Map,com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:3>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", "java.util.Collection", "<empty>"}}, 1), new String[][]{{"hasDefaultValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMutator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasSetter", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addAll", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getProperties", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:0>", "<sample:4>", "true", "false", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findInclusion", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getClassDef", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getConfig", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findExplicitNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasField", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findRequired", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDefaultValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findViews", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameWithWrappers", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collectAll", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyNamed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "compareTo", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyNamed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "compareTo", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyNamed", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "compareTo", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getAccessor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getAccessor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, i...#285#1990095436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getAccessor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#576264501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getConfig", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getConfig", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getConfig", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getConfig", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=<a><b>t</b></a>, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#1810837613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:2>", "true", "true", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values][visible=true,ignore=true,explicitName=true], getter(s): null, setter(s): null] {ge...#405#-456262985", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getClassDef", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collect", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:2>", "true", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#map][visible=true,ignore=true,explicitName=true], getter(s): null, setter(s): null] {getInter...#384#-1658767435", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findInclusion", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:4>", "true", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeConstructors", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#map][visible=true,ignore=true,explicitName=true], getter(s): null, setter(s): null] {getInter...#384#-1658767435", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:3>", "true", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeConstructors", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#map][visible=true,ignore=true,explicitName=false], getter(s): null, setter(s): null] {getInte...#387#-22801574", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:3>", "false", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#map][visible=true,ignore=true,explicitName=false], getter(s): null, setter(s): null]...#398#-2109633901", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getName", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:3>", "true", "true", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: null, field(s): null, getter(s): [method java.lang.String#format(2 params)][visible=true,ignore=false,explicitName=false], setter(s): null] {getInternalName=0, getName=, hasConstr...#357#204372763", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getName", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:3>", "true", "true", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): [method java.lang.String#format(2 params)][visible=true,ignore=false,explicitName=false], setter(s): null] {getInternalName=, getName=, hasCons...#359#1709830984", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false", "true", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #6, annotations: [null]][visible=true,ignore=true,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasCo...#361#-1558821088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasSetter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:4>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getField", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", "java.util.Collection", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", "java.util.Collection", "<empty>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldDeserialize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findViews", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findAccess", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property '{\"a\":1}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName={\"a\":1}, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false...#288#-482144754", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", "java.util.Collection", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldDeserialize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicitlyI...#273#-1938041844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", "java.util.Collection", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getJsonValueMethod", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findObjectIdInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "trimByVisibility", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getClassDef", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addSetterMethod", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>", "<sample:1>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "java.lang.String"}, new String[]{"<sample:0>", "1.12345678"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameProperties", "java.util.Map", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property '1.12345678'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=1.12345678, getName=1.12345678, hasConstructorParameter=false, hasField=false, hasGetter=false, ...#303#-2101415765", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "reportProblem", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getInternalName", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "trimByVisibility", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotations", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getSetter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", "boolean", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getGetter", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicitly...#274#-1269994214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasField", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getGetter", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findExplicitNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getSetter", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getSetter", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "7"}, {"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_setterPriority", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyNamed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", "boolean", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getGetter", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldSerialize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property ''; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicitly...#274#-1269994214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasConstructorParameter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:4>", "<sample:3>", "false", "false", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getFullName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldSerialize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasField", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedAccessor", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyNamed", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#576264501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addSetterMethod", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>", "<sample:4>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findExplicitNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", ""}}), new String[][]{{"remove", "java.lang.Object", "1"}, {"contains", "java.lang.Object", "1"}, {"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyIncluded", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isTypeId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasName", "com.fasterxml.jackson.databind.PropertyName", "<sample:7>"}}), new String[][]{{"compareTo", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "7"}, {"isRequired", "", "2"}, {"hasName", "com.fasterxml.jackson.databind.PropertyName", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMutator", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotations", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonProperty$Access", actual.getClass().getName());
  assertEquals("AUTO", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_doAddInjectable", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<s:a>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterMethod", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findIndex", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getPropertyMap", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnyGetter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "java.util.List"}, new String[]{"<sample:2>", "<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreatorParam", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "findPOJOBuilderClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addGetterMethod", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>", "<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getObjectIdInfo", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "java.lang.String"}, new String[]{"<sample:1>", "\": "}, false), new String[][]{{"getField", "", "6"}, {"addAll", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "5"}, {"findExplicitNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getField", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonProperty$Access", actual.getClass().getName());
  assertEquals("AUTO", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, i...#285#1990095436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addInjectables", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getProperties", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addFields", "java.util.Map", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getInternalName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addFields", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnyGetter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreators", "java.util.Map", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "findPOJOBuilderClass", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", "boolean", "false"}}), new String[][]{{"getMutator", "", "4"}, {"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e10", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameWithWrappers", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "java.lang.String"}, new String[]{"<sample:3>", "PT1H"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnyGetter", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", "java.util.Map", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property 'PT1H'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=PT1H, getName=PT1H, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, i...#285#-1449571055", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=a, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#-53468089", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getField", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("sample {getNamespace=null, getSimpleName=sample, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getIgnoredPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getObjectIdInfo", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreators", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getObjectIdInfo", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findInclusion", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeIgnored", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotations", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterMethod", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collect", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDefaultValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyIncluded", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedField", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "false", "false", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findRequired", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getPropertyMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addSetterMethod", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>", "<sample:7>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasConstructorParameter", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=<a><b>t</b></a>, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#1810837613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getAccessor", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "true", "true", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findViews", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #8, annotations: [null]][visible=true,ignore=true,explicitName=true], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasCon...#358#201530109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasSetter", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getSetter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addAll", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterField", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "java.lang.String"}, new String[]{"<empty>", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameUsing", "java.util.Map,com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property ''; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicitlyI...#273#-1938041844", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMutator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", "com.fasterxml.jackson.databind.PropertyName", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findAccess", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findInclusion", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, i...#285#1990095436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyNamed", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldDeserialize", ""}}), new String[][]{{"withDefaultValue", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getProperties", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getInjectables", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_sortProperties", "java.util.Map", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", "java.util.Map", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getType", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<null>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_sortProperties", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeConstructors", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "true", "false", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findAccess", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyNamed", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedField", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true", "true", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldSerialize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values][visible=true,ignore=false,explicitName=true], getter(s): null, setter(s): null]...#401#-1568169237", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember", "java.lang.Object"}, new String[]{"<sample:4>", "<b:true>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getInternalName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findObjectIdInfo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#576264501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplici...#277#-635908847", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasGetter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameProperties", new String[]{"java.util.Map"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false), new String[][]{{"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getPrimaryMember", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<empty>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getProperties", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_sortProperties", "java.util.Map", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property ''; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicitlyI...#273#-1938041844", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<empty>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property '0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#-1381891122", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "java.lang.String"}, new String[]{"<sample:3>", "5."}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property '5.'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=5., getName=5., hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExpli...#279#1749457331", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeConstructors", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findRequired", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameUsing", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:0>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterMethod", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:5>", "<null>", "false", "false", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): [method java.util.Arrays#asList(1 params)][visible=false,ignore=false,explicitName=false], setter(s): null] {getInternalName=0, getName=samp...#370#845065681", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findInclusion", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, i...#285#1990095436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=<a><b>t</b></a>, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#1810837613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnnotationIntrospector", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getWrapperName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "true", "true", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.util.Arrays#asList(1 params)][visible=true,ignore=true,explicitName=true]] {getInternalName=0, getName=sample,...#365#2094622846", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_setterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeIgnored", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getNonConstructorMutator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasSetter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyNamed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameWithWrappers", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "findPOJOBuilderClass", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "compareTo", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonProperty$Access", actual.getClass().getName());
  assertEquals("AUTO", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findRequired", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collect", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getConfig", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", "java.util.Map,com.fasterxml.jackson.databind.PropertyName", "<null>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addMethods", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "compareTo", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:0>", "<sample:6>", "true", "true", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #2147483647, annotations: [null]][visible=true,ignore=true,explicitName=true], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sampl...#367#-583953433", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_setterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:4>"}}), new String[][]{{"hasDefaultValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "java.util.List"}, new String[]{"<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_doAddInjectable", "java.lang.Object,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<b:true>", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addInjectables", "java.util.Map", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false), new String[][]{{"trimByVisibility", "", "1"}, {"getGetter", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findExplicitNames", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collect", new String[]{}, new String[]{}, false), new String[][]{{"getAnySetterMethod", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findIndex", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasName", "com.fasterxml.jackson.databind.PropertyName", "<null>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:1>", "true", "false", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#map][visible=false,ignore=true,explicitName=true], getter(s): null, setter(s): null] {g...#397#-1794620346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getFullName", new String[]{}, new String[]{}, false), new String[][]{{"withSimpleName", "java.lang.String", "6"}, {"simpleAsEncoded", "com.fasterxml.jackson.databind.cfg.MapperConfig", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("0 {getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "false", "false", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #2147483647, annotations: [null]][visible=false,ignore=true,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sam...#371#-1649973213", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getFullName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getInternalName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{sample}0 {getNamespace=sample, getSimpleName=0, hasNamespace=true, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", new String[]{"java.util.Map"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getInternalName", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#576264501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findAccess", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#576264501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasConstructorParameter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<empty>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getClassDef", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property 'a'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=a, getName=a, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#1554270111", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:2>", "false", "true", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.util.List#get(1 params)][visible=true,ignore=true,explicitName=false]] {getInternalName=0, getName=sample, has...#362#-1277244614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findAccess", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", "java.util.Collection", "<null>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasName", "com.fasterxml.jackson.databind.PropertyName", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotations", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findViews", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#576264501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedField", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "true", "true", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values][visible=true,ignore=true,explicitName=true], getter(s): null, setter(s): null] ...#400#1318731676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getPrimaryMember", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getSetter", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getGetter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=<a><b>t</b></a>, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#1810837613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collect", new String[]{}, new String[]{}, false), new String[][]{{"getIgnoredPropertyNames", "", "7"}, {"getClassDef", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false);
  assertNull(actual);
 }
}
