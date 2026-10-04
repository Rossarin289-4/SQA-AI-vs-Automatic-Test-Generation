package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<empty>"}}), new String[][]{{"getDefaultAnswer", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"org.mockito.internal.util.MockUtil", "isMock", "java.lang.Object", "<null>"}, {"org.mockito.internal.util.MockUtil", "getMockName", "java.lang.Object", "<i:-2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:2>"}}, 3), new String[][]{{"getMockName", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", new String[]{"java.lang.Class[]"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "[1,2]"}, {"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:2>"}}), new String[][]{{"serializable", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "getMockName", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "getMockName", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.mockito.internal.util.MockUtil", "getMockName", "java.lang.Object", "<i:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "resetMock", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.mockito.internal.util.MockUtil", "getMockName", "java.lang.Object", "<s:`x>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "getMockHandler", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 2, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "isSerializable", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "a a"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "resetMock", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.mockito.internal.util.MockUtil", "createMock", "java.lang.Class,org.mockito.internal.creation.MockSettingsImpl", "<sample:0>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:4>", "<sample:4>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "resetMock", new String[]{"java.lang.Object"}, new String[]{"<i:33>"}, false, 1, new String[][]{{"org.mockito.internal.util.MockUtil", "isMock", "java.lang.Object", "<i:-58>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"1-12345678901234567"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "isMock", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.mockito.internal.util.MockUtil", "getMockName", "java.lang.Object", "<sample:1>"}, {"org.mockito.internal.util.MockUtil", "resetMock", "java.lang.Object", "<i:22>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}, 3), new String[][]{{"getSpiedInstance", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 2), new String[][]{{"extraInterfaces", "java.lang.Class[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getMockName", ""}}, 3), new String[][]{{"name", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:0>", "<sample:1>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getMockName", ""}}, 2), new String[][]{{"extraInterfaces", "java.lang.Class[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "isMock", new String[]{"java.lang.Object"}, new String[]{"<i:7>"}, false, 0, new String[][]{{"org.mockito.internal.util.MockUtil", "getMockHandler", "java.lang.Object", "<i:1>"}, {"org.mockito.internal.util.MockUtil", "isMock", "java.lang.Object", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:9>", "<sample:4>"}, false, 7, new String[][]{{"org.mockito.internal.util.MockUtil", "resetMock", "java.lang.Object", "<s:kee>"}, {"org.mockito.internal.util.MockUtil", "createMock", "java.lang.Class,org.mockito.internal.creation.MockSettingsImpl", "<sample:0>", "<null>"}}, 3), new String[][]{{"newInstance", "org.mockito.cglib.proxy.Callback", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "isMock", new String[]{"java.lang.Object"}, new String[]{"<s:,>"}, false, 0, new String[][]{{"org.mockito.internal.util.MockUtil", "getMockHandler", "java.lang.Object", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "isSerializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "0trueHello, World"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<empty>", "<sample:5>"}, false, 0, new String[][]{{"org.mockito.internal.util.MockUtil", "getMockName", "java.lang.Object", "<i:-61>"}, {"org.mockito.internal.util.MockUtil", "resetMock", "java.lang.Object", "<s:>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getMockName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "isSerializable", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 1), new String[][]{{"getDefaultAnswer", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"extraInterfaces", "java.lang.Class[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:4>"}}, 2), new String[][]{{"getExtraInterfaces", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "getMockHandler", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:3>", "<sample:3>"}, false, 5, new String[][]{{"org.mockito.internal.util.MockUtil", "createMock", "java.lang.Class,org.mockito.internal.creation.MockSettingsImpl", "<null>", "<sample:7>"}}, 2), new String[][]{{"newInstance", "java.lang.Class[],java.lang.Object[],org.mockito.cglib.proxy.Callback[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"null11.5"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:2>"}, {"org.mockito.internal.creation.MockSettingsImpl", "isSerializable", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", ""}}, 2), new String[][]{{"getMockName", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "getMockName", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.util.MockUtil", "createMock", "java.lang.Class,org.mockito.internal.creation.MockSettingsImpl", "<empty>", "<sample:5>"}, {"org.mockito.internal.util.MockUtil", "isMock", "java.lang.Object", "<i:0>"}}, 3), new String[][]{{"newInstance", "org.mockito.cglib.proxy.Callback[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "21474836484475297236197939568"}, {"org.mockito.internal.creation.MockSettingsImpl", "getMockName", ""}}, 1), new String[][]{{"spiedInstance", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, null, 2), new String[][]{{"setCallbacks", "org.mockito.cglib.proxy.Callback[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:3>"}}, 3), new String[][]{{"extraInterfaces", "java.lang.Class[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.util.MockUtil", "getMockName", "java.lang.Object", "<i:2>"}}, 3), new String[][]{{"newInstance", "java.lang.Class[],java.lang.Object[],org.mockito.cglib.proxy.Callback[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", new String[]{"java.lang.Class[]"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", new String[]{"java.lang.Class[]"}, new String[]{"<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:3>", "<sample:8>"}, false, 0, null, 3), new String[][]{{"newInstance", "org.mockito.cglib.proxy.Callback[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "isSerializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "isSerializable", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"0d"}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"1.1234767890123456"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "getMockHandler", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<i:-7>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:6>"}}, 2), new String[][]{{"getSpiedInstance", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", new String[]{"java.lang.Class[]"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:11>", "<null>"}, false, 4, new String[][]{{"org.mockito.internal.util.MockUtil", "isMock", "java.lang.Object", "<d:20.1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "isSerializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"org.mockito.internal.util.MockUtil", "getMockHandler", "java.lang.Object", "<i:-2>"}}, 2), new String[][]{{"newInstance", "org.mockito.cglib.proxy.Callback", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "0101.12345678901234567"}}, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<s:k5y>"}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "1/5e300"}, {"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}, 2), new String[][]{{"isSerializable", "", "7"}, {"getSpiedInstance", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", ":-1."}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 1, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 1), new String[][]{{"extraInterfaces", "java.lang.Class[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<s:b>"}, {"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<null>", "<sample:1>"}, false, 7, new String[][]{{"org.mockito.internal.util.MockUtil", "resetMock", "java.lang.Object", "<d:15.0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 5, new String[][]{}, 2), new String[][]{{"getMockName", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 2), new String[][]{{"getSpiedInstance", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:2>"}, {"org.mockito.internal.creation.MockSettingsImpl", "isSerializable", ""}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "isMock", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.mockito.internal.util.MockUtil", "createMock", "java.lang.Class,org.mockito.internal.creation.MockSettingsImpl", "<sample:8>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getMockName", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "isSerializable", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "getMockHandler", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 2, new String[][]{{"org.mockito.internal.util.MockUtil", "getMockHandler", "java.lang.Object", "<d:2.12>"}, {"org.mockito.internal.util.MockUtil", "createMock", "java.lang.Class,org.mockito.internal.creation.MockSettingsImpl", "<sample:2>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "resetMock", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", new String[]{"java.lang.Class[]"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "getMockName", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.mockito.internal.util.MockUtil", "getMockName", "java.lang.Object", "<s:key>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.misusing.NotAMockException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:0>"}}), new String[][]{{"getMockName", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<i:3>"}, false), new String[][]{{"extraInterfaces", "java.lang.Class[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<i:8>"}, false, 3, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<s:b>"}}), new String[][]{{"getSpiedInstance", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:6>", "<sample:10>"}, false, 7, new String[][]{{"org.mockito.internal.util.MockUtil", "getMockName", "java.lang.Object", "<i:-1>"}}), new String[][]{{"contains", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "isMock", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 6, new String[][]{{"org.mockito.internal.util.MockUtil", "getMockName", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:8>", "<sample:3>"}, false, 4, new String[][]{{"org.mockito.internal.util.MockUtil", "resetMock", "java.lang.Object", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}), new String[][]{{"getMockName", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:0>"}}), new String[][]{{"isSurrogate", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:2>", "<sample:3>"}, false, 3, new String[][]{{"org.mockito.internal.util.MockUtil", "getMockName", "java.lang.Object", "<s:>"}, {"org.mockito.internal.util.MockUtil", "getMockName", "java.lang.Object", "<i:0>"}}), new String[][]{{"newInstance", "org.mockito.cglib.proxy.Callback[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 1, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}), new String[][]{{"getExtraInterfaces", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "--1"}}), new String[][]{{"getExtraInterfaces", "", "3"}, {"getSpiedInstance", "", "4"}, {"isSerializable", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 5, new String[][]{}), new String[][]{{"isSerializable", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", new String[]{"java.lang.Class[]"}, new String[]{"<sample:5>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "1.13345678901235567"}}), new String[][]{{"getSpiedInstance", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 1, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "isSerializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "{\"a\":[1}"}}), new String[][]{{"serializable", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:10>"}, {"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:1>", "<sample:7>"}, false, 4, new String[][]{{"org.mockito.internal.util.MockUtil", "createMock", "java.lang.Class,org.mockito.internal.creation.MockSettingsImpl", "<null>", "<null>"}, {"org.mockito.internal.util.MockUtil", "isMock", "java.lang.Object", "<i:0>"}}), new String[][]{{"newInstance", "org.mockito.cglib.proxy.Callback", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:11>"}}), new String[][]{{"getSpiedInstance", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", " .5"}}), new String[][]{{"getSpiedInstance", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:5>"}, {"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<null>"}}), new String[][]{{"isSerializable", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:10>", "<sample:10>"}, false, 0, new String[][]{{"org.mockito.internal.util.MockUtil", "resetMock", "java.lang.Object", "<i:-21>"}, {"org.mockito.internal.util.MockUtil", "createMock", "java.lang.Class,org.mockito.internal.creation.MockSettingsImpl", "<sample:0>", "<sample:3>"}}), new String[][]{{"newInstance", "org.mockito.cglib.proxy.Callback[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<i:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<s:a9>"}}), new String[][]{{"extraInterfaces", "java.lang.Class[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"{1.5"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "isSerializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "getMockName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "1-5f"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<s:h>"}, false), new String[][]{{"getSpiedInstance", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("h", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<s:kLey>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "isSerializable", ""}}), new String[][]{{"getSpiedInstance", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kLey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "isSerializable", ""}}), new String[][]{{"spiedInstance", "java.lang.Object", "7"}, {"extraInterfaces", "java.lang.Class[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<sample:0>"}, {"org.mockito.internal.creation.MockSettingsImpl", "isSerializable", ""}}), new String[][]{{"getSpiedInstance", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:5>"}}), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:2>"}}), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "isSerializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:8>"}}, 2), new String[][]{{"getMockName", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string[] {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:4>"}}, 2), new String[][]{{"extraInterfaces", "java.lang.Class[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getMockName", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<d:1.5>"}}, 3), new String[][]{{"getMockName", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"a"}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "getMockName", ""}}), new String[][]{{"isSerializable", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}, 3), new String[][]{{"serializable", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"a1.5d"}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<s:>"}}, 1), new String[][]{{"getDefaultAnswer", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:7>"}, {"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "J"}}), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"0f"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "isSerializable", ""}}, 2), new String[][]{{"serializable", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:6>"}, {"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:3>"}}, 2), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"isSerializable", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:3>"}, {"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:3>"}}, 3), new String[][]{{"getDefaultAnswer", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, null, 3), new String[][]{{"isSerializable", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"a,b7,c"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<i:-2>"}}), new String[][]{{"getMockName", "", "4"}, {"isSurrogate", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<d:4.24>"}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}, 3), new String[][]{{"getExtraInterfaces", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}), new String[][]{{"extraInterfaces", "java.lang.Class[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.mockito.internal.util.MockUtil", "isMock", "java.lang.Object", "<i:-2>"}, {"org.mockito.internal.util.MockUtil", "createMock", "java.lang.Class,org.mockito.internal.creation.MockSettingsImpl", "<sample:7>", "<sample:6>"}}, 1), new String[][]{{"newInstance", "org.mockito.cglib.proxy.Callback", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:3>"}}, 3), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:1>", "<sample:8>"}, false, 3, new String[][]{{"org.mockito.internal.util.MockUtil", "isMock", "java.lang.Object", "<i:-1>"}, {"org.mockito.internal.util.MockUtil", "resetMock", "java.lang.Object", "<b:true>"}}, 1), new String[][]{{"newInstance", "org.mockito.cglib.proxy.Callback[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}, 3), new String[][]{{"getDefaultAnswer", "", "6"}, {"isSerializable", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:1>"}}), new String[][]{{"getDefaultAnswer", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"+11.1234567"}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getMockName", ""}}, 2), new String[][]{{"getSpiedInstance", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:5>"}}, 2), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"1E-5Title"}, false, 2, new String[][]{}), new String[][]{{"getMockName", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"0x1234567\r89"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:7>"}}, 3), new String[][]{{"initiateMockName", "java.lang.Class", "2"}, {"getDefaultAnswer", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.util.MockUtil", "org.mockito.internal.util.MockUtil", "createMock", new String[]{"java.lang.Class", "org.mockito.internal.creation.MockSettingsImpl"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"org.mockito.internal.util.MockUtil", "getMockHandler", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:8>"}}, 2), new String[][]{{"getDefaultAnswer", "", "2"}, {"answer", "org.mockito.invocation.InvocationOnMock", "7"}, {"answer", "org.mockito.invocation.InvocationOnMock", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<s:ley>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ley", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "isSerializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<i:4>"}}), new String[][]{{"getSpiedInstance", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "isSerializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<s:b>"}, {"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getSpiedInstance", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", new String[]{"java.lang.Class[]"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[interface java.lang.Comparable]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", new String[]{"java.lang.Class[]"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", ""}}), new String[][]{{"getSpiedInstance", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false), new String[][]{{"initiateMockName", "java.lang.Class", "1"}, {"getMockName", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("genericSub {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:3>"}, {"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "1"}, {"answer", "org.mockito.invocation.InvocationOnMock", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", new String[]{"java.lang.Class[]"}, new String[]{"<sample:9>"}, false, 6, new String[][]{}, 3), new String[][]{{"defaultAnswer", "org.mockito.stubbing.Answer", "7"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}}, 2), new String[][]{{"initiateMockName", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "I2147483648"}, {"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("I2147483648 {isSurrogate=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("genericBase {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"isSurrogate", "", "7"}, {"isSurrogate", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}, {"org.mockito.internal.creation.MockSettingsImpl", "isSerializable", ""}}, 1), new String[][]{{"serializable", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:3>"}, {"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}}), new String[][]{{"getSpiedInstance", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getMockName", ""}}, 2), new String[][]{{"getSpiedInstance", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:0>"}, {"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:3>"}}, 2), new String[][]{{"getMockName", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("genericLeaf {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[interface java.lang.Comparable]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}, {"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}}), new String[][]{{"isSerializable", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:1>"}, {"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getMockName", ""}}, 3), new String[][]{{"extraInterfaces", "java.lang.Class[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<d:2.12>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "0xFFFFFFFF2020-01-01"}, {"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:1>"}}, 1), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "6"}, {"answer", "org.mockito.invocation.InvocationOnMock", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}, {"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", new String[]{"java.lang.Class[]"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:3>"}}), new String[][]{{"isSerializable", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{".5Hello, World"}, false, 0, null, 1), new String[][]{{"isSerializable", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:1>"}}), new String[][]{{"getDefaultAnswer", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}, {"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}), new String[][]{{"getDefaultAnswer", "", "2"}, {"spiedInstance", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "Hllo, World"}}, 3), new String[][]{{"getSpiedInstance", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:6>"}, {"org.mockito.internal.creation.MockSettingsImpl", "isSerializable", ""}}), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:8>"}, {"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}}), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:4>"}}, 3), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<i:-32768>"}}, 1), new String[][]{{"isSerializable", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"+1\""}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}), new String[][]{{"getDefaultAnswer", "", "4"}, {"answer", "org.mockito.invocation.InvocationOnMock", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<i:-4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getMockName", "", "0"}, {"isSurrogate", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:2>"}}), new String[][]{{"getMockName", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"1\n"}, false, 7, new String[][]{}, 3), new String[][]{{"getMockName", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"1.5e030"}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:0>"}, {"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<sample:0>"}}), new String[][]{{"getSpiedInstance", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}), new String[][]{{"getDefaultAnswer", "", "3"}, {"answer", "org.mockito.invocation.InvocationOnMock", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<sample:1>"}, {"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<s:aH>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:3>"}}, 3), new String[][]{{"getExtraInterfaces", "", "2"}, {"spiedInstance", "java.lang.Object", "4"}, {"getMockName", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("genericLeaf {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:0>"}}, 1), new String[][]{{"getDefaultAnswer", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567-1"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 1), new String[][]{{"extraInterfaces", "java.lang.Class[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:5>"}, {"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"0xFFFiFFFF"}, false, 0, null, 1), new String[][]{{"serializable", "", "0"}, {"getSpiedInstance", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:7>"}}, 1), new String[][]{{"extraInterfaces", "java.lang.Class[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", ""}}, 2), new String[][]{{"isSurrogate", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"1.123456780"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:2>"}}), new String[][]{{"getMockName", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("genericBase {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<i:-19>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:8>"}}, 3), new String[][]{{"getMockName", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:3>"}}, 2), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "5"}, {"answer", "org.mockito.invocation.InvocationOnMock", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:2>"}}, 3), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 2), new String[][]{{"getDefaultAnswer", "", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"isSurrogate", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:4>"}}), new String[][]{{"getDefaultAnswer", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"1.12335678901234567"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<s:a>"}}, 3), new String[][]{{"getExtraInterfaces", "", "5"}, {"extraInterfaces", "java.lang.Class[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.mockito.exceptions.base.MockitoException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"2.5d"}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}, 3), new String[][]{{"getDefaultAnswer", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<s:key>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "PT1H12:30:45"}}, 2), new String[][]{{"isSurrogate", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", new String[]{"java.lang.Class[]"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:5>"}}), new String[][]{{"getExtraInterfaces", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[interface java.lang.Comparable]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "isSerializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}, {"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}, 1), new String[][]{{"getMockName", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 1), new String[][]{{"isSerializable", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<b:true>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("genericLeaf {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "isSerializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:5>"}, {"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "5I."}}, 3), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "4"}, {"answer", "org.mockito.invocation.InvocationOnMock", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"Title\u00e9"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "2.12345678{\"a\":1}"}, {"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<i:-1073741824>"}}, 2), new String[][]{{"getMockName", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 3, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "5.\u00e9"}}, 3), new String[][]{{"getSpiedInstance", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<i:-2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "isSerializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 3), new String[][]{{"spiedInstance", "java.lang.Object", "1"}, {"isSerializable", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:1>"}, {"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:0>"}}, 2), new String[][]{{"getExtraInterfaces", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", new String[]{"java.lang.Class[]"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 5, new String[][]{}, 1), new String[][]{{"getDefaultAnswer", "", "4"}, {"isSerializable", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, null, 2), new String[][]{{"getMockName", "", "2"}, {"isSurrogate", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getMockName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("genericBase {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"1E-5 5"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "isSerializable", ""}}, 2), new String[][]{{"isSerializable", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", new String[]{"java.lang.Class[]"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}), new String[][]{{"getMockName", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<i:-25>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<i:-1>"}, {"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}, 1), new String[][]{{"getMockName", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[interface java.lang.Comparable]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"aaaaaaa6aaaaaaaaaaaaaaaaaaaaaaa"}, false, 6, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<sample:3>"}, {"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 2), new String[][]{{"initiateMockName", "java.lang.Class", "4"}, {"getSpiedInstance", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", "java.lang.Class", "<sample:1>"}}, 3), new String[][]{{"getMockName", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("genericSub {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:4>"}, {"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:8>"}}, 3), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:7>"}, {"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "numlnull"}}, 2), new String[][]{{"getDefaultAnswer", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<i:116>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getSpiedInstance", ""}}, 1), new String[][]{{"spiedInstance", "java.lang.Object", "2"}, {"getSpiedInstance", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}}, 1), new String[][]{{"getMockName", "", "3"}, {"isSurrogate", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:2>"}, {"org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", ""}}, 1), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getMockName", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:0>"}}, 3), new String[][]{{"getDefaultAnswer", "", "6"}, {"answer", "org.mockito.invocation.InvocationOnMock", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 7, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.mockito.internal.creation.MockSettingsImpl", actual.getClass().getName());
  assertEquals("{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"Tabc"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "isSerializable", ""}}, 1), new String[][]{{"getMockName", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.mockito.internal.util.MockName", actual.getClass().getName());
  assertEquals("string {isSurrogate=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:0>"}}, 2), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 3), new String[][]{{"getDefaultAnswer", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "name", new String[]{"java.lang.String"}, new String[]{"tue"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 3), new String[][]{{"getMockName", "", "4"}, {"isSurrogate", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "initiateMockName", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:2>"}, {"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getExtraInterfaces", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", "java.lang.Class[]", "<sample:9>"}, {"org.mockito.internal.creation.MockSettingsImpl", "name", "java.lang.String", "2020-02-30T25:61:61a,b,c"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Class;", actual.getClass().getName());
  assertEquals("[interface java.lang.Comparable]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", new String[]{"java.lang.Class[]"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<b:true>"}}), new String[][]{{"getSpiedInstance", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=[interface java.lang.Comparable], isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", new String[]{"org.mockito.stubbing.Answer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "serializable", ""}}, 1), new String[][]{{"getDefaultAnswer", "", "4"}, {"answer", "org.mockito.invocation.InvocationOnMock", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "serializable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "getMockName", ""}, {"org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", "java.lang.Object", "<sample:0>"}}, 1), new String[][]{{"getSpiedInstance", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.mockito.internal.creation.MockSettingsImpl", "org.mockito.internal.creation.MockSettingsImpl", "getDefaultAnswer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.mockito.internal.creation.MockSettingsImpl", "defaultAnswer", "org.mockito.stubbing.Answer", "<sample:4>"}}, 2), new String[][]{{"answer", "org.mockito.invocation.InvocationOnMock", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getExtraInterfaces=null, isSerializable=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
