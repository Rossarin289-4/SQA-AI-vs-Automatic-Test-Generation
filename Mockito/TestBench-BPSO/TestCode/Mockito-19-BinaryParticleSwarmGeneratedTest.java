package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:0>", "<sample:2>", "<i:2>"}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "nop", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:2>", "<sample:0>", "<s:b1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<null>", "<sample:1>", "<sample:3>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<sample:1>", "<s:]b>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "nop", new String[]{}, new String[]{}, true), new String[][]{{"thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "2"}, {"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:2>", "<sample:2>", "<d:1.5>"}, false, 7, new String[][]{}), new String[][]{{"thenInject", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<empty>", "<null>", "<i:-10>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:2>", "<sample:0>", "<s:key>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:7>", "<null>", "<sample:2>", "<s:key>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:0>", "<sample:0>", "<i:0>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:2>", "<sample:1>", "<i:10>"}}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "nop", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:4>", "<sample:3>", "<sample:0>"}, false, 4, new String[][]{});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<empty>", "<null>", "<b:true>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:3>", "<sample:3>", "<i:9>"}}), new String[][]{{"thenInject", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<empty>", "<null>", "<s:\naA>"}, false, 0, null, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:1>", "<null>", "<s:key>"}, false), new String[][]{{"thenInject", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:3>", "<sample:0>", "<b:true>"}, false, 5, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:4>", "<null>", "<s:a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<sample:3>"}, false), new String[][]{{"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 3), new String[][]{{"thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "7"}, {"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:0>", "<sample:4>", "<null>"}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:2>", "<sample:3>", "<i:1>"}, false, 2, new String[][]{{"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:3>", "<empty>", "<s:]b>"}}), new String[][]{{"thenInject", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:0>", "<sample:0>", "<i:15>"}, false), new String[][]{{"thenInject", "", "3"}, {"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "<sample:0>"}}, 1), new String[][]{{"thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:1>", "<sample:5>", "<s:a>"}, false, 3, new String[][]{}), new String[][]{{"thenInject", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:4>", "<sample:0>", "<d:1.5>"}, false, 4, new String[][]{{"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:0>", "<sample:2>", "<s:C>"}}, 3), new String[][]{{"thenInject", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:1>", "<null>", "<i:0>"}, false, 1, new String[][]{}, 2), new String[][]{{"thenInject", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<sample:1>", "<i:10>", "<sample:1>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<null>", "<sample:8>", "<i:2>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:0>", "<sample:1>", "<sample:0>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:0>", "<sample:1>", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<null>", "<sample:5>", "<s:]b>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:5>", "<empty>", "<s:c1>"}, {"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:3>", "<sample:2>", "<i:18>"}}, 1), new String[][]{{"thenInject", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<empty>", "<sample:3>", "<b:true>"}, false, 2, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:6>", "<sample:2>", "<sample:3>", "<i:30>"}}), new String[][]{{"thenInject", "", "6"}, {"thenInject", "", "2"}, {"thenInject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<sample:0>", "<s:>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:2>", "<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:2>", "<sample:2>", "<s:>"}}, 1), new String[][]{{"thenInject", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<sample:0>", "<s:>", "<sample:3>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:2>", "<s:a>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<null>", "<sample:4>", "<sample:0>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:5>", "<s:c>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:6>", "<sample:3>", "<s:b2>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:1>", "<sample:5>", "<s:bb>"}, {"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:1>", "<sample:2>", "<sample:1>"}}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:2>", "<sample:0>", "<b:true>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:1>", "<sample:1>", "<i:18>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<sample:3>", "<sample:6>", "<s:\n.>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:0>", "<empty>", "<i:-1>"}, false, 3, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<sample:0>", "<null>", "<i:-10>"}}, 2), new String[][]{{"thenInject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:4>", "<sample:7>", "<s:c>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<null>", "<sample:4>", "<sample:3>", "<s:]b>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<empty>", "<sample:3>", "<s:1>"}}, 2), new String[][]{{"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:4>", "<sample:3>", "<i:9>"}, false, 5, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:2>", "<sample:11>", "<i:-10>"}}, 1), new String[][]{{"thenInject", "", "5"}, {"thenInject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:2>", "<empty>", "<b:true>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:0>", "<sample:8>", "<s:a<>"}, false, 3, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<empty>", "<sample:3>", "<b:false>"}}), new String[][]{{"thenInject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "nop", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "<sample:4>"}}, 2), new String[][]{{"thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:5>", "<sample:8>", "<s:b1>"}, false, 1, new String[][]{}), new String[][]{{"thenInject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:2>", "<sample:4>", "<i:2>"}, false, 5, new String[][]{}, 3), new String[][]{{"thenInject", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<null>", "<sample:0>", "<d:-0.75>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:0>", "<sample:3>", "<i:10>"}, false, 5, new String[][]{}), new String[][]{{"thenInject", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<sample:2>", "<d:0.75>", "<sample:5>"}, false, 6, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:4>", "<s:xa>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:1>", "<null>", "<s:aa>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<null>", "<sample:3>", "<sample:5>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:4>", "<sample:1>", "<b:true>"}, false, 4, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<null>", "<sample:0>", "<sample:4>", "<s:r>"}}), new String[][]{{"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<null>", "<i:-23>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:0>", "<sample:0>", "<i:9>"}, false, 1, new String[][]{}), new String[][]{{"thenInject", "", "3"}, {"thenInject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<null>", "<i:0>", "<null>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:5>", "<i:-20>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<empty>", "<sample:2>", "<s:`>"}, false, 2, new String[][]{}), new String[][]{{"thenInject", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:3>", "<sample:1>", "<null>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:4>", "<empty>", "<s:a>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:1>", "<sample:11>", "<i:-2147483648>"}, false, 4, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:1>", "<sample:4>", "<sample:1>"}}), new String[][]{{"thenInject", "", "1"}, {"thenInject", "", "3"}, {"thenInject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:0>", "<sample:9>", "<s:h]b>"}, false, 1, new String[][]{}, 2), new String[][]{{"thenInject", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:4>", "<sample:4>", "<d:1.5>"}, false, 6, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:1>", "<sample:2>", "<i:2>"}}), new String[][]{{"thenInject", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:1>", "<sample:3>", "<s:l>"}, false, 5, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:2>", "<sample:2>", "<s:a>"}}, 1), new String[][]{{"thenInject", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:2>", "<sample:8>", "<i:2>"}, false, 3, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:3>", "<sample:4>", "<i:-5>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:2>", "<sample:9>", "<s:]b>"}}), new String[][]{{"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:0>", "<sample:1>", "<b:true>"}, false, 6, new String[][]{}), new String[][]{{"thenInject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:6>", "<sample:8>", "<i:9>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:2>", "<sample:1>", "<d:-1.5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:1>", "<sample:11>", "<i:9>"}, false, 0, null, 2), new String[][]{{"thenInject", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<null>", "<sample:8>", "<s:?]b>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:0>", "<sample:8>", "<i:-1>"}}, 1), new String[][]{{"thenInject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<null>", "<sample:0>", "<i:-5>"}, false, 5, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<null>", "<empty>", "<i:-2147483648>"}}), new String[][]{{"thenInject", "", "0"}, {"thenInject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<null>", "<i:2>", "<null>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:2>", "<sample:1>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:2>", "<empty>", "<b:false>"}, false, 6, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:3>", "<sample:8>", "<i:8>"}}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:4>", "<empty>", "<d:1.5>"}, false, 7, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:4>", "<sample:0>", "<sample:1>", "<i:4>"}}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:1>", "<sample:8>", "<s:>"}, false, 5, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:1>", "<sample:1>", "<i:1>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:4>", "<empty>", "<sample:5>", "<s:b21>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:3>", "<sample:3>", "<i:-262144>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "nop", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<sample:0>", "<i:-2147483648>", "<sample:3>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:4>", "<sample:2>", "<s:bc1>"}, false, 6, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:3>", "<sample:3>", "<i:0>"}, {"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:0>", "<sample:0>", "<i:5>"}}, 3), new String[][]{{"thenInject", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:0>", "<sample:3>", "<s:\u00e9a>"}, false, 7, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<sample:0>", "<sample:1>", "<i:2>"}}), new String[][]{{"thenInject", "", "6"}, {"thenInject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:4>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:4>", "<sample:2>", "<i:9>"}}, 1), new String[][]{{"thenInject", "", "4"}, {"thenInject", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:4>", "<sample:0>", "<i:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "<sample:2>"}}, 1), new String[][]{{"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:0>", "<sample:3>", "<d:2.01>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:4>", "<sample:2>", "<b:true>"}}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<empty>", "<sample:3>", "<s:b1>>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:4>", "<sample:4>", "<empty>", "<s:b1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<null>", "<s:kdy>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:6>", "<sample:0>", "<s:bb1>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:6>", "<sample:1>", "<sample:9>", "<i:-78>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<null>", "<empty>", "<s:\\cb>"}}, 2), new String[][]{{"thenInject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:3>", "<sample:8>", "<s:b>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<null>", "<sample:5>", "<sample:3>", "<d:2.42>"}}, 1), new String[][]{{"thenInject", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:3>", "<sample:8>", "<i:-65526>"}, false, 0, null, 3), new String[][]{{"thenInject", "", "5"}, {"thenInject", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "nop", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:4>", "<sample:2>", "<s:a>"}, false, 7, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:3>", "<sample:1>", "<s:]b>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:7>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<empty>", "<sample:0>", "<s:a>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:7>", "<sample:2>", "<s:_a>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:6>", "<null>", "<sample:2>", "<b:true>"}}, 2), new String[][]{{"thenInject", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:3>", "<sample:8>", "<i:9>"}, false, 3, new String[][]{{"org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<null>", "<sample:8>", "<b:true>"}, {"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:2>", "<sample:0>", "<i:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:6>", "<sample:9>", "<s:>"}, false, 7, new String[][]{}), new String[][]{{"thenInject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "nop", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "5"}, {"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:3>", "<empty>", "<s:bi>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<empty>", "<sample:3>", "<i:0>"}}, 3), new String[][]{{"thenInject", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "nop", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "6"}, {"thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:1>", "<sample:10>", "<s:a>"}, false, 2, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<sample:1>", "<sample:7>", "<i:-512>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:1>", "<empty>", "<i:0>"}}, 3), new String[][]{{"thenInject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.MockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:1>", "<sample:3>", "<s:b1>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:3>", "<sample:0>", "<i:0>"}, {"org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:1>", "<sample:3>", "<i:-1>"}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:3>", "<empty>", "<i:5>"}, false, 6, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<empty>", "<sample:0>", "<s:b2>"}}, 1), new String[][]{{"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:3>", "<sample:2>", "<i:1>"}, false, 3, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<null>", "<sample:3>", "<i:47>"}}, 1), new String[][]{{"thenInject", "", "4"}, {"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<sample:4>", "<s:>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:4>", "<sample:2>", "<s:>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:4>", "<sample:11>", "<s:a>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:2>", "<sample:2>", "<s:b2>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<sample:1>", "<sample:0>", "<s:b>"}}, 3), new String[][]{{"thenInject", "", "0"}, {"thenInject", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:0>", "<sample:3>", "<i:0>"}, false, 7, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<sample:2>", "<sample:3>", "<s:\n>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:4>", "<sample:4>", "<s:]P>"}}, 3), new String[][]{{"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:7>", "<sample:4>", "<i:-9>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:4>", "<empty>", "<s:5aa>"}, false, 4, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:6>", "<sample:1>", "<s:a>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:2>", "<null>", "<i:-6>"}, false, 1, new String[][]{}, 3), new String[][]{{"thenInject", "", "2"}, {"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:4>", "<empty>", "<null>"}, false, 4, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<null>", "<sample:0>", "<sample:0>"}}, 2), new String[][]{{"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:1>", "<empty>", "<s:+b2>"}, false, 5, new String[][]{}, 2), new String[][]{{"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:0>", "<null>", "<s:b>"}, false, 4, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:1>", "<sample:0>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:3>", "<sample:1>", "<i:2>"}, false, 4, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:1>", "<sample:2>", "<sample:0>"}}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<empty>", "<sample:0>", "<i:2>"}, false, 3, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<sample:0>", "<sample:0>", "<s:kPey>"}}, 2), new String[][]{{"thenInject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:5>", "<s:]]m>", "<sample:2>"}, {"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:2>", "<i:-2147483648>", "<empty>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "<sample:0>"}}, 2), new String[][]{{"process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<sample:2>", "<i:1>", "<sample:1>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<empty>", "<sample:2>", "<i:0>"}, false, 6, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<null>", "<sample:12>", "<null>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<sample:4>", "<sample:3>", "<sample:1>"}}, 3), new String[][]{{"thenInject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<null>", "<i:-30>", "<sample:0>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", "org.mockito.internal.configuration.injection.MockInjectionStrategy", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:1>", "<sample:2>", "<s:key^>"}, false, 2, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<null>", "<sample:2>", "<s:>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:1>", "<empty>", "<s:k?ey>"}}, 2), new String[][]{{"thenInject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:3>", "<sample:0>", "<sample:3>"}, false, 6, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:2>", "<sample:1>", "<d:0.39>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<sample:3>", "<empty>", "<i:10>"}}, 2), new String[][]{{"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<null>", "<sample:2>", "<sample:8>", "<s:>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:0>", "<sample:1>", "<i:-10>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:0>", "<null>", "<i:-2147483648>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<null>", "<empty>", "<sample:3>", "<s:a>"}}, 1), new String[][]{{"thenInject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<null>", "<i:2>", "<sample:3>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:3>", "<i:-1>", "<sample:1>"}, {"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:0>", "<s:b>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:4>", "<sample:0>", "<s:2>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:0>", "<sample:7>", "<i:-2147483648>"}}, 2), new String[][]{{"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:2>", "<sample:1>", "<i:-1>"}, false, 0, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<null>", "<sample:0>", "<sample:0>", "<s:]b>"}}, 1), new String[][]{{"thenInject", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:4>", "<sample:6>", "<null>"}, false, 7, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:7>", "<sample:1>", "<sample:8>", "<s:b1>"}, {"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:0>", "<sample:2>", "<sample:1>", "<s:]b>"}}, 1), new String[][]{{"thenInject", "", "2"}, {"thenInject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:3>", "<empty>", "<i:1>"}, false, 5, new String[][]{}, 1), new String[][]{{"thenInject", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:2>", "<sample:0>", "<i:0>"}, false, 2, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:5>", "<sample:6>", "<sample:4>", "<s:>"}}, 2), new String[][]{{"thenInject", "", "0"}, {"thenInject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:3>", "<sample:2>", "<s:aD>"}, false, 4, new String[][]{}, 2), new String[][]{{"thenInject", "", "3"}, {"thenInject", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", new String[]{"java.lang.reflect.Field", "java.lang.Object", "java.util.Set"}, new String[]{"<null>", "<s:bb[>", "<sample:1>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:1>", "<sample:13>", "<b:true>"}, false, 1, new String[][]{{"org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:1>", "<null>", "<sample:8>", "<s:o>"}}, 3), new String[][]{{"thenInject", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:0>", "<sample:6>", "<i:1>"}, false, 2, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:2>", "<null>", "<sample:0>", "<sample:2>"}}, 1), new String[][]{{"thenInject", "", "6"}, {"thenInject", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:0>", "<null>", "<s:>"}, false, 6, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<empty>", "<sample:3>", "<sample:0>", "<sample:0>"}}, 1), new String[][]{{"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<sample:1>", "<empty>", "<sample:3>", "<s:>"}, false, 4, new String[][]{}, 3), new String[][]{{"thenInject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:3>", "<sample:2>", "<s:eb1T>"}, false, 5, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:4>", "<sample:2>", "<sample:11>", "<s:>"}, {"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<sample:9>", "<sample:7>", "<i:2>"}}, 3), new String[][]{{"thenInject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:1>", "<sample:1>", "<i:0>"}, false, 4, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<sample:2>", "<sample:2>", "<d:-1.5>"}}, 3), new String[][]{{"thenInject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", new String[]{"java.util.Collection", "java.lang.reflect.Field", "java.util.List", "java.lang.Object"}, new String[]{"<empty>", "<sample:1>", "<null>", "<i:2>"}, false, 6, new String[][]{{"org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter", "filterCandidate", "java.util.Collection,java.lang.reflect.Field,java.util.List,java.lang.Object", "<sample:3>", "<null>", "<sample:1>", "<d:-1.5>"}}, 3), new String[][]{{"thenInject", "", "5"}, {"thenInject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<null>", "<s:b1>", "<sample:0>"}, {"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:0>", "<i:-69>", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "thenTry", new String[]{"org.mockito.internal.configuration.injection.MockInjectionStrategy"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "process", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:0>", "<i:2>", "<sample:0>"}, {"org.mockito.internal.configuration.injection.PropertyAndSetterInjection", "processInjection", "java.lang.reflect.Field,java.lang.Object,java.util.Set", "<sample:8>", "<s:[aF>", "<sample:4>"}}, 3);
  assertNull(actual);
 }
}
