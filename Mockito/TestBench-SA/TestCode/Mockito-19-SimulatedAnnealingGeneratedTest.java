package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "nop", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:1>", "<empty>", "<d:1.5>"}, false, 2, new String[][]{{"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:2>", "<empty>", "<i:0>"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:1>", "<empty>", "<d:1.5>"}, false, 2, new String[][]{{"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:2>", "<empty>", "<i:0>"}}), new String[][]{{"thenInject", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:1>", "<sample:0>", "<s:>"}, false, 3, new String[][]{}), new String[][]{{"thenInject", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:5>", "<null>", "<sample:0>", "<s:>"}, false, 3, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:2>", "<sample:1>", "<s:key>"}}, 3), new String[][]{{"thenInject", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:5>", "<null>", "<sample:0>", "<s:ac>"}, false, 3, new String[][]{{"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:0>", "<sample:0>", "<i:1>"}, {"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:2>", "<sample:1>", "<s:kdy>"}}, 1), new String[][]{{"thenInject", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:5>", "<null>", "<sample:2>", "<i:-1>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<null>", "<null>", "<sample:3>", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<null>", "<sample:2>", "<i:25>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<empty>", "<sample:2>", "<i:25>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<empty>", "<sample:3>", "<i:25>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<null>", "<sample:1>", "<sample:1>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:3>", "<sample:1>", "<i:-1>"}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:0>", "<sample:3>", "<i:25>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<null>", "<sample:1>", "<sample:1>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:3>", "<sample:1>", "<i:-1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:0>", "<sample:2>", "<i:25>"}, false, 7, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<null>", "<sample:1>", "<sample:1>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:3>", "<sample:1>", "<i:-1>"}}, 3), new String[][]{{"thenInject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<sample:0>", "<d:1.5>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<sample:0>", "<d:0.696>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<null>", "<sample:2>", "<s:>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<empty>", "<sample:0>", "<b:true>"}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:0>", "<sample:0>", "<b:true>"}, false), new String[][]{{"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:0>", "<sample:0>", "<b:true>"}, false), new String[][]{{"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:1>", "<sample:0>", "<b:true>"}, false), new String[][]{{"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:0>", "<sample:3>", "<i:0>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:0>", "<sample:1>", "<s:key>"}}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:0>", "<sample:3>", "<i:0>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:0>", "<sample:1>", "<s:key>"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:1>", "<empty>", "<i:0>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:0>", "<sample:1>", "<s:key>"}, {"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:1>", "<sample:0>", "<i:0>"}}), new String[][]{{"thenInject", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<null>", "<b:true>", "<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<null>", "<s:a>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:1>", "<s:>", "<sample:0>"}, {"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "<sample:6>"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "nop", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "2"}, {"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "6"}, {"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "nop", new String[]{}, new String[]{}, true), new String[][]{{"thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "2"}, {"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "6"}, {"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<empty>", "<sample:0>", "<i:-1>"}, false, 3, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:0>", "<sample:1>", "<b:true>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:0>", "<empty>", "<i:0>"}}), new String[][]{{"thenInject", "", "2"}, {"thenInject", "", "6"}, {"thenInject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<empty>", "<sample:0>", "<i:-1>"}, false, 2, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:0>", "<sample:1>", "<b:true>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:0>", "<empty>", "<i:0>"}}), new String[][]{{"thenInject", "", "2"}, {"thenInject", "", "6"}, {"thenInject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<empty>", "<sample:0>", "<i:-1>"}, false, 6, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:0>", "<sample:1>", "<b:true>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:0>", "<empty>", "<i:0>"}}), new String[][]{{"thenInject", "", "2"}, {"thenInject", "", "6"}, {"thenInject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<empty>", "<sample:0>", "<i:-1>"}, false, 5, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:0>", "<sample:1>", "<b:true>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:0>", "<empty>", "<i:0>"}}), new String[][]{{"thenInject", "", "2"}, {"thenInject", "", "6"}, {"thenInject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:2>", "<sample:2>", "<s:]>"}, false, 10, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<empty>", "<sample:1>", "<i:-1>"}, {"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:2>", "<empty>", "<i:1>"}}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:2>", "<sample:2>", "<s:]>"}, false, 7, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<empty>", "<sample:1>", "<i:-1>"}, {"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:2>", "<empty>", "<i:1>"}}, 2), new String[][]{{"thenInject", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:3>", "<sample:2>", "<s:\\>"}, false, 7, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:2>", "<sample:1>", "<i:25>"}, {"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<sample:1>", "<sample:0>", "<null>"}, {"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:2>", "<empty>", "<i:2>"}}, 2), new String[][]{{"thenInject", "", "6"}, {"thenInject", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:3>", "<sample:1>", "<i:0>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<sample:1>", "<sample:1>", "<null>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<null>", "<sample:2>", "<sample:2>", "<d:1.5>"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:3>", "<sample:1>", "<i:0>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<sample:1>", "<sample:1>", "<null>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<null>", "<sample:2>", "<sample:2>", "<d:1.5>"}}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<sample:3>", "<s:b>", "<null>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:3>", "<i:2>", "<sample:2>"}, {"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<null>", "<d:1.5>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:2>", "<s:key>", "<sample:2>"}}), new String[][]{{"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:2>", "<s:key>", "<sample:2>"}}, 1), new String[][]{{"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<null>", "<sample:2>", "<i:33554431>"}, false, 7, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:2>", "<null>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<empty>", "<sample:2>", "<i:-2147483647>"}, false, 7, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:2>", "<sample:3>", "<s:>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:3>", "<s:aa>", "<empty>"}, {"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:2>", "<i:54>", "<null>"}}, 3), new String[][]{{"thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "6"}, {"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "1"}, {"thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:3>", "<i:-54>", "<null>"}}, 3), new String[][]{{"thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "6"}, {"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "1"}, {"thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "4"}, {"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:0>", "<null>", "<i:2>"}, false, 0, null, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:0>", "<null>", "<s:[>"}, false, 1, new String[][]{}), new String[][]{{"thenInject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "nop", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "<sample:7>"}}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<sample:2>", "<b:true>", "<sample:6>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "<sample:4>"}, {"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "<sample:4>"}, {"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:0>", "<empty>", "<d:1.5>"}, false), new String[][]{{"thenInject", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:0>", "<empty>", "<d:0.75>"}, false, 0, null, 1), new String[][]{{"thenInject", "", "0"}, {"thenInject", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<empty>", "<i:25>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:0>", "<s:>", "<sample:3>"}}, 2), new String[][]{{"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:1>", "<sample:2>", "<i:-30>"}, false, 5, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:0>", "<empty>", "<i:1>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:1>", "<sample:2>", "<i:0>"}}), new String[][]{{"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:1>", "<sample:2>", "<i:-30>"}, false, 6, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:0>", "<sample:0>", "<i:1>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:1>", "<sample:2>", "<i:0>"}}), new String[][]{{"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:1>", "<sample:3>", "<i:1>"}, false, 6, new String[][]{{"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:4>", "<sample:3>", "<sample:3>", "<s:key>"}}, 3), new String[][]{{"thenInject", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "nop", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "6"}, {"thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<null>", "<s:>", "<null>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<empty>", "<s:>", "<null>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:2>", "<sample:2>", "<null>"}, false, 0, null, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<null>", "<sample:0>", "<i:-24>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:3>", "<sample:2>", "<i:2>"}}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<sample:0>", "<null>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:0>", "<sample:3>", "<s:>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:0>", "<sample:3>", "<s:>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:0>", "<sample:1>", "<i:0>"}, false, 2, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<empty>", "<sample:1>", "<s:>"}}, 2), new String[][]{{"thenInject", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:0>", "<sample:1>", "<b:true>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<null>", "<s:>", "<sample:0>"}, false, 2, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:0>", "<i:-51>", "<null>"}, {"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "<sample:5>"}, {"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:3>", "<sample:0>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:1>", "<sample:0>", "<i:0>"}, false, 0, null, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<null>", "<sample:0>", "<i:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:3>", "<sample:0>", "<i:0>"}, false, 0, null, 1), new String[][]{{"thenInject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:3>", "<sample:1>", "<s:b>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:0>", "<i:1>", "<sample:3>"}}, 1), new String[][]{{"thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:3>", "<sample:2>", "<s:key>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<null>", "<null>", "<sample:0>"}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:3>", "<sample:2>", "<s:key>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<null>", "<null>", "<sample:0>"}}, 3), new String[][]{{"thenInject", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<sample:2>", "<i:-1>", "<empty>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<null>", "<i:-7>", "<sample:1>"}, false, 2, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:0>", "<d:1.5>", "<sample:1>"}, {"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<empty>", "<b:true>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<null>", "<sample:0>", "<i:-2147483648>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<null>", "<sample:0>", "<i:-2147483648>"}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<null>", "<s:key>", "<sample:1>"}, false, 11, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:2>", "<d:1.5>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:1>", "<sample:1>", "<i:25>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<null>", "<sample:3>", "<sample:1>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:0>", "<empty>", "<i:1>"}}, 3), new String[][]{{"thenInject", "", "2"}, {"thenInject", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:1>", "<sample:0>", "<i:-38>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:1>", "<sample:0>", "<d:1.5>"}}, 1), new String[][]{{"thenInject", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<null>", "<s:b>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:0>", "<null>", "<i:1>"}, false), new String[][]{{"thenInject", "", "1"}, {"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:1>", "<null>", "<i:0>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:2>", "<sample:0>", "<i:-4>"}}, 2), new String[][]{{"thenInject", "", "1"}, {"thenInject", "", "7"}, {"thenInject", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<null>", "<sample:5>", "<b:false>"}, false, 10, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<null>", "<sample:3>", "<sample:2>", "<b:true>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "nop", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "5"}, {"thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:2>", "<sample:3>", "<i:1>"}, false, 0, null, 3), new String[][]{{"thenInject", "", "6"}, {"thenInject", "", "3"}, {"thenInject", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:3>", "<sample:1>", "<i:-2147483648>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:2>", "<empty>", "<i:2>"}}, 3), new String[][]{{"thenInject", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:0>", "<empty>", "<s:b>"}, false, 4, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:0>", "<sample:0>", "<i:1>"}}), new String[][]{{"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:1>", "<empty>", "<s:b>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:1>", "<empty>", "<i:1>"}, false, 4, new String[][]{}, 2), new String[][]{{"thenInject", "", "0"}, {"thenInject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:1>", "<empty>", "<i:1>"}, false, 8, new String[][]{}, 2), new String[][]{{"thenInject", "", "0"}, {"thenInject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:2>", "<sample:5>", "<b:false>"}, false, 0, null, 1), new String[][]{{"thenInject", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<empty>", "<sample:3>", "<null>"}, false, 5, new String[][]{{"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:0>", "<sample:3>", "<null>"}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:1>", "<null>", "<s:\n\n>"}, false, 9, new String[][]{{"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:0>", "<sample:3>", "<i:0>"}, {"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<null>", "<sample:2>", "<sample:0>", "<i:25>"}, {"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<empty>", "<empty>", "<s:>"}}, 2), new String[][]{{"thenInject", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:1>", "<sample:1>", "<s:l\u00e8\u00e8>"}, false, 8, new String[][]{}, 1), new String[][]{{"thenInject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:4>", "<sample:3>", "<s:k.y>"}, false, 9, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:6>", "<sample:1>", "<sample:0>", "<i:25>"}, {"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:2>", "<empty>", "<i:25>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<null>", "<b:true>", "<sample:3>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<null>", "<sample:1>", "<sample:4>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:1>", "<sample:3>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:2>", "<sample:3>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:0>", "<empty>", "<s:L>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:1>", "<sample:0>", "<sample:1>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:1>", "<null>", "<sample:1>"}}, 2), new String[][]{{"thenInject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:2>", "<null>", "<sample:1>"}, false, 5, new String[][]{}, 1), new String[][]{{"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:2>", "<null>", "<sample:1>"}, false, 6, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:3>", "<empty>", "<d:1.5>"}}, 1), new String[][]{{"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<empty>", "<sample:3>", "<s:>"}, false, 5, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:0>", "<sample:0>", "<null>"}}, 3), new String[][]{{"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:2>", "<null>", "<i:0>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<empty>", "<null>", "<s:a>"}, {"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<empty>", "<sample:1>", "<s:key>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "nop", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:3>", "<sample:4>", "<i:-25>"}, false, 7, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<null>", "<sample:0>", "<empty>", "<i:1>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<empty>", "<sample:3>", "<i:2>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<null>", "<empty>", "<sample:0>", "<null>"}}), new String[][]{{"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<null>", "<sample:1>", "<s:>"}, false, 0, null, 3), new String[][]{{"thenInject", "", "1"}, {"thenInject", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<null>", "<sample:3>", "<i:25>"}, false, 2, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:1>", "<sample:3>", "<null>"}}), new String[][]{{"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<null>", "<sample:0>", "<i:50>"}, false, 9, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:1>", "<sample:3>", "<null>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:2>", "<null>", "<s:key>"}}), new String[][]{{"thenInject", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:0>", "<empty>", "<i:-2147483625>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:0>", "<sample:0>", "<i:0>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<empty>", "<sample:2>", "<d:1.5>"}}, 2), new String[][]{{"thenInject", "", "2"}, {"thenInject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:3>", "<sample:3>", "<i:-2147483648>"}, false, 4, new String[][]{}, 1), new String[][]{{"thenInject", "", "1"}, {"thenInject", "", "4"}, {"thenInject", "", "0"}, {"thenInject", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:4>", "<sample:2>", "<b:false>"}, false, 1, new String[][]{}), new String[][]{{"thenInject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:0>", "<empty>", "<s:ley>"}, false, 7, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:3>", "<sample:3>", "<i:1>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:2>", "<sample:0>", "<s:b>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:0>", "<sample:2>", "<b:true>"}}, 2), new String[][]{{"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<empty>", "<sample:1>", "<i:1>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:2>", "<empty>", "<i:2>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:0>", "<sample:1>", "<s:b>"}}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:1>", "<null>", "<i:-40>"}, false, 9, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:6>", "<sample:0>", "<sample:2>", "<d:1.5>"}}, 2), new String[][]{{"thenInject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:0>", "<sample:1>", "<s:k>"}, false, 10, new String[][]{}, 1), new String[][]{{"thenInject", "", "6"}, {"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("value", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:2>", "<sample:1>", "<s:>"}, false, 4, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:4>", "<sample:2>", "<sample:1>", "<i:0>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<null>", "<sample:1>", "<sample:1>", "<s:>"}}, 3), new String[][]{{"thenInject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:1>", "<sample:3>", "<i:1>"}, false, 2, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<empty>", "<sample:0>", "<sample:0>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<null>", "<sample:2>", "<s:b>"}}, 1), new String[][]{{"thenInject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:4>", "<sample:0>", "<sample:2>"}, false, 11, new String[][]{}, 3), new String[][]{{"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:0>", "<sample:4>", "<i:-73>"}, false, 9, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:1>", "<null>", "<s:b>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<null>", "<sample:3>", "<s:b>"}}, 1), new String[][]{{"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:0>", "<sample:4>", "<i:-73>"}, false, 9, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:1>", "<null>", "<s:b>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<null>", "<sample:3>", "<s:b>"}}, 3), new String[][]{{"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:1>", "<sample:1>", "<s:>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:3>", "<sample:2>", "<d:1.5>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<empty>", "<sample:2>", "<sample:1>"}}, 1), new String[][]{{"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:2>", "<sample:0>", "<s:k;ey>"}, false, 6, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:3>", "<sample:3>", "<i:0>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:1>", "<empty>", "<d:1.436>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<null>", "<sample:3>", "<sample:1>"}}, 3), new String[][]{{"thenInject", "", "6"}, {"thenInject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:1>", "<sample:3>", "<i:-13>"}, false, 14, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:3>", "<sample:0>", "<s:a>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:6>", "<sample:1>", "<sample:4>", "<sample:1>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:0>", "<sample:1>", "<i:0>"}}, 1), new String[][]{{"thenInject", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:4>", "<sample:0>", "<b:true>"}, false, 2, new String[][]{}, 3), new String[][]{{"thenInject", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:0>", "<sample:3>", "<d:15.0>"}, false, 8, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:0>", "<null>", "<i:25>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:5>", "<null>", "<i:-1>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<null>", "<sample:0>", "<i:-1>"}}, 3), new String[][]{{"thenInject", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<empty>", "<sample:1>", "<s:[>"}, false, 4, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<empty>", "<sample:0>", "<i:0>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:0>", "<sample:1>", "<b:true>"}}, 1), new String[][]{{"thenInject", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:0>", "<empty>", "<i:0>"}, false, 14, new String[][]{}, 2), new String[][]{{"thenInject", "", "4"}, {"thenInject", "", "2"}, {"thenInject", "", "1"}, {"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:0>", "<sample:2>", "<d:-659.0>"}, false, 6, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<null>", "<empty>", "<s:a>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:5>", "<sample:2>", "<i:60>"}}, 3), new String[][]{{"thenInject", "", "0"}, {"thenInject", "", "6"}, {"thenInject", "", "5"}, {"thenInject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "nop", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "1"}, {"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "0"}, {"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:1>", "<sample:3>", "<b:true>"}, false, 9, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<null>", "<null>", "<i:2>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:1>", "<sample:2>", "<i:-58>"}}, 2), new String[][]{{"thenInject", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:3>", "<sample:1>", "<s:bp\">"}, false, 13, new String[][]{}, 2), new String[][]{{"thenInject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<null>", "<sample:0>", "<i:2>"}, false, 5, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:3>", "<null>", "<i:25>"}}, 2), new String[][]{{"thenInject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
}
