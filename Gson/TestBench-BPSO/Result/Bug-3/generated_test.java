package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}), new String[][]{{"construct", "", "5"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:1>"}, false), new String[][]{{"construct", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Object", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:5>"}, false, 0, null, 1), new String[][]{{"construct", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}, {"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:4>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}}), new String[][]{{"construct", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=, key1=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=a, key1=0, key2=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:5>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:3>"}}), new String[][]{{"construct", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:3>"}, false), new String[][]{{"construct", "", "4"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 1), new String[][]{{"construct", "", "6"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}, {"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:4>"}, {"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 2), new String[][]{{"construct", "", "5"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=, key1=a, key2=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:4>"}}), new String[][]{{"construct", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:6>"}, {"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}}), new String[][]{{"construct", "", "5"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:0>"}}, 2), new String[][]{{"construct", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:4>"}}, 2), new String[][]{{"construct", "", "7"}, {"construct", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:6>"}, false, 0, null, 3), new String[][]{{"construct", "", "1"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:2>"}}, 3), new String[][]{{"construct", "", "2"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:5>"}}, 1), new String[][]{{"construct", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Object", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}, {"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:3>"}}, 2), new String[][]{{"construct", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Object", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:1>"}}, 1), new String[][]{{"construct", "", "6"}, {"construct", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 2), new String[][]{{"construct", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Object", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:10>"}, false, 0, null, 2), new String[][]{{"construct", "", "1"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 3), new String[][]{{"construct", "", "4"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:8>"}}, 3), new String[][]{{"construct", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Object", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 1), new String[][]{{"construct", "", "6"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}, {"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:3>"}}, 1), new String[][]{{"construct", "", "4"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=a, key1=0, key2=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:5>"}, {"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 3), new String[][]{{"construct", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}, 2), new String[][]{{"construct", "", "7"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:2>"}, {"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:6>"}, {"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:12>"}}, 1), new String[][]{{"construct", "", "7"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:9>"}, false, 0, null, 2), new String[][]{{"construct", "", "7"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 1), new String[][]{{"construct", "", "4"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}, {"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:8>"}}, 3), new String[][]{{"construct", "", "2"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 2), new String[][]{{"construct", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Object", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:5>"}}, 3), new String[][]{{"construct", "", "3"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:1>"}}, 3), new String[][]{{"construct", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}, {"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=, key1=a, key2=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 3), new String[][]{{"construct", "", "6"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}, 3), new String[][]{{"construct", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Object", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:12>"}, false, 6, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:6>"}}), new String[][]{{"construct", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=a, key1=0, key2=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:13>"}, false, 1, new String[][]{}, 1), new String[][]{{"construct", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:14>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:14>"}, false), new String[][]{{"construct", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:12>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}, {"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:17>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:5>"}}), new String[][]{{"construct", "", "7"}, {"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=, key1=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:7>"}}, 1), new String[][]{{"construct", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}, {"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=a, key1=0, key2=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:12>"}, false, 5, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 2), new String[][]{{"construct", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:5>"}, {"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=, key1=a, key2=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "get", new String[]{"com.google.gson.reflect.TypeToken"}, new String[]{"<sample:17>"}, false, 4, new String[][]{}), new String[][]{{"construct", "", "2"}, {"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "get", "com.google.gson.reflect.TypeToken", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=, key1=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=, key1=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.ConstructorConstructor", "com.google.gson.internal.ConstructorConstructor", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.internal.ConstructorConstructor", "toString", ""}, {"com.google.gson.internal.ConstructorConstructor", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=, key1=a, key2=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
}
