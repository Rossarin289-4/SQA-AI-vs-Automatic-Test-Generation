package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.core.FormatFeature", "<sample:1>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:7>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "typeResolverBuilderInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:8>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:6>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.jsontype.SubtypeResolver", "<sample:6>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "compileString", "java.lang.String", "a,b,c"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "java.text.DateFormat", "<null>"}}), new String[][]{{"getClassIntrospector", "", "4"}, {"forDeserializationWithBuilder", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findFactoryMethod", "java.lang.Class[]", "7"}, {"findProperties", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[Property 'class'; ctors: null, field(s): null, getter(s): [method java.lang.Object#getClass(0 params)][visible=true,ignore=false,explicitName=false], setter(s): null]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getBaseSettings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.BaseSettings", actual.getClass().getName());
  assertEquals("{hasExplicitTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:8>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:5>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:5>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.MapperFeature[]", "<empty>"}}), new String[][]{{"getClassIntrospector", "", "5"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findProperty", "com.fasterxml.jackson.databind.PropertyName", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"java.text.DateFormat"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", new String[]{"com.fasterxml.jackson.core.FormatFeature[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<empty>"}, false), new String[][]{{"getRootName", "", "2"}, {"isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "5"}, {"with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.MapperFeature[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "hasSerializationFeatures", new String[]{"int"}, new String[]{"2147467263"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:2>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "java.util.Locale", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withFilters", new String[]{"com.fasterxml.jackson.databind.ser.FilterProvider"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withSerializationInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:4>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getActiveView", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "withDefaultPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:1>"}}), new String[][]{{"with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "1"}, {"with", "com.fasterxml.jackson.databind.type.TypeFactory", "0"}, {"getAnnotationIntrospector", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", actual.getClass().getName());
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withFilters", new String[]{"com.fasterxml.jackson.databind.ser.FilterProvider"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withFeatures", "com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "java.util.TimeZone", "<sample:2>"}}), new String[][]{{"with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "3"}, {"with", "com.fasterxml.jackson.databind.type.TypeFactory", "0"}, {"getAnnotationIntrospector", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", actual.getClass().getName());
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "without", "com.fasterxml.jackson.core.FormatFeature", "<sample:3>"}}), new String[][]{{"introspectForBuilder", "com.fasterxml.jackson.databind.JavaType", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "without", "com.fasterxml.jackson.core.FormatFeature", "<sample:2>"}}, 1), new String[][]{{"introspectForBuilder", "com.fasterxml.jackson.databind.JavaType", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withFeatures", new String[]{"com.fasterxml.jackson.databind.SerializationFeature[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withFeatures", "com.fasterxml.jackson.core.JsonGenerator$Feature[]", "<null>"}}), new String[][]{{"hasSerializationFeatures", "int", "7"}, {"isEnabled", "com.fasterxml.jackson.databind.SerializationFeature", "3"}, {"useRootWrapping", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", new String[]{"com.fasterxml.jackson.databind.SerializationFeature[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "typeIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "hasSomeOfFeatures", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature[]"}, new String[]{"<empty>"}, false), new String[][]{{"getDefaultVisibilityChecker", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "without", "com.fasterxml.jackson.core.JsonParser$Feature", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.jsontype.SubtypeResolver"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:5>", "true"}, {"com.fasterxml.jackson.databind.SerializationConfig", "findRootName", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withAttributes", "java.util.Map", "<sample:3>"}}, 2), new String[][]{{"isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.jsontype.SubtypeResolver"}, new String[]{"<sample:6>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withRootName", "java.lang.String", "1/51e300"}, {"com.fasterxml.jackson.databind.SerializationConfig", "findRootName", "java.lang.Class", "<sample:8>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withAttributes", "java.util.Map", "<sample:1>"}}, 3), new String[][]{{"isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "3"}, {"with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "5"}, {"with", "com.fasterxml.jackson.databind.MapperFeature[]", "5"}, {"getDefaultPropertyInclusion", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.jsontype.SubtypeResolver"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "findMixInClassFor", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withRootName", "java.lang.String", "5.0x8FFFFFFFF"}}, 3), new String[][]{{"hasSerializationFeatures", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.jsontype.SubtypeResolver"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:5>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withRootName", "java.lang.String", "1.5e300"}}), new String[][]{{"with", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "5"}, {"useRootWrapping", "", "3"}, {"with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "7"}, {"isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature[]"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"initialize", "com.fasterxml.jackson.core.JsonGenerator", "5"}, {"getClassIntrospector", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.jsontype.SubtypeResolver"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "isAnnotationProcessingEnabled", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "withFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<empty>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withRootName", "java.lang.String", "ndll"}}, 2), new String[][]{{"with", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "3"}, {"useRootWrapping", "", "4"}, {"introspect", "com.fasterxml.jackson.databind.JavaType", "3"}, {"getConstructors", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "hasDeserializationFeatures", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getFullRootName", ""}, {"com.fasterxml.jackson.databind.DeserializationConfig", "findRootName", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.SerializationFeature", "com.fasterxml.jackson.databind.SerializationFeature[]"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.core.FormatFeature", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:1>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withInsertedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:8>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "without", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withPropertyInclusion", new String[]{"com.fasterxml.jackson.annotation.JsonInclude$Value"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultPropertyInclusion", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=NON_NULL, isAnnotationProcessingEnabled=true, shou...#237#-491811942", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.jsontype.SubtypeResolver"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withRootName", "com.fasterxml.jackson.databind.PropertyName", "<null>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}}), new String[][]{{"with", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "1"}, {"useRootWrapping", "", "7"}, {"with", "java.text.DateFormat", "0"}, {"introspect", "com.fasterxml.jackson.databind.JavaType", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:7>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultPropertyFormat", "java.lang.Class", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultTyper", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:0>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyFormat", "java.lang.Class", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:2>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.jsontype.SubtypeResolver", "<null>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultTyper", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"java.text.DateFormat"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withFeatures", "com.fasterxml.jackson.core.JsonGenerator$Feature[]", "<empty>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withSerializationInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "<null>"}}, 1), new String[][]{{"initialize", "com.fasterxml.jackson.core.JsonGenerator", "3"}, {"with", "com.fasterxml.jackson.core.Base64Variant", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2988bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2721980, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-2078688920", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withFeatures", new String[]{"com.fasterxml.jackson.databind.SerializationFeature[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withFilters", "com.fasterxml.jackson.databind.ser.FilterProvider", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withFeatures", "com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:5>"}}, 1), new String[][]{{"with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:4>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultVisibilityChecker", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:4>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultVisibilityChecker", ""}}, 1), new String[][]{{"hasDeserializationFeatures", "int", "5"}, {"getActiveView", "", "0"}, {"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature,com.fasterxml.jackson.core.JsonFactory", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withHandler", new String[]{"com.fasterxml.jackson.databind.deser.DeserializationProblemHandler"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<empty>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "with", "java.util.TimeZone", "<sample:2>"}}, 2), new String[][]{{"mixInCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withHandler", new String[]{"com.fasterxml.jackson.databind.deser.DeserializationProblemHandler"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<sample:3>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:8>", "<null>"}}), new String[][]{{"introspect", "com.fasterxml.jackson.databind.JavaType", "5"}, {"_findPropertyFields", "java.util.Collection,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "without", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "without", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "introspectDirectClassAnnotations", "java.lang.Class", "<sample:8>"}}, 3), new String[][]{{"with", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "0"}, {"compileString", "java.lang.String", "5"}, {"putUnquotedUTF8", "java.nio.ByteBuffer", "7"}, {"asQuotedChars", "", "6"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "without", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:3>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "without", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "introspectDirectClassAnnotations", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "getProblemHandlers", ""}}), new String[][]{{"initialize", "com.fasterxml.jackson.core.JsonParser", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withFilters", new String[]{"com.fasterxml.jackson.databind.ser.FilterProvider"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withFeatures", "com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<d:1.5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<empty>"}}), new String[][]{{"with", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "4"}, {"getActiveView", "", "4"}, {"typeIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withoutFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:9>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "findTypeDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "without", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withAttributes", "java.util.Map", "<empty>"}}), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature,com.fasterxml.jackson.core.JsonFactory", "0"}, {"with", "com.fasterxml.jackson.databind.DeserializationFeature", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15215008, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<null>"}, false), new String[][]{{"with", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "1"}, {"useRootWrapping", "", "7"}, {"typeIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "isEnabled", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getRootName", ""}, {"com.fasterxml.jackson.databind.DeserializationConfig", "introspectForCreation", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:10>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "introspectClassAnnotations", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getActiveView", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "constructDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getActiveView", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "constructDefaultPrettyPrinter", ""}}), new String[][]{{"getClassIntrospector", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.FormatFeature[]"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withoutFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:1>"}, false), new String[][]{{"getPropertyNamingStrategy", "", "0"}, {"hasSomeOfFeatures", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:4>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "without", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "hasDeserializationFeatures", "int", "1073733640"}}), new String[][]{{"introspectForBuilder", "com.fasterxml.jackson.databind.JavaType", "3"}, {"getConstructors", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.cfg.ContextAttributes"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withFeatures", "com.fasterxml.jackson.core.JsonGenerator$Feature[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:5>"}}), new String[][]{{"hasSerializationFeatures", "int", "1"}, {"getDefaultPrettyPrinter", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.MapperFeature[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultPropertyInclusion", "java.lang.Class", "<sample:8>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDateFormat", ""}}, 1), new String[][]{{"with", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "6"}, {"introspect", "com.fasterxml.jackson.databind.JavaType", "4"}, {"findAnyGetter", "", "6"}, {"findProperties", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[Property 'class'; ctors: null, field(s): null, getter(s): [method java.lang.Object#getClass(0 params)][visible=true,ignore=false,explicitName=false], setter(s): null]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.MapperFeature[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultPropertyInclusion", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}}, 1), new String[][]{{"with", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "6"}, {"introspect", "com.fasterxml.jackson.databind.JavaType", "4"}, {"findAnyGetter", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.MapperFeature[]"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.JsonGenerator$Feature[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:4>"}}, 3), new String[][]{{"with", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "1"}, {"introspect", "com.fasterxml.jackson.databind.JavaType", "6"}, {"hasProperty", "com.fasterxml.jackson.databind.PropertyName", "0"}, {"findCreatorPropertyNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.SerializationFeature", "com.fasterxml.jackson.databind.SerializationFeature[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.core.FormatFeature", "<sample:4>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:3>", "<sample:3>"}}), new String[][]{{"introspectDirectClassAnnotations", "com.fasterxml.jackson.databind.JavaType", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getActiveView", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getBase64Variant", ""}, {"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:3>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "getBase64Variant", ""}}, 2), new String[][]{{"introspectClassAnnotations", "com.fasterxml.jackson.databind.JavaType", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "findMixInClassFor", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "with", "java.text.DateFormat", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<sample:1>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature,com.fasterxml.jackson.core.JsonFactory", "<sample:6>", "<sample:6>"}}), new String[][]{{"constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "constructType", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withView", "java.lang.Class", "<sample:2>"}}, 1), new String[][]{{"getClassIntrospector", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.FormatFeature[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "isAnnotationProcessingEnabled", ""}}, 1), new String[][]{{"with", "com.fasterxml.jackson.databind.MapperFeature[]", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "introspectForBuilder", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "hasMapperFeatures", "int", "2147467263"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "findRootName", "java.lang.Class", "<sample:3>"}}), new String[][]{{"getDefaultPropertyInclusion", "java.lang.Class", "2"}, {"withOverrides", "com.fasterxml.jackson.annotation.JsonInclude$Value", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=ALWAYS,content=NON_NULL] {getContentInclusion=NON_NULL, getValueInclusion=ALWAYS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=<a><b>t</b></a>, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<null>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "introspectForBuilder", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<empty>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withNoProblemHandlers", ""}}), new String[][]{{"getClassIntrospector", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "without", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "findRootName", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}}), new String[][]{{"initialize", "com.fasterxml.jackson.core.JsonParser", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "findRootName", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "without", "com.fasterxml.jackson.core.FormatFeature", "<sample:3>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withView", "java.lang.Class", "<null>"}}, 3), new String[][]{{"introspectDirectClassAnnotations", "com.fasterxml.jackson.databind.JavaType", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withInsertedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<sample:4>"}}), new String[][]{{"with", "com.fasterxml.jackson.databind.AnnotationIntrospector", "4"}, {"with", "com.fasterxml.jackson.databind.jsontype.SubtypeResolver", "5"}, {"introspectForCreation", "com.fasterxml.jackson.databind.JavaType", "3"}, {"findDeserializationConverter", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", new String[]{"com.fasterxml.jackson.databind.SerializationFeature[]"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getActiveView", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "isEnabled", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:6>"}}), new String[][]{{"with", "com.fasterxml.jackson.databind.MapperFeature[]", "7"}, {"with", "com.fasterxml.jackson.databind.SerializationFeature", "6"}, {"findRootName", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("GenericLeaf {getNamespace=null, getSimpleName=GenericLeaf, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "typeResolverBuilderInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getAnnotationIntrospector", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "typeResolverBuilderInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getAnnotationIntrospector", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=<a><b>t</b></a>, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "getTimeZone", ""}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withRootName", "java.lang.String", "{\"a\":1}"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:6>", "false"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:0>"}}, 3), new String[][]{{"getContentInclusion", "", "0"}, {"withOverrides", "com.fasterxml.jackson.annotation.JsonInclude$Value", "6"}, {"withOverrides", "com.fasterxml.jackson.annotation.JsonInclude$Value", "6"}, {"withContentInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_NULL,content=NON_NULL] {getContentInclusion=NON_NULL, getValueInclusion=NON_NULL}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "typeResolverBuilderInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:5>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "typeResolverBuilderInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "typeResolverBuilderInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getNodeFactory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "typeResolverBuilderInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getNodeFactory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "typeResolverBuilderInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.jsontype.SubtypeResolver", "<sample:5>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "compileString", "java.lang.String", "1/51e300"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "typeResolverBuilderInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:7>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.jsontype.SubtypeResolver", "<sample:5>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "compileString", "java.lang.String", "1/51e300"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:5>"}}, 3), new String[][]{{"getActiveView", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:7>", "false"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:5>"}}, 3), new String[][]{{"getActiveView", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:5>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.databind.SerializationFeature[]", "<null>"}}, 3), new String[][]{{"getActiveView", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:5>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.databind.SerializationFeature[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getPropertyNamingStrategy", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:4>"}}, 3), new String[][]{{"shouldSortPropertiesAlphabetically", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getPropertyNamingStrategy", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:4>"}}, 3), new String[][]{{"shouldSortPropertiesAlphabetically", "", "3"}, {"hasMapperFeatures", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "findMixInClassFor", "java.lang.Class", "<null>"}}, 3), new String[][]{{"getClassIntrospector", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.MapperFeature[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getSubtypeResolver", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "withPropertyInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Value", "<null>"}}, 3), new String[][]{{"getClassIntrospector", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getSubtypeResolver", ""}}, 3), new String[][]{{"getClassIntrospector", "", "1"}, {"getFilterProvider", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "hasMapperFeatures", "int", "2147483647"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getSubtypeResolver", ""}}, 3), new String[][]{{"getClassIntrospector", "", "1"}, {"getFilterProvider", "", "7"}, {"with", "com.fasterxml.jackson.databind.MapperFeature[]", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "hasMapperFeatures", "int", "2147483647"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getSubtypeResolver", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:2>"}}, 3), new String[][]{{"getClassIntrospector", "", "1"}, {"getDateFormat", "", "7"}, {"with", "com.fasterxml.jackson.databind.MapperFeature[]", "1"}, {"introspectDirectClassAnnotations", "java.lang.Class", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "hasMapperFeatures", "int", "2147483647"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getSubtypeResolver", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:2>"}}, 3), new String[][]{{"getClassIntrospector", "", "1"}, {"forDeserializationWithBuilder", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findFactoryMethod", "java.lang.Class[]", "7"}, {"bindingsForBeanType", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 3), new String[][]{{"getClassIntrospector", "", "4"}, {"forDeserializationWithBuilder", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findFactoryMethod", "java.lang.Class[]", "7"}, {"findProperties", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[Property 'class'; ctors: null, field(s): null, getter(s): [method java.lang.Object#getClass(0 params)][visible=true,ignore=false,explicitName=false], setter(s): null]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 14, new String[][]{}, 2), new String[][]{{"getClassIntrospector", "", "4"}, {"forDeserializationWithBuilder", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findFactoryMethod", "java.lang.Class[]", "7"}, {"findProperties", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[Property 'class'; ctors: null, field(s): null, getter(s): [method java.lang.Object#getClass(0 params)][visible=true,ignore=false,explicitName=false], setter(s): null]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultVisibilityChecker", ""}}, 2), new String[][]{{"getClassIntrospector", "", "4"}, {"forDeserializationWithBuilder", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findFactoryMethod", "java.lang.Class[]", "7"}, {"findProperties", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[Property 'class'; ctors: null, field(s): null, getter(s): [method java.lang.Object#getClass(0 params)][visible=true,ignore=false,explicitName=false], setter(s): null]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:8>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultVisibilityChecker", ""}}, 2), new String[][]{{"getClassIntrospector", "", "4"}, {"forDeserializationWithBuilder", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findFactoryMethod", "java.lang.Class[]", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:9>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:7>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultVisibilityChecker", ""}}, 2), new String[][]{{"getClassIntrospector", "", "4"}, {"forDeserializationWithBuilder", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findFactoryMethod", "java.lang.Class[]", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "introspect", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultVisibilityChecker", ""}}, 1), new String[][]{{"getClassIntrospector", "", "4"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findProperty", "com.fasterxml.jackson.databind.PropertyName", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultVisibilityChecker", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultPropertyInclusion", ""}}, 3), new String[][]{{"getClassIntrospector", "", "4"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findBackReferenceProperties", "", "5"}, {"getClassInfo", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.Object] {getFieldCount=0, getMemberMethodCount=11, getModifiers=1, getName=java.lang.Object, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultVisibilityChecker", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultPropertyInclusion", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:6>"}}, 3), new String[][]{{"getClassIntrospector", "", "4"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findBackReferenceProperties", "", "5"}, {"getClassInfo", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.Object] {getFieldCount=0, getMemberMethodCount=11, getModifiers=1, getName=java.lang.Object, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.Base64Variant", "<null>"}}, 2), new String[][]{{"getClassIntrospector", "", "4"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findBackReferenceProperties", "", "3"}, {"getClassInfo", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.Object] {getFieldCount=0, getMemberMethodCount=11, getModifiers=1, getName=java.lang.Object, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getAttributes", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "canOverrideAccessModifiers", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultPropertyInclusion", "java.lang.Class", "<sample:1>"}}, 1), new String[][]{{"getClassIntrospector", "", "1"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findCreatorParameterNames", "", "0"}, {"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:8>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getAttributes", ""}}, 2), new String[][]{{"getClassIntrospector", "", "1"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findCreatorParameterNames", "", "3"}, {"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultPrettyPrinter", ""}}, 3), new String[][]{{"getClassIntrospector", "", "1"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findCreatorParameterNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "canOverrideAccessModifiers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:5>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:7>"}}, 1), new String[][]{{"getClassIntrospector", "", "7"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findSerializationConverter", "", "3"}, {"hasKnownClassAnnotations", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:8>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:4>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature,com.fasterxml.jackson.core.JsonFactory", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:2>"}}, 2), new String[][]{{"getClassIntrospector", "", "5"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.jsontype.SubtypeResolver"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature,com.fasterxml.jackson.core.JsonFactory", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:2>"}}, 3), new String[][]{{"getClassIntrospector", "", "5"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:8>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:7>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:5>"}}, 1), new String[][]{{"getClassIntrospector", "", "5"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findPropertyInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Value", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_NULL,content=NON_NULL] {getContentInclusion=NON_NULL, getValueInclusion=NON_NULL}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:7>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:5>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:2>"}}, 1), new String[][]{{"getClassIntrospector", "", "5"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214884, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:6>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<empty>"}}, 1), new String[][]{{"getClassIntrospector", "", "4"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "4"}, {"findJsonValueMethod", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:6>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<empty>"}}, 1), new String[][]{{"getClassIntrospector", "", "3"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "4"}, {"findProperties", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:6>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:1>"}}, 1), new String[][]{{"getClassIntrospector", "", "3"}, {"getTimeZone", "", "4"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Coordinated Universal Time, getID=UTC, getRawOffset=0, isDirty...#207#893006384", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:6>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:1>"}}, 1), new String[][]{{"getClassIntrospector", "", "3"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "4"}, {"instantiateBean", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", actual.getClass().getName());
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:3>"}}, 1), new String[][]{{"getClassIntrospector", "", "4"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "4"}, {"findCreatorParameterNames", "", "2"}, {"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:3>"}}, 2), new String[][]{{"getClassIntrospector", "", "4"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "4"}, {"findCreatorParameterNames", "", "2"}, {"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:0>"}}, 3), new String[][]{{"getHandlerInstantiator", "", "3"}, {"introspectDirectClassAnnotations", "com.fasterxml.jackson.databind.JavaType", "5"}, {"findCreatorParameterNames", "", "1"}, {"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.MapperFeature[]"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:1>"}}, 2), new String[][]{{"getClassIntrospector", "", "2"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "5"}, {"findCreatorParameterNames", "", "1"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:8>"}, false, 0, null, 3), new String[][]{{"getSerializationFeatures", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2721980", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"getSerializationFeatures", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2722220", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:6>"}}, 3), new String[][]{{"getSerializationFeatures", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2722228", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:6>"}}, 3), new String[][]{{"getSerializationFeatures", "", "4"}, {"constructType", "com.fasterxml.jackson.core.type.TypeReference", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:1>"}, false, 0, null, 3), new String[][]{{"getRootName", "", "2"}, {"isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "5"}, {"with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214892, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "typeIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:5>", "<sample:2>"}}, 1), new String[][]{{"getRootName", "", "2"}, {"isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "4"}, {"with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214882, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "introspect", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.jsontype.SubtypeResolver", "<sample:7>"}}, 2), new String[][]{{"getBase64Variant", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "findRootName", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 9, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withNoProblemHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:1>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withNoProblemHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:0>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withNoProblemHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:0>", "<sample:0>"}}, 1), new String[][]{{"introspectClassAnnotations", "com.fasterxml.jackson.databind.JavaType", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withNoProblemHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:7>", "<sample:0>"}}, 1), new String[][]{{"introspectClassAnnotations", "com.fasterxml.jackson.databind.JavaType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "without", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withAttribute", "java.lang.Object,java.lang.Object", "<i:2>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "without", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:1>"}, false, 0, null, 2), new String[][]{{"introspectClassAnnotations", "java.lang.Class", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<sample:0>"}}, 2), new String[][]{{"getActiveView", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "typeResolverBuilderInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getAnnotationIntrospector", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "typeResolverBuilderInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getAnnotationIntrospector", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "typeResolverBuilderInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getAnnotationIntrospector", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.core.FormatFeature", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:6>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "getTimeZone", ""}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withRootName", "java.lang.String", "{\"a\":1}m"}}), new String[][]{{"valueFor", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface com.fasterxml.jackson.annotation.JsonInclude {getAnnotatedInterfaces=?, getAnnotations=?, getCanonicalName=com.fasterxml.jackson.annotation.JsonInclude, getClasses=[class com.fasterxml.jacks...#755#-1498942298", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withRootName", "java.lang.String", "{\"a\":1}m"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withRootName", "java.lang.String", "{\"a\":1}m"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}}), new String[][]{{"getContentInclusion", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("USE_DEFAULTS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}}), new String[][]{{"getContentInclusion", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("USE_DEFAULTS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}}), new String[][]{{"getContentInclusion", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("USE_DEFAULTS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=<a><b>t</b></a>, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}}), new String[][]{{"getContentInclusion", "", "0"}, {"withOverrides", "com.fasterxml.jackson.annotation.JsonInclude$Value", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_NULL,content=NON_NULL] {getContentInclusion=NON_NULL, getValueInclusion=NON_NULL}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=<a><b>t</b></a>, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:6>", "false"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:0>"}}), new String[][]{{"getContentInclusion", "", "0"}, {"withOverrides", "com.fasterxml.jackson.annotation.JsonInclude$Value", "6"}, {"withOverrides", "com.fasterxml.jackson.annotation.JsonInclude$Value", "6"}, {"withContentInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_NULL,content=NON_NULL] {getContentInclusion=NON_NULL, getValueInclusion=NON_NULL}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "typeResolverBuilderInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.MapperFeature", "boolean"}, new String[]{"<sample:3>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withoutAttribute", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getDefaultTyper", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.JsonGenerator$Feature[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "shouldSortPropertiesAlphabetically", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "findMixInClassFor", "java.lang.Class", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:2>"}}), new String[][]{{"getClassIntrospector", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "introspectDirectClassAnnotations", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "compileString", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getDeserializationFeatures", ""}, {"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("2020-01-01 {getValue=2020-01-01}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "hasMapperFeatures", "int", "-1073741823"}}), new String[][]{{"getClassIntrospector", "", "1"}, {"forDeserializationWithBuilder", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findFactoryMethod", "java.lang.Class[]", "7"}, {"bindingsForBeanType", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "useRootWrapping", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.FormatFeature[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", ""}, {"com.fasterxml.jackson.databind.DeserializationConfig", "copy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withAttributes", "java.util.Map", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "introspectClassAnnotations", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:2>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "hasDeserializationFeatures", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "mixInCount", ""}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Coordinated Universal Time, getID=UTC, getRawOffset=0, isDirty...#207#893006384", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}), new String[][]{{"getClassIntrospector", "", "4"}, {"forDeserializationWithBuilder", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findFactoryMethod", "java.lang.Class[]", "7"}, {"findProperties", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[Property 'class'; ctors: null, field(s): null, getter(s): [method java.lang.Object#getClass(0 params)][visible=true,ignore=false,explicitName=false], setter(s): null]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.introspect.ClassIntrospector", "<sample:0>"}}), new String[][]{{"getClassIntrospector", "", "4"}, {"forDeserializationWithBuilder", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findFactoryMethod", "java.lang.Class[]", "7"}, {"findProperties", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[Property 'class'; ctors: null, field(s): null, getter(s): [method java.lang.Object#getClass(0 params)][visible=true,ignore=false,explicitName=false], setter(s): null]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "java.text.DateFormat", "<sample:7>"}}), new String[][]{{"getClassIntrospector", "", "4"}, {"forDeserializationWithBuilder", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findFactoryMethod", "java.lang.Class[]", "7"}, {"findProperties", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[Property 'class'; ctors: null, field(s): null, getter(s): [method java.lang.Object#getClass(0 params)][visible=true,ignore=false,explicitName=false], setter(s): null]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "findRootName", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getSerializationFeatures", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "constructType", "java.lang.Class", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2722236", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "introspect", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultVisibilityChecker", ""}}), new String[][]{{"getClassIntrospector", "", "4"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findProperty", "com.fasterxml.jackson.databind.PropertyName", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:7>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "introspect", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:2>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultVisibilityChecker", ""}}), new String[][]{{"getClassIntrospector", "", "4"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findProperty", "com.fasterxml.jackson.databind.PropertyName", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withPropertyInclusion", new String[]{"com.fasterxml.jackson.annotation.JsonInclude$Value"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=!NullPointerException, isAnnotationProcessingEnabl...#250#457742259", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "findRootName", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "introspectClassAnnotations", "java.lang.Class", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withRootName", new String[]{"java.lang.String"}, new String[]{" "}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName= , getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, shouldSor...#232#58414173", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getSubtypeResolver", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214904, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "shouldSortPropertiesAlphabetically", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getLocale", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultVisibilityChecker", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultPropertyInclusion", ""}}), new String[][]{{"getClassIntrospector", "", "4"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findBackReferenceProperties", "", "5"}, {"findBackReferenceProperties", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "findMixInClassFor", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getLocale", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultVisibilityChecker", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultPropertyInclusion", ""}}), new String[][]{{"getClassIntrospector", "", "4"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findBackReferenceProperties", "", "5"}, {"getClassInfo", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.Object] {getFieldCount=0, getMemberMethodCount=11, getModifiers=1, getName=java.lang.Object, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDeserializationFeatures", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15214880", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:6>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:5>"}}), new String[][]{{"getClassIntrospector", "", "4"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findBackReferenceProperties", "", "5"}, {"getClassInfo", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.Object] {getFieldCount=0, getMemberMethodCount=11, getModifiers=1, getName=java.lang.Object, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getDefaultPropertyInclusion", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.Base64Variant", "<null>"}}), new String[][]{{"getSerializationFeatures", "", "4"}, {"compileString", "java.lang.String", "7"}, {"asQuotedChars", "", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[s, a, m, p, l, e]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getTypeFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultVisibilityChecker", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getNodeFactory", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "java.util.Locale", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeFactory", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withView", "java.lang.Class", "<sample:5>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:6>"}}), new String[][]{{"getClassIntrospector", "", "4"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findCreatorParameterNames", "", "3"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getAttributes", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}}), new String[][]{{"getClassIntrospector", "", "4"}, {"compileString", "java.lang.String", "7"}, {"getValue", "", "1"}, {"appendQuoted", "char[],int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getAttributes", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "canOverrideAccessModifiers", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultPropertyInclusion", "java.lang.Class", "<sample:5>"}}), new String[][]{{"with", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "1"}, {"compileString", "java.lang.String", "7"}, {"getValue", "", "1"}, {"appendQuoted", "char[],int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "canOverrideAccessModifiers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withAttributes", "java.util.Map", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getHandlerInstantiator", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDateFormat", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl", actual.getClass().getName());
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getRootName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "typeResolverBuilderInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:2>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:8>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getAttributes", ""}}), new String[][]{{"getClassIntrospector", "", "1"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findCreatorParameterNames", "", "3"}, {"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:8>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getAttributes", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultPrettyPrinter", ""}}), new String[][]{{"getClassIntrospector", "", "1"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findCreatorParameterNames", "", "3"}, {"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:5>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:1>"}}), new String[][]{{"getClassIntrospector", "", "1"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "7"}, {"findCreatorParameterNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "constructType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getAttributes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withRootName", "com.fasterxml.jackson.databind.PropertyName", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getRootName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "isEnabled", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getAttributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "hasSomeOfFeatures", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withView", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.type.TypeFactory", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:0>"}}), new String[][]{{"getClassIntrospector", "", "3"}, {"forCreation", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "introspectDirectClassAnnotations", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "typeResolverBuilderInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:2>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withoutFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withAttributes", "java.util.Map", "<sample:1>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "findTypeDeserializer", "com.fasterxml.jackson.databind.JavaType", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withAttributes", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getSubtypeResolver", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDateFormat", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withRootName", "com.fasterxml.jackson.databind.PropertyName", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "collectFeatureDefaults", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withAppendedAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultVisibilityChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "constructType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getDefaultPropertyInclusion", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withFeatures", "com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "findRootName", "java.lang.Class", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "hasSerializationFeatures", new String[]{"int"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "without", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989b8] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722232, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#1112562035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getBase64Variant", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withDefaultPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getTypeFactory", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getProblemHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "findRootName", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "compileString", "java.lang.String", "1/51e300"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "introspectForCreation", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getHandlerInstantiator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.jsontype.SubtypeResolver"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getActiveView", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "findRootName", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getDefaultTyper", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getSerializationInclusion", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", actual.getClass().getName());
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withRootName", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false), new String[][]{{"with", "com.fasterxml.jackson.databind.jsontype.SubtypeResolver", "4"}, {"canOverrideAccessModifiers", "", "1"}, {"isAnnotationProcessingEnabled", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "introspectDirectClassAnnotations", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "withFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "introspectForBuilder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withFeatures", new String[]{"com.fasterxml.jackson.databind.SerializationFeature[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getRootName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "useRootWrapping", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "isAnnotationProcessingEnabled", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "isAnnotationProcessingEnabled", ""}, {"com.fasterxml.jackson.databind.SerializationConfig", "isAnnotationProcessingEnabled", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "hasSomeOfFeatures", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "without", "com.fasterxml.jackson.core.FormatFeature", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "compileString", new String[]{"java.lang.String"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("-1 {getValue=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getActiveView", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getSubtypeResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "introspect", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "isEnabled", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:1>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getFilterProvider", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getHandlerInstantiator", ""}, {"com.fasterxml.jackson.databind.DeserializationConfig", "canOverrideAccessModifiers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "constructDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getFullRootName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<null>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "getActiveView", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "typeIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:1>", "<sample:5>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getSerializationFeatures", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "introspectClassAnnotations", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<sample:6>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "typeIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:5>", "<sample:2>"}}), new String[][]{{"getRootName", "", "2"}, {"isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "introspect", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.jsontype.SubtypeResolver", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "introspect", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.jsontype.SubtypeResolver", "<sample:7>"}}), new String[][]{{"getBase64Variant", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<sample:3>"}}), new String[][]{{"valueFor", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface com.fasterxml.jackson.annotation.JsonInclude {getAnnotatedInterfaces=?, getAnnotations=?, getCanonicalName=com.fasterxml.jackson.annotation.JsonInclude, getClasses=[class com.fasterxml.jacks...#755#-1498942298", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "getDefaultPropertyInclusion", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getBase64Variant", ""}, {"com.fasterxml.jackson.databind.DeserializationConfig", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<sample:6>"}, {"com.fasterxml.jackson.databind.DeserializationConfig", "getClassIntrospector", ""}}), new String[][]{{"withOverrides", "com.fasterxml.jackson.annotation.JsonInclude$Value", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_ABSENT,content=NON_EMPTY] {getContentInclusion=NON_EMPTY, getValueInclusion=NON_ABSENT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "findRootName", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getFullRootName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "without", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getTimeZone", ""}}), new String[][]{{"getDefaultPropertyInclusion", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getNodeFactory", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getNodeFactory", ""}}), new String[][]{{"typeIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "without", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withAttribute", "java.lang.Object,java.lang.Object", "<i:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "without", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:7>"}, false), new String[][]{{"introspectForBuilder", "com.fasterxml.jackson.databind.JavaType", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "withFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<sample:0>"}}), new String[][]{{"getActiveView", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:10>"}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector"}, new String[]{"<sample:10>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.DeserializationConfig", "getSubtypeResolver", ""}}, 2), new String[][]{{"getDeserializationFeatures", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15214880", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "hasSerializationFeatures", new String[]{"int"}, new String[]{"-1"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:7>", "false"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:2>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "with", "java.util.Locale", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "canOverrideAccessModifiers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "initialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "getAnnotationIntrospector", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:2>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214886, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214886, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "with", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "constructType", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.SerializationConfig", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getHandlerInstantiator", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getHandlerInstantiator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.jsontype.SubtypeResolver", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.jsontype.SubtypeResolver", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "getPropertyNamingStrategy", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "with", "com.fasterxml.jackson.databind.jsontype.SubtypeResolver", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyNamingStrategy", actual.getClass().getName());
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "isAnnotationProcessingEnabled", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "isAnnotationProcessingEnabled", ""}}), new String[][]{{"getDefaultPropertyInclusion", "java.lang.Class", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "isAnnotationProcessingEnabled", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.SerializationConfig", "withFeatures", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.SerializationConfig", "constructType", "java.lang.Class", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.receiverState());
 }
}
