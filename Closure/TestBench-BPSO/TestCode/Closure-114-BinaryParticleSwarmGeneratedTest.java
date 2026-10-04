package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "getHtmlReport", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NameAnalyzer", "getHtmlReport", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;paddi...#456#1677388095", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "removeUnreferenced", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NameAnalyzer", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "removeUnreferenced", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NameAnalyzer", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:6>"}, {"com.google.javascript.jscomp.NameAnalyzer", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:8>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:8>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.NameAnalyzer", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:5>"}, {"com.google.javascript.jscomp.NameAnalyzer", "removeUnreferenced", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "getHtmlReport", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;paddi...#456#1677388095", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:5>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "removeUnreferenced", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.NameAnalyzer", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "getHtmlReport", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NameAnalyzer", "removeUnreferenced", ""}, {"com.google.javascript.jscomp.NameAnalyzer", "getHtmlReport", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;paddi...#456#1677388095", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "getHtmlReport", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NameAnalyzer", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;paddi...#560#-1713999555", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "getHtmlReport", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.NameAnalyzer", "getHtmlReport", ""}, {"com.google.javascript.jscomp.NameAnalyzer", "removeUnreferenced", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;paddi...#456#1677388095", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "removeUnreferenced", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:2>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:8>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.NameAnalyzer", "getHtmlReport", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.NameAnalyzer", "removeUnreferenced", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.NameAnalyzer", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
}
