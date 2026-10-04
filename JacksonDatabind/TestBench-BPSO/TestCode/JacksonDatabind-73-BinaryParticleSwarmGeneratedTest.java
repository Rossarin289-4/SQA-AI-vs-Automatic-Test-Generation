package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getConfig", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDescription", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnyGetter", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addInjectables", "java.util.Map", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collectAll", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getIgnoredPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder,java.util.List", "<sample:8>", "<null>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", "java.util.Map", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "java.lang.String"}, new String[]{"<sample:3>", "010TITME"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnyGetter", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getObjectIdInfo", ""}}, 1), new String[][]{{"removeNonVisible", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonProperty$Access", actual.getClass().getName());
  assertEquals("AUTO", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getGetter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldDeserialize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", "boolean", "true"}}), new String[][]{{"simpleAsEncoded", "com.fasterxml.jackson.databind.cfg.MapperConfig", "6"}, {"asQuotedUTF8", "", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[115, 97, 109, 112, 108, 101]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameProperties", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:7>", "false", "false", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getFullName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #8, annotations: [null]][visible=false,ignore=true,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasC...#362#1804825657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findViews", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:1>", "<sample:7>", "true", "false", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #2, annotations: [null]][visible=false,ignore=true,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasC...#362#2078756275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameUsing", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<empty>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getJsonValueMethod", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getField", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:0>", "<sample:2>", "false", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getSetter", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedField", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:4>", "<null>", "true", "false", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember", "java.lang.Object"}, new String[]{"<sample:2>", "<s:a>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeConstructors", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#576264501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreators", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getInjectables", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<null>", "<sample:6>", "false", "false", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "compareTo", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldSerialize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedField", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:5>", "<null>", "false", "true", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#wildcard][visible=true,ignore=false,explicitName=false], getter(s): null, setter(s): nu...#406#-521276339", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property 'null'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=null, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isEx...#282#1610690444", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:1>", "<null>", "false", "true", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:2>", "<sample:4>", "true", "false", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getNonConstructorMutator", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "reportProblem", new String[]{"java.lang.String"}, new String[]{"\n10"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collect", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", "java.util.Map", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, i...#285#1990095436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasGetter", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:10>", "<null>", "false", "false", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:5>", "<b:true>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #11, annotations: null][visible=false,ignore=true,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasCon...#360#1627383173", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedAccessor", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addSetterMethod", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>", "<sample:6>", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_sortProperties", "java.util.Map", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedAccessor", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addFields", "java.util.Map", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "trimByVisibility", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:3>", "<s:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:3>", "true", "false", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:6>", "<s:a>"}}), new String[][]{{"getNonConstructorMutator", "", "2"}, {"getFullName", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{a}1.5 {getNamespace=a, getSimpleName=1.5, hasNamespace=true, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: [parameter #8, annotations: [null]][visible=false,ignore=true,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=<a><b>t</b></a>, getName=,...#367#2094551700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:3>", "false", "false", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.lang.String#format(2 params)][visible=false,ignore=false,explicitName=false]] {getInternalName=0, getName=samp...#370#-531365210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addGetterMethod", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameProperties", "java.util.Map", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getNonConstructorMutator", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:3>", "false", "true", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): [method java.util.List#get(1 params)][visible=true,ignore=true,explicitName=false], setter(s): null] {getInternalName=, getName=sample, hasC...#362#2053770951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "trimByVisibility", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:6>", "<sample:7>", "false", "false", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findExplicitNames", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:3>", "true", "false", "true"}}, 1), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.util.Arrays#asList(1 params)][visible=false,ignore=true,explicitName=false]] {getInternalName=, getName=sample...#368#1865671934", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "java.lang.String"}, new String[]{"<sample:1>", ":\0371.25"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreatorParam", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:3>", "<sample:6>"}}, 1), new String[][]{{"findInclusion", "", "2"}, {"withValueInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_NULL,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=NON_NULL}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedField", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "false", "false", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:8>", "true", "true", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values][visible=false,ignore=true,explicitName=false], [field generated.algorithm.Searc...#533#-2119515722", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addAll", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:2>", "<sample:8>", "false", "true", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collectAll", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_doAddInjectable", "java.lang.Object,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<null>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getPropertyMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameWithWrappers", "java.util.Map", "<empty>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterField", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:1>", "true", "true", "true"}}), new String[][]{{"anyIgnorals", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.util.Arrays#asList(1 params)][visible=true,ignore=true,explicitName=true]] {getInternalName=sample, getName=sa...#370#412888096", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addMethods", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder,java.util.List", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterMethod", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "compareTo", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:1>", "false", "false", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #4, annotations: [null]][visible=false,ignore=true,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasCo...#361#40169115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldSerialize", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:0>", "false", "false", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): [method java.util.Arrays#asList(1 params)][visible=false,ignore=false,explicitName=false], setter(s): null] {getInternalName=, getName=sampl...#368#168426596", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<null>", "<sample:5>", "false", "true", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:1>", "<sample:2>", "false", "false", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findExplicitNames", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findInclusion", ""}}), new String[][]{{"findViews", "", "3"}, {"anyIgnorals", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collect", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", "java.util.Map", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getClassDef", ""}}, 3), new String[][]{{"getAnnotationIntrospector", "", "4"}, {"getAnySetterField", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember", "java.lang.Object"}, new String[]{"<sample:1>", "<s:aa>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:1>", "<sample:0>", "false", "false", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasGetter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.lang.String#format(2 params)][visible=false,ignore=false,explicitName=false]] {getInternalName=0, getName=samp...#369#-162156275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterField", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addMethods", "java.util.Map", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property ''; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicitlyI...#273#-1938041844", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:2>", "<sample:8>", "true", "true", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"aa"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:2>", "<sample:6>", "false", "false", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:7>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:4>", "<sample:2>", "false", "true", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonProperty$Access", actual.getClass().getName());
  assertEquals("AUTO", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getSetter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:4>", "<sample:1>", "true", "false", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeIgnored", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:5>", "false", "false", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#wildcard][visible=false,ignore=true,explicitName=false], getter(s): null, setter(s): nu...#410#1096157512", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getPrimaryMember", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:0>", "true", "false", "false"}}), new String[][]{{"getModifiers", "", "4"}, {"getGenericType", "", "3"}});
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.TypeVariableImpl", actual.getClass().getName());
  assertEquals("E {getAnnotatedBounds=?, getAnnotations=[], getBounds=[class java.lang.Object], getDeclaredAnnotations=[], getName=E, getTypeName=E}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): [method java.util.List#get(1 params)][visible=false,ignore=false,explicitName=true], setter(s): null] {getInternalName=<a><b>t</b></a>, getName...#367#-1783652945", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:4>", "true", "true", "true"}}), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.lang.String#format(2 params)][visible=true,ignore=true,explicitName=true]] {getInternalName=, getName=sample, ...#364#47141747", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:4>", "false", "true", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getNonConstructorMutator", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonProperty$Access", actual.getClass().getName());
  assertEquals("AUTO", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): [method java.util.List#get(1 params)][visible=true,ignore=false,explicitName=false], setter(s): null] {getInternalName=sample, getName=sampl...#368#818609177", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:3>", "true", "false", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonProperty$Access", actual.getClass().getName());
  assertEquals("AUTO", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", "java.lang.String", "] vs\" "}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:2>", "<sample:5>", "true", "false", "false"}}), new String[][]{{"removeAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember", "java.lang.Object"}, new String[]{"<sample:5>", "<s:aaa>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findExplicitNames", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:0>", "<sample:0>", "true", "false", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:13>", "<sample:6>", "false", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getNonConstructorMutator", ""}}), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:0>", "<sample:0>", "false", "true", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonProperty$Access", actual.getClass().getName());
  assertEquals("AUTO", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", "boolean", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:8>", "true", "true", "false"}}), new String[][]{{"explode", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[[Property 'sample'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values][visible=true,ignore=false,explicitName=true], getter(s): null, setter(s): null...#202#-1064034803", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values][visible=true,ignore=false,explicitName=true], getter(s): null, setter(s): null]...#401#-1568169237", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:8>", "true", "true", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values][visible=true,ignore=true,explicitName=true], getter(s): null, setter(s): null] ...#399#-2047641368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeIgnored", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:2>", "<sample:10>", "false", "true", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, i...#285#1990095436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findAccess", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getAccessor", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:4>", "<sample:7>", "true", "true", "true"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMutator", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:0>", "<sample:5>", "false", "false", "false"}}), new String[][]{{"couldDeserialize", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findObjectIdInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:8>", "true", "true", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #6, annotations: [null]][visible=true,ignore=false,explicitName=true], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasCo...#359#-1443361154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "java.util.List"}, new String[]{"<sample:5>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameWithWrappers", "java.util.Map", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeConstructors", ""}}), new String[][]{{"compareTo", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#576264501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMutator", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:12>", "<sample:3>", "false", "true", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonProperty$Access", actual.getClass().getName());
  assertEquals("AUTO", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #16, annotations: [null]][visible=true,ignore=true,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasC...#362#348624987", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldDeserialize", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:4>", "<sample:2>", "true", "true", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: [parameter #5, annotations: null][visible=true,ignore=true,explicitName=true], field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorPara...#346#385478291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:0>", "<sample:5>", "false", "true", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasGetter", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$MemberIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: [parameter #2147483647, annotations: [null]][visible=true,ignore=false,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=<a><b>t</b></a>, ...#376#-1471834526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_setterPriority", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:3>", "true", "false", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): [method java.util.List#get(1 params)][visible=false,ignore=false,explicitName=false], setter(s): null] {getInternalName=, getName=sample, ha...#364#351760429", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getWrapperName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:7>", "false", "true", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: [parameter #4, annotations: [null]][visible=true,ignore=true,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorP...#351#1267764357", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:6>", "<sample:7>", "true", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findAccess", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getAccessor", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:2>", "<sample:3>", "true", "true", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:6>", "<sample:4>", "true", "false", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:4>", "<sample:9>", "true", "true", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldSerialize", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findObjectIdInfo", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:4>", "<sample:0>", "false", "true", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_doAddInjectable", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<i:-1>", "<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_doAddInjectable", "java.lang.Object,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<i:-1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findExplicitNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:8>", "<sample:0>", "true", "true", "false"}}), new String[][]{{"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember", "java.lang.Object"}, new String[]{"<sample:6>", "<s:c>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:0>", "<sample:7>", "true", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:4>", "<sample:8>", "true", "true", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:11>", "false", "true", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#map][visible=true,ignore=false,explicitName=false], getter(s): null, setter(s): null] {...#401#257677361", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasSetter", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:1>", "<sample:2>", "false", "false", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember,java.lang.Object", "<sample:3>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text][visible=false,ignore=false,explicitName=false], getter(s): null, setter(s): null]...#407#-205894792", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:4>", "<sample:1>", "false", "false", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #5, annotations: null][visible=false,ignore=true,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasCon...#360#-1482870742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasGetter", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:1>", "<sample:10>", "true", "false", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", "java.util.Collection", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #2, annotations: [null]][visible=false,ignore=true,explicitName=true], field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasCon...#358#1096466212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:8>", "<sample:7>", "true", "true", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:2>", "<sample:1>", "true", "true", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:14>", "false", "false", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #4, annotations: [null]][visible=false,ignore=false,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, has...#363#-121213752", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getAccessor", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:2>", "<sample:5>", "false", "true", "false"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "false", "true", "true"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", "java.lang.String", "a12:30:45"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addAll", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #8, annotations: [null]][visible=true,ignore=true,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasCon...#360#-1719012526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getWrapperName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:3>", "true", "true", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.util.Arrays#asList(1 params)][visible=true,ignore=true,explicitName=false]] {getInternalName=0, getName=sample...#368#-644926973", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameter", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:10>", "<sample:6>", "true", "false", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedParameter", actual.getClass().getName());
  assertEquals("[parameter #11, annotations: null] {getIndex=11, getModifiers=!NullPointerException, getName=, isPublic=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #11, annotations: null][visible=false,ignore=false,explicitName=true], field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasCon...#358#1195792931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:5>", "<sample:8>", "true", "false", "true"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #6, annotations: [null]][visible=false,ignore=true,explicitName=true], field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, ...#364#-1893999918", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:16>", "<sample:9>", "false", "true", "false"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getClassDef", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", "java.util.Map", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getPrimaryMember", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, i...#285#1990095436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDefaultValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=<a><b>t</b></a>, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#1810837613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterField", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnnotationIntrospector", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMutator", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasGetter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=<a><b>t</b></a>, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#1810837613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collectAll", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreatorParam", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<null>", "<sample:6>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addMethods", "java.util.Map", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "java.lang.String"}, new String[]{"<sample:3>", "-\0131"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property '-\0131'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=-\0131, getName=-\0131, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isEx...#282#-1764370191", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameWithWrappers", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasSetter", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDefaultValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasField", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getInternalName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasGetter", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addGetterMethod", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>", "<sample:4>", "<sample:10>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDescription", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, i...#285#1990095436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getProperties", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "findPOJOBuilderClass", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterMethod", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getWrapperName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findIndex", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getNonConstructorMutator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "java.util.List"}, new String[]{"<sample:8>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameWithWrappers", "java.util.Map", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "true", "false", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyNamed", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.lang.String#format(2 params)][visible=false,ignore=false,explicitName=true]] {getInternalName=0, getName=sampl...#367#246944443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "compareTo", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("67", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "java.util.List"}, new String[]{"<sample:10>", "<sample:0>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "true", "true", "false"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "toString", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addFields", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", "java.util.Map", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findViews", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDefaultValue", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasName", "com.fasterxml.jackson.databind.PropertyName", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=<a><b>t</b></a>, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#1810837613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasSetter", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, i...#285#1990095436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addFields", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder,java.util.List", "<sample:1>", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldSerialize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("sample {getNamespace=null, getSimpleName=sample, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getConfig", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:5>", "<sample:6>", "true", "true", "true"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.util.Arrays#asList(1 params)][visible=true,ignore=true,explicitName=true]] {getInternalName=a, getName=0, h...#363#929886299", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getInternalName", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameWithWrappers", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getProperties", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnyGetter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getProperties", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addGetterMethod", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<null>", "<sample:1>", "<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameUsing", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameWithWrappers", "java.util.Map", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "findPOJOBuilderClass", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameter", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getNonConstructorMutator", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeConstructors", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=a, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#-53468089", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getIgnoredPropertyNames", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder,java.util.List", "<sample:2>", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyIncluded", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findExplicitNames", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameProperties", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedAccessor", "java.util.Map", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getJsonValueMethod", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addGetterMethod", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>", "<sample:7>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreatorParam", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameUsing", "java.util.Map,com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:4>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collectAll", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameWithWrappers", "java.util.Map", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:0>", "<sample:3>", "false", "false", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[Property 'sample'; ctors: [parameter #2147483647, annotations: [null]][visible=false,ignore=false,explicitName=false], field(s): null, getter(s): null, setter(s): null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #2147483647, annotations: [null]][visible=false,ignore=false,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sa...#372#-1212061798", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", "java.util.Collection", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property '{{\"a\":1}}<a><b>t</b></a>'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=<a><b>t</b></a>, hasConstructorParameter=false, hasField=false, hasGett...#313#1768164578", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getGetter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findViews", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterField", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addMethods", "java.util.Map", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getAccessor", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", "boolean", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findExplicitNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasField", ""}}, 2), new String[][]{{"containsAll", "java.util.Collection", "6"}, {"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getIgnoredPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "findPOJOBuilderClass", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addSetterMethod", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:2>", "<sample:5>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [recursive type; UNRESOLVED] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffoldi...#596#-2107479485", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "findPOJOBuilderClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getConfig", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterField", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "findPOJOBuilderClass", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getObjectIdInfo", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getNonConstructorMutator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findViews", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getPrimaryMember", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getAccessor", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "trimByVisibility", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getAccessor", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getInjectables", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterMethod", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findInclusion", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findInclusion", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeConstructors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, i...#285#1990095436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addAll", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"}, new String[]{"<sample:8>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findObjectIdInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyNamed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findRequired", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreators", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameUsing", "java.util.Map,com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:0>", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreatorParam", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:0>", "<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameWithWrappers", "java.util.Map", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getAccessor", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, i...#285#1990095436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreators", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getInjectables", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getInjectables", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasConstructorParameter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "compareTo", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldSerialize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addAll", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "compareTo", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addMethods", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getClassDef", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getWrapperName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addGetterMethod", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addFields", "java.util.Map", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findRequired", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameProperties", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getObjectIdInfo", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "reportProblem", new String[]{"java.lang.String"}, new String[]{"{\"a\"::1}"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameUsing", "java.util.Map,com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getJsonValueMethod", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameUsing", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:2>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreators", "java.util.Map", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findAccess", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "false", "false", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #5, annotations: null][visible=false,ignore=true,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasCon...#360#-1482870742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getFullName", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{a} {getNamespace=a, getSimpleName=, hasNamespace=true, hasSimpleName=false, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#576264501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "false", "true", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #2147483647, annotations: [null]][visible=true,ignore=true,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=samp...#370#1929018932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addFields", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasSetter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:7>", "<sample:1>", "false", "true", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#map][visible=true,ignore=false,explicitName=false], getter(s): null, setter(s): null] {...#400#-1383629278", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasGetter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findObjectIdInfo", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterMethod", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameUsing", "java.util.Map,com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collect", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getProperties", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeNonVisible", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonProperty$Access", actual.getClass().getName());
  assertEquals("AUTO", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_doAddInjectable", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<b:false>", "<sample:4>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getIgnoredPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterField", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnnotationIntrospector", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=<a><b>t</b></a>, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#1810837613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getGetter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getGetter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:0>", "<sample:3>", "true", "false", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getFullName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getProperties", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_doAddInjectable", "java.lang.Object,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<i:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property '<a><b>t</b></a>'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=<a><b>t</b></a>, getName=<a><b>t</b></a>, hasConstructorParameter=false, hasField=false, ha...#318#-2144556366", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "findPOJOBuilderClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getClassDef", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasConstructorParameter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property '0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#-1381891122", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getConfig", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDefaultValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "findPOJOBuilderClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_sortProperties", "java.util.Map", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getNonConstructorMutator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterMethod", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addSetterMethod", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>", "<sample:6>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collect", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasSetter", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getSetter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeIgnored", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasSetter", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "false", "true", "true"}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameProperties", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnnotationIntrospector", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameWithWrappers", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", "java.util.Map", "<sample:7>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "findPOJOBuilderClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getInternalName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findViews", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collectAll", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "collectAll", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", "java.util.Map", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addGetterMethod", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>", "<sample:4>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterField", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedField", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<null>", "<sample:6>", "true", "true", "true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getInternalName", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#576264501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasConstructorParameter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasSetter", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasSetter", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", "java.lang.String", "] vs "}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDefaultValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getInjectables", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameWithWrappers", "java.util.Map", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasConstructorParameter", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=a, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#-53468089", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getWrapperName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameter", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getGetter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_sortProperties", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getNonConstructorMutator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "java.lang.String"}, new String[]{"<sample:1>", ",ignoae="}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addFields", "java.util.Map", "<sample:0>"}}), new String[][]{{"getConstructorParameter", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeIgnored", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDefaultValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedAccessor", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getInjectables", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getClassDef", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyNamed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addSetterMethod", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<null>", "<sample:3>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder,java.util.List", "<sample:9>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getWrapperName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "fromMemberAnnotationsExcept", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$WithMember", "java.lang.Object"}, new String[]{"<sample:3>", "<i:-268435456>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldSerialize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "java.lang.String"}, new String[]{"<sample:2>", "set'; ctors: 2020-01-01"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property 'set'; ctors: 2020-01-01'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=set'; ctors: 2020-01-01, getName=set'; ctors: 2020-01-01, hasConstructorParameter=f...#342#664348277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"{\"\"\":1}"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property '{\"\"\":1}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName={\"\"\":1}, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false...#288#-449178258", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addInjectables", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreatorParam", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addSetterMethod", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.AnnotationIntrospector", "<empty>", "<sample:1>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getObjectIdInfo", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "findPOJOBuilderClass", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:1>", "<sample:4>", "true", "false", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", "java.util.Collection", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #2, annotations: [null]][visible=false,ignore=false,explicitName=true], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasC...#360#-1032872495", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", "java.util.Collection", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getInternalName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getAccessor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getInternalName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", "com.fasterxml.jackson.databind.introspect.AnnotatedField,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:1>", "<sample:7>", "true", "false", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text][visible=false,ignore=false,explicitName=false], getter(s): null, setter(s): null] {g...#393#332298984", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreators", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedAccessor", "java.util.Map", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_sortProperties", "java.util.Map", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addSetterMethod", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_doAddInjectable", "java.lang.Object,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<d:1.5>", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addSetterMethod", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyNamed", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "compareTo", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=<a><b>t</b></a>, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#1810837613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterField", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyIncluded", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getGetter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_setterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDescription", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, i...#285#1990095436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "java.lang.String"}, new String[]{"<sample:4>", ")T.tle"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property ')T.tle'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=)T.tle, getName=)T.tle, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#-148112510", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findViews", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameters", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedField", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "false", "false", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isRequired", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#map][visible=false,ignore=false,explicitName=false], getter(s): null, setter(s): null] ...#401#-9656717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "true", "true", "false"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: [parameter #2, annotations: [null]][visible=true,ignore=false,explicitName=true], field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasCo...#359#861634306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"true"}, false), new String[][]{{"removeNonVisible", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonProperty$Access", actual.getClass().getName());
  assertEquals("AUTO", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDescription", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "false", "true", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: [parameter #7, annotations: null][visible=true,ignore=true,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorPar...#349#89944764", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findRequired", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=<a><b>t</b></a>, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#1810837613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findExplicitNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasField", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyNamed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "true", "true", "true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldSerialize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: [parameter #2, annotations: [null]][visible=true,ignore=true,explicitName=false], field(s): null, getter(s): null, setter(s): null] {getInternalName=a, getName=0, hasCons...#359#-1468329615", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_setterPriority", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findIndex", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=a, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#-53468089", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getField", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "trimByVisibility", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:7>", "<sample:6>", "true", "true", "true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findObjectIdInfo", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addCtor", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:3>", "<sample:6>", "true", "false", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: [parameter #4, annotations: [null]][visible=false,ignore=true,explicitName=true], field(s): null, getter(s): null, setter(s): [method java.lang.String#format(2 params)][v...#438#-1318994534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldSerialize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addAll", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isExplicitlyIncluded", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_updateCreatorProperty", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "java.util.List"}, new String[]{"<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addFields", "java.util.Map", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldSerialize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addCreatorParam", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:2>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getType", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getAnySetterField", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_renameUsing", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<null>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_addGetterMethod", "java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>", "<sample:5>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "compareTo", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "compareTo", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getFullName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getConstructorParameter", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("sample {getNamespace=null, getSimpleName=sample, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:7>", "<sample:8>", "false", "false", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.lang.String#format(2 params)][visible=false,ignore=false,explicitName=false]] {getInternalName=0, getName=samp...#369#-162156275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "removeConstructors", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getNonConstructorMutator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=a, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#-53468089", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addAll", new String[]{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getPrimaryMember", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#576264501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findInclusion", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findIndex", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"IH"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldSerialize", ""}}), new String[][]{{"findExplicitNames", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getNonConstructorMutator", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, i...#285#1990095436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:7>", "<sample:3>", "false", "false", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "mergeAnnotations", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.lang.String#format(2 params)][visible=false,ignore=true,explicitName=false]] {getInternalName=0, getName=0,...#367#-325605263", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "hasField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=<a><b>t</b></a>, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#1810837613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getField", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findViews", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getInternalName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "findReferenceType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=sample, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=fa...#291#536074146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findDefaultValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addGetter", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.PropertyName,boolean,boolean,boolean", "<sample:1>", "<sample:4>", "false", "true", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): [method java.lang.String#format(2 params)][visible=true,ignore=false,explicitName=false], setter(s): null] {getInternalName=<a><b>t</b></a>, ge...#373#962950539", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getPropertyMap", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_doAddInjectable", "java.lang.Object,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<s:key>", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getProperties", ""}}), new String[][]{{"findReferenceType", "", "2"}, {"explode", "java.util.Collection", "7"}, {"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_findIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldDeserialize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "explode", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getMetadata", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getterPriority", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "couldDeserialize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_removeUnwantedProperties", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "isTypeId", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getInternalName", ""}}), new String[][]{{"hasSimpleName", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=sample, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, ...#286#2014978886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property '{{\"a\":1}}<a><b>t</b></a>'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=<a><b>t</b></a>, hasConstructorParameter=false, hasField=false, hasGett...#313#1768164578", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[Property '{sample}0'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=0, getName=0, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, is...#284#1981823638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "getClassDef", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addSetter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:1>", "<sample:10>", "true", "true", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyVisible", ""}, {"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getSetter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): null, getter(s): null, setter(s): [method java.lang.String#format(2 params)][visible=true,ignore=false,explicitName=true]] {getInternalName=0, getName=sample...#366#-389511842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_property", new String[]{"java.util.Map", "com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:3>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", actual.getClass().getName());
  assertEquals("[Property ''; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicitlyI...#273#-1938041844", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "anyIgnorals", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[Property '{a}'; ctors: null, field(s): null, getter(s): null, setter(s): null] {getInternalName=, getName=, hasConstructorParameter=false, hasField=false, hasGetter=false, hasSetter=false, isExplicit...#276#576264501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "addField", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedField", "com.fasterxml.jackson.databind.PropertyName", "boolean", "boolean", "boolean"}, new String[]{"<sample:11>", "<sample:4>", "false", "false", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "getGetter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[Property 'sample'; ctors: null, field(s): [field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array][visible=false,ignore=true,explicitName=false], getter(s): null, setter(s): null]...#402#-1105550786", SearchInputFactory_scaffolding.receiverState());
 }
}
