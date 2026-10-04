package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:1>", "<null>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:5>", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:2>", "<sample:5>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:2>", "<sample:5>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:2>", "<sample:5>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<null>", "<sample:1>", "<sample:6>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:2>", "<sample:5>", "<sample:4>"}, false, 1, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<null>", "<sample:1>", "<sample:6>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:2>", "<sample:1>", "<sample:6>"}, false, 1, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<null>", "<sample:1>", "<sample:6>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:4>", "<sample:1>", "<sample:6>"}, false, 1, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<null>", "<sample:1>", "<sample:6>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<null>"}}), new String[][]{{"getWidth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:4>", "<sample:1>", "<sample:6>"}, false, 1, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<null>", "<sample:3>", "<sample:6>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:7>"}}, 2), new String[][]{{"getWidth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:7>", "<sample:1>", "<sample:6>"}, false, 1, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<null>", "<sample:3>", "<sample:6>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<null>"}}, 3), new String[][]{{"getWidth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:6>", "<sample:6>", "<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:0>", "<sample:0>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "clear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:3>", "<sample:2>"}, false, 13, new String[][]{{"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<null>", "<sample:3>", "<sample:6>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "add", new String[]{"org.jfree.chart.block.Block", "java.lang.Object"}, new String[]{"<sample:1>", "<s:key>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFF", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:0>", "<sample:3>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:6>", "<sample:0>", "<sample:0>"}, false, 5, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:6>", "<sample:0>", "<sample:2>"}, false, 5, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=Infinity] {getHeight=Infinity, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:6>", "<sample:1>", "<sample:2>"}, false, 5, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<null>"}}), new String[][]{{"getWidth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:0>", "<sample:0>"}, false, 11, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:1>", "<sample:0>"}}), new String[][]{{"getWidth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:0>", "<null>"}, false, 11, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:1>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:2>", "<sample:4>", "Infinity"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<null>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=Infinity, height=0.0] {getHeight=0.0, getWidth=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:2>", "<sample:4>", "Infinity"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:4>", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=Infinity, height=0.0] {getHeight=0.0, getWidth=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:4>", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:6>", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:1>", "<sample:6>", "<null>"}}), new String[][]{{"getHeight", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:7>", "<sample:5>", "<sample:4>"}, false, 7, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:2>", "<null>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:4>", "<sample:1>"}}), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=-1.0] {getHeight=-1.0, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:5>", "<sample:4>"}, false, 7, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:2>", "<null>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:4>", "<sample:1>"}}, 2), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=-1.0] {getHeight=-1.0, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:5>", "<sample:6>"}, false, 7, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:2>", "<null>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:4>", "<sample:1>"}}, 2), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:6>", "<sample:0>"}, false, 7, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:2>", "<null>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:4>", "<sample:1>"}}, 2), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<null>", "<sample:4>", "<sample:0>"}, false, 7, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:2>", "<null>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:4>", "<sample:1>"}}, 2), new String[][]{{"clone", "", "5"}, {"getHeight", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:6>", "<sample:7>", "<sample:5>", "<sample:5>"}, false), new String[][]{{"clone", "", "1"}, {"clone", "", "3"}, {"setWidth", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=0.0] {getHeight=0.0, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:3>", "<sample:5>", "506071142274883745"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=5.0607114227488378E17, height=0.0] {getHeight=0.0, getWidth=5.0607114227488378E17}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:3>", "<sample:5>", "506071142274883745"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=5.0607114227488378E17, height=0.0] {getHeight=0.0, getWidth=5.0607114227488378E17}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:3>", "<sample:5>", "1.01214228454976755E18"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.01214228454976755E18, height=0.0] {getHeight=0.0, getWidth=1.01214228454976755E18}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:6>", "<sample:5>", "-1.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:2>", "<sample:3>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:3>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:3>", "<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:3>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:4>", "<sample:3>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:4>", "<sample:7>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:7>", "<sample:5>", "0.0"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:8>", "<sample:5>", "2.8000000000000003"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=2.8000000000000003, height=0.0] {getHeight=0.0, getWidth=2.8000000000000003}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:7>", "<sample:5>", "2.8000000000000003"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=2.8000000000000003, height=0.0] {getHeight=0.0, getWidth=2.8000000000000003}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:1>", "<sample:5>", "1.7976931348623157E308"}, false, 7, new String[][]{{"org.jfree.chart.block.BorderArrangement", "clear", ""}}), new String[][]{{"setWidth", "double", "3"}, {"getWidth", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:4>", "<sample:5>", "1.7976931348623157E308"}, false, 7, new String[][]{{"org.jfree.chart.block.BorderArrangement", "clear", ""}}), new String[][]{{"setWidth", "double", "3"}, {"getWidth", "", "7"}, {"setHeight", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.0, height=-1.0] {getHeight=-1.0, getWidth=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:3>", "<sample:4>", "-1.7976931348623157E308"}, false, 9, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:5>", "<sample:7>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "clear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<null>", "<sample:3>", "0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:0>", "<sample:4>", "1.7976931348623155E308"}, false, 8, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:7>", "<sample:7>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<null>", "<sample:5>", "<sample:5>"}}, 1), new String[][]{{"clone", "", "3"}, {"getWidth", "", "2"}, {"setHeight", "double", "1"}, {"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.7976931348623155E308, height=-1.0] {getHeight=-1.0, getWidth=1.7976931348623155E308}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:2>", "<sample:5>", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<null>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:0>", "<sample:6>", "3.595386269724631E307"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:7>", "<sample:6>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:7>", "<null>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:1>", "<sample:0>", "<sample:2>"}}, 1), new String[][]{{"clone", "", "3"}, {"getWidth", "", "2"}, {"setHeight", "double", "1"}, {"setHeight", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=3.595386269724631E307, height=1.0] {getHeight=1.0, getWidth=3.595386269724631E307}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:1>", "<sample:6>", "3.595386269724631E307"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:7>", "<sample:6>", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:7>", "<null>", "<sample:3>"}}, 1), new String[][]{{"clone", "", "3"}, {"setWidth", "double", "2"}, {"setHeight", "double", "1"}, {"setHeight", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=1.0] {getHeight=1.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:1>", "<null>", "3.595386269724631E307"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:7>", "<sample:5>", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:4>", "<null>", "<sample:2>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:7>", "<null>", "<sample:3>"}}, 1), new String[][]{{"clone", "", "3"}, {"getWidth", "", "2"}, {"setHeight", "double", "1"}, {"getHeight", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:3>", "<sample:7>", "<sample:3>"}, false), new String[][]{{"getHeight", "", "6"}, {"setWidth", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.0, height=0.0] {getHeight=0.0, getWidth=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:1>", "<sample:6>", "-1.4381545078898524E308"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:2>", "<sample:2>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:7>", "<sample:5>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:6>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:4>", "<sample:3>", "1.7976931348623157E308"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<s:key>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:7>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:7>", "<sample:5>", "<sample:3>"}}, 3), new String[][]{{"setHeight", "double", "7"}, {"getHeight", "", "0"}, {"setHeight", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.7976931348623157E308, height=1.0] {getHeight=1.0, getWidth=1.7976931348623157E308}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:3>", "<sample:3>", "1.7976931348623157E308"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<s:key>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:7>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:7>", "<sample:5>", "<sample:3>"}}, 3), new String[][]{{"setHeight", "double", "7"}, {"getHeight", "", "0"}, {"setHeight", "double", "3"}, {"setWidth", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=1.0] {getHeight=1.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:3>", "<sample:6>", "Infinity"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:0>", "<null>", "<sample:4>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:3>", "<null>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:7>", "<sample:5>", "<sample:4>"}}, 3), new String[][]{{"setHeight", "double", "1"}, {"getHeight", "", "0"}, {"setHeight", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=Infinity, height=1.0] {getHeight=1.0, getWidth=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:3>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:7>", "<sample:0>", "<sample:5>"}, false, 11, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:4>", "<sample:1>", "<sample:5>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:6>", "<sample:0>", "<null>"}, false, 11, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:4>", "<sample:1>", "<sample:5>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:7>", "<null>", "<sample:7>", "<sample:6>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:7>", "<null>", "506071142274883745"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:6>", "<sample:2>", "<sample:1>"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFF", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:6>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:4>", "<sample:4>", "<sample:5>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:7>", "<null>", "506071142274883745"}}, 2), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:6>", "<sample:3>", "<sample:1>"}, false, 9, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:6>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:4>", "<sample:4>", "<sample:5>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:3>", "<null>", "<sample:1>", "<sample:1>"}}, 2), new String[][]{{"clone", "", "1"}, {"clone", "", "6"}, {"setWidth", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:6>", "<sample:3>", "<sample:1>"}, false, 9, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:6>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:4>", "<sample:4>", "<sample:5>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:3>", "<null>", "<sample:1>", "<sample:1>"}}), new String[][]{{"clone", "", "1"}, {"clone", "", "6"}, {"setWidth", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:7>", "<sample:6>", "<sample:1>"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:6>", "<null>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:4>", "<sample:4>", "<sample:5>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:3>", "<null>", "<sample:1>", "<sample:1>"}}, 1), new String[][]{{"clone", "", "1"}, {"clone", "", "6"}, {"setWidth", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:7>", "<sample:6>", "<sample:4>"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:6>", "<null>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:4>", "<sample:4>", "<sample:5>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:3>", "<null>", "<sample:1>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:6>", "<sample:1>"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:6>", "<null>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:4>", "<sample:4>", "<sample:5>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:3>", "<null>", "<sample:1>", "<sample:1>"}}, 1), new String[][]{{"clone", "", "1"}, {"clone", "", "6"}, {"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:6>", "<sample:5>"}, false), new String[][]{{"getWidth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:0>", "<sample:2>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:7>", "<null>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:4>", "<sample:4>", "<sample:6>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<null>", "<sample:6>"}, false, 9, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<null>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "clear", ""}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:2>", "<sample:6>", "<sample:4>", "<sample:3>"}}, 3), new String[][]{{"setWidth", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:1>", "<null>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a\r>"}, false, 6, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:5>", "<sample:4>", "Infinity"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:1>", "<sample:3>", "<sample:4>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:7>", "<sample:6>", "<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<s:a>"}}, 2), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:3>", "<sample:2>"}, false, 8, new String[][]{}, 2), new String[][]{{"getWidth", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:1>", "<null>", "<sample:5>"}, false, 12, new String[][]{}, 2), new String[][]{{"setWidth", "double", "6"}, {"setWidth", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=Infinity, height=0.0] {getHeight=0.0, getWidth=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:0>", "<sample:6>", "<sample:5>", "<null>"}, false, 0, null, 1), new String[][]{{"getWidth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:7>", "<sample:6>", "<sample:6>"}, false, 1, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:3>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "clear", ""}}), new String[][]{{"setWidth", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=Infinity, height=0.0] {getHeight=0.0, getWidth=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:7>", "<sample:5>", "<sample:2>"}, false, 2, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:0>", "<sample:7>", "<sample:2>", "<sample:1>"}}, 3), new String[][]{{"getWidth", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:6>", "<sample:5>", "<sample:10>"}, false, 11, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:0>", "<sample:7>", "<sample:2>", "<sample:1>"}}, 3), new String[][]{{"getWidth", "", "0"}, {"getWidth", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:7>", "<sample:3>", "<sample:7>"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:0>", "<sample:2>"}}, 3), new String[][]{{"getWidth", "", "5"}, {"getWidth", "", "1"}, {"getHeight", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:1>", "<sample:2>", "<sample:1>"}, false, 0, null, 2), new String[][]{{"setWidth", "double", "3"}, {"clone", "", "5"}, {"setHeight", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.0, height=0.0] {getHeight=0.0, getWidth=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<null>", "<sample:6>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:5>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:8>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:8>", "<sample:7>"}}), new String[][]{{"getHeight", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:9>", "<sample:5>", "<sample:3>"}, false, 5, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<null>", "<sample:5>", "<sample:3>"}}, 1), new String[][]{{"setWidth", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=0.0] {getHeight=0.0, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:6>", "<sample:5>", "<null>"}, false, 5, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:3>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<null>", "<sample:6>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:9>", "<sample:5>", "<sample:1>"}, false, 5, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<null>", "<sample:6>", "<sample:3>"}}, 1), new String[][]{{"setWidth", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.0, height=0.0] {getHeight=0.0, getWidth=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:4>", "<sample:7>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:4>", "<sample:7>", "<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:4>", "<sample:7>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:7>", "<sample:4>", "<sample:9>"}, false, 2, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:6>", "<sample:6>", "Infinity"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:4>", "<sample:5>", "-1.7976931348623157E308"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:0>", "<sample:2>", "<sample:2>"}}), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=-1.0] {getHeight=-1.0, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:2>", "<sample:7>", "<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<s:1C>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<null>", "<null>", "<sample:2>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "clear", ""}}, 1), new String[][]{{"getHeight", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:7>", "<sample:7>", "<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:1>", "<sample:2>", "<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<s:1C>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<null>", "<sample:0>", "<sample:2>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:1>", "<sample:0>", "1.7976931348623157E308"}}), new String[][]{{"setWidth", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=0.0] {getHeight=0.0, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:3>", "<sample:2>", "<sample:8>"}, false, 9, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:1>", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:3>", "<sample:0>", "1.7976931348623155E308"}}, 1), new String[][]{{"setWidth", "double", "7"}, {"setHeight", "double", "1"}, {"getHeight", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:6>", "<sample:1>"}, false, 15, new String[][]{{"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<i:-2147483648>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:6>", "<sample:4>", "<sample:1>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:7>", "<s:b>"}}), new String[][]{{"setWidth", "double", "7"}, {"setHeight", "double", "4"}, {"getHeight", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:5>", "<sample:1>"}, false, 17, new String[][]{{"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<i:-2147483648>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:6>", "<sample:4>", "<sample:1>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:7>", "<s:b>"}}, 2), new String[][]{{"setWidth", "double", "7"}, {"setHeight", "double", "4"}, {"getHeight", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:2>", "<b:true>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:7>", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:0>", "<sample:2>", "<sample:7>", "<sample:4>"}, false), new String[][]{{"getHeight", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:0>", "<sample:2>", "<null>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:5>", "<sample:5>", "<sample:2>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:3>", "<sample:2>", "<sample:3>"}, false, 12, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:11>", "<sample:5>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:6>", "<sample:6>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:0>", "<sample:3>", "<sample:2>", "<sample:6>"}}, 1), new String[][]{{"setWidth", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=Infinity, height=0.0] {getHeight=0.0, getWidth=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:3>", "<sample:2>", "<sample:3>"}, false, 12, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:11>", "<sample:5>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:6>", "<sample:6>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:0>", "<sample:3>", "<sample:2>", "<sample:6>"}}), new String[][]{{"setWidth", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=Infinity, height=0.0] {getHeight=0.0, getWidth=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<null>", "<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFF", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:2>", "<sample:0>", "<null>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:3>", "<sample:3>", "<sample:6>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:1>", "<sample:1>"}, false, 1, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:7>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:0>", "<sample:3>", "<sample:1>", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:4>", "<i:0>"}}, 2), new String[][]{{"setWidth", "double", "2"}, {"setWidth", "double", "0"}, {"setWidth", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=0.0] {getHeight=0.0, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:1>", "<sample:3>"}, false, 12, new String[][]{{"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:3>", "<null>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:7>", "<sample:6>"}}), new String[][]{{"setHeight", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=-1.0] {getHeight=-1.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:2>", "<sample:3>"}, false, 13, new String[][]{{"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:6>", "<null>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:7>", "<sample:6>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:3>", "<sample:6>", "<sample:0>", "<sample:1>"}}), new String[][]{{"setHeight", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=-1.0] {getHeight=-1.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:6>", "<null>", "<sample:3>"}, false, 13, new String[][]{{"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:1>", "<null>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:7>", "<sample:6>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:3>", "<sample:6>", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:4>", "<sample:4>", "<sample:3>"}, false, 14, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:7>", "<sample:3>", "Infinity"}, {"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<i:0>"}}), new String[][]{{"setWidth", "double", "7"}, {"setWidth", "double", "6"}, {"getWidth", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:3>", "<sample:1>", "<sample:7>", "<sample:7>"}, false, 9, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:7>", "<sample:4>", "NaN"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:5>", "<sample:2>", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:3>", "<sample:1>", "<null>", "<sample:7>"}, false, 9, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:7>", "<sample:4>", "NaN"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:5>", "<sample:2>", "NaN"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:3>", "<sample:6>", "<sample:0>", "<null>"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:4>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:7>", "<sample:4>", "NaN"}}, 3), new String[][]{{"setWidth", "double", "2"}, {"getWidth", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:2>", "<sample:2>", "1.0"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.0, height=0.0] {getHeight=0.0, getWidth=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:7>", "<sample:0>", "<sample:7>", "<sample:9>"}, false, 12, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:5>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:2>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFF", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:4>", "<sample:4>"}}), new String[][]{{"clone", "", "1"}, {"setWidth", "double", "0"}, {"getWidth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:7>", "<sample:0>", "<sample:7>", "<sample:9>"}, false, 12, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:5>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:2>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFF", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:4>", "<sample:4>"}}, 2), new String[][]{{"clone", "", "1"}, {"setWidth", "double", "0"}, {"getWidth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:7>", "<sample:5>", "<sample:10>", "<sample:8>"}, false, 12, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:5>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:2>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFF", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:7>", "<sample:4>"}}, 2), new String[][]{{"clone", "", "1"}, {"getHeight", "", "0"}, {"getWidth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:7>", "<null>", "<sample:4>", "<sample:8>"}, false, 12, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:5>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:2>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFF", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:7>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:7>", "<sample:5>", "<sample:4>", "<sample:4>"}, false, 12, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:5>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:2>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFF", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:7>", "<sample:4>"}}, 2), new String[][]{{"setWidth", "double", "1"}, {"getHeight", "", "0"}, {"getWidth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:6>", "<sample:3>", "<sample:8>", "<sample:3>"}, false, 12, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:5>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:2>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFF", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:5>", "<sample:7>"}}, 2), new String[][]{{"setWidth", "double", "1"}, {"getHeight", "", "5"}, {"setWidth", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:2>", "<sample:2>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:0>", "<sample:2>", "<sample:0>", "<sample:5>"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:4>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:4>", "<sample:7>", "<sample:0>", "<sample:1>"}}), new String[][]{{"getHeight", "", "3"}, {"getWidth", "", "3"}, {"setWidth", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<i:2>"}}), new String[][]{{"setWidth", "double", "6"}, {"setHeight", "double", "0"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=-Infinity] {getHeight=-Infinity, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "add", new String[]{"org.jfree.chart.block.Block", "java.lang.Object"}, new String[]{"<sample:0>", "<null>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "clear", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:7>", "<sample:0>", "<sample:6>", "<sample:1>"}, false, 11, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:2>", "<sample:5>", "<sample:4>", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:5>", "<sample:3>", "<sample:6>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:7>", "<null>"}}, 3), new String[][]{{"getWidth", "", "4"}, {"getWidth", "", "3"}, {"clone", "", "5"}, {"setWidth", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:1>", "<sample:4>", "<sample:7>", "<sample:3>"}, false, 4, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:1>", "<sample:5>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:1>", "<null>"}}, 1), new String[][]{{"setWidth", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=0.0] {getHeight=0.0, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:1>", "<sample:4>", "<sample:5>", "<sample:3>"}, false, 9, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:6>", "<null>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:5>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:7>", "<null>"}}, 3), new String[][]{{"setWidth", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=0.0] {getHeight=0.0, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:1>", "<sample:6>", "<sample:6>", "<sample:1>"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:6>", "<sample:7>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:5>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:1>", "<sample:4>"}}, 1), new String[][]{{"setWidth", "double", "0"}, {"getWidth", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:5>", "<sample:5>"}, false, 0, null, 1), new String[][]{{"getHeight", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:4>", "<sample:2>", "<sample:4>", "<sample:2>"}, false, 12, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:1>", "<sample:9>", "NaN"}}, 2), new String[][]{{"setWidth", "double", "0"}, {"getWidth", "", "3"}, {"clone", "", "4"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=0.0] {getHeight=0.0, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:2>", "<sample:0>", "<sample:1>", "<sample:4>"}, false, 14, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:6>", "<sample:5>", "<sample:0>", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:5>", "<sample:6>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:7>", "<sample:6>", "NaN"}}), new String[][]{{"setWidth", "double", "3"}, {"getWidth", "", "3"}, {"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.0, height=0.0] {getHeight=0.0, getWidth=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:2>", "<sample:0>", "<sample:2>", "<sample:4>"}, false, 14, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:7>", "<null>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:7>", "<sample:6>", "1.7976931348623157E308"}}, 3), new String[][]{{"setWidth", "double", "3"}, {"getWidth", "", "3"}, {"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.0, height=0.0] {getHeight=0.0, getWidth=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:2>", "<sample:0>", "<sample:2>", "<sample:4>"}, false, 14, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:7>", "<sample:2>", "0.0"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:7>", "<null>"}}, 3), new String[][]{{"setWidth", "double", "3"}, {"getWidth", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:2>", "<sample:0>", "<sample:3>", "<sample:1>"}, false, 14, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:9>", "<sample:2>", "0.0"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:7>", "<null>"}}), new String[][]{{"setWidth", "double", "3"}, {"getWidth", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:2>", "<sample:0>", "<sample:6>", "<sample:1>"}, false, 14, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:9>", "<sample:2>", "0.0"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:0>", "<null>"}}, 1), new String[][]{{"setWidth", "double", "3"}, {"getWidth", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:4>", "<sample:0>", "<sample:1>", "<sample:1>"}, false, 14, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:0>", "<sample:2>", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:9>", "<sample:2>", "0.0"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:0>", "<null>"}}, 1), new String[][]{{"setWidth", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.0, height=0.0] {getHeight=0.0, getWidth=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:4>", "<sample:3>", "<sample:1>", "<sample:4>"}, false, 14, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:0>", "<sample:2>", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:0>", "<sample:2>"}}, 1), new String[][]{{"getWidth", "", "3"}, {"clone", "", "6"}, {"setWidth", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:2>", "<sample:2>", "<sample:8>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:0>", "<sample:4>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:7>", "<sample:4>"}}, 2), new String[][]{{"setWidth", "double", "3"}, {"clone", "", "6"}, {"setWidth", "double", "7"}, {"setWidth", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.0, height=0.0] {getHeight=0.0, getWidth=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:2>", "<sample:6>", "<sample:2>", "<sample:4>"}, false, 1, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:0>", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:0>", "<sample:7>"}}, 1), new String[][]{{"getHeight", "", "1"}, {"setHeight", "double", "4"}, {"getHeight", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:0>", "<sample:4>", "<sample:7>", "<sample:4>"}, false, 12, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:1>", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:0>", "<sample:6>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:5>", "<sample:3>", "<sample:7>"}}), new String[][]{{"getHeight", "", "1"}, {"setHeight", "double", "4"}, {"getHeight", "", "5"}, {"setWidth", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=Infinity, height=Infinity] {getHeight=Infinity, getWidth=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:1>", "<sample:6>", "<sample:4>", "<null>"}, false, 11, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:1>", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:2>", "<sample:0>", "<sample:6>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:5>", "<sample:3>", "<sample:7>"}}, 2), new String[][]{{"getHeight", "", "1"}, {"setHeight", "double", "4"}, {"getHeight", "", "5"}, {"setWidth", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=Infinity, height=Infinity] {getHeight=Infinity, getWidth=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "add", new String[]{"org.jfree.chart.block.Block", "java.lang.Object"}, new String[]{"<null>", "<b:true>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:0>", "<sample:6>"}, false), new String[][]{{"clone", "", "1"}, {"setHeight", "double", "0"}, {"getHeight", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:3>", "<sample:3>", "<sample:4>"}, false), new String[][]{{"setHeight", "double", "3"}, {"setWidth", "double", "3"}, {"getWidth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:7>", "<sample:2>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:3>", "<sample:6>"}, {"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:4>", "<d:1.5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:12>", "<sample:2>", "-0.0"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:1>", "<sample:7>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:1>", "<sample:7>"}}, 2), new String[][]{{"setHeight", "double", "0"}, {"getHeight", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:15>", "<sample:2>", "-4.9E-324"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:0>", "<sample:6>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:1>", "<sample:7>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:1>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:0>", "<sample:5>", "NaN"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<null>", "<sample:5>", "<sample:2>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:5>", "<sample:1>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=NaN, height=0.0] {getHeight=0.0, getWidth=NaN}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<null>", "<sample:8>", "NaN"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:1>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<null>", "<sample:5>", "<sample:2>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:5>", "<sample:1>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<null>", "<sample:2>", "NaN"}, false, 14, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:6>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<null>", "<sample:5>", "<sample:2>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:5>", "<sample:1>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:3>", "<sample:6>", "2.02428456909953485E18"}, false, 13, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:0>", "<sample:5>", "<sample:2>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:5>", "<sample:1>", "<sample:4>"}}, 2), new String[][]{{"setWidth", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:2>", "<sample:5>", "1.01214228454976742E18"}, false, 12, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:7>", "<sample:3>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:6>", "<sample:5>", "<sample:2>", "<sample:7>"}}, 2), new String[][]{{"getHeight", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "add", new String[]{"org.jfree.chart.block.Block", "java.lang.Object"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "clear", ""}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<null>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:9>", "<sample:4>", "Infinity"}, false, 15, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:0>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:2>", "<sample:5>", "<sample:2>", "<sample:3>"}}, 3), new String[][]{{"getWidth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:4>", "<null>", "0.5"}, false, 4, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:7>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:1>", "<sample:5>", "<sample:1>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:4>", "<sample:6>", "3.6195"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.5, height=0.0] {getHeight=0.0, getWidth=0.5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "double"}, new String[]{"<sample:3>", "<sample:5>", "0.25"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:7>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:1>", "<sample:5>", "<sample:1>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.25, height=0.0] {getHeight=0.0, getWidth=0.25}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, null, 1), new String[][]{{"getWidth", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "add", new String[]{"org.jfree.chart.block.Block", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<i:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFF", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:2>", "<sample:1>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "clear", ""}}), new String[][]{{"setHeight", "double", "5"}, {"getHeight", "", "0"}, {"setWidth", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=-Infinity] {getHeight=-Infinity, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:4>", "<sample:0>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "add", new String[]{"org.jfree.chart.block.Block", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:3>", "<null>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<b:true>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=0.0] {getHeight=0.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:2>", "<sample:7>"}, false), new String[][]{{"setWidth", "double", "2"}, {"clone", "", "7"}, {"setWidth", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.0, height=0.0] {getHeight=0.0, getWidth=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<null>", "<sample:6>"}, false, 0, null, 3), new String[][]{{"setHeight", "double", "3"}, {"getWidth", "", "5"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=1.0] {getHeight=1.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:7>", "<sample:5>", "506071142274883745"}, {"org.jfree.chart.block.BorderArrangement", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:4>", "<sample:3>"}, false, 5, new String[][]{{"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:5>", "<null>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:3>", "<sample:1>", "<sample:2>", "<sample:7>"}}, 3), new String[][]{{"clone", "", "7"}, {"setWidth", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=0.0] {getHeight=0.0, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:0>", "<sample:7>"}, false, 1, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:7>", "<sample:6>", "-1.7976931348623157E308"}}), new String[][]{{"getWidth", "", "0"}, {"setHeight", "double", "6"}, {"getHeight", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:1>", "<sample:1>", "<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=-1.0] {getHeight=-1.0, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:1>", "<null>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFF", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:2>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:0>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:2>", "<i:-127>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFF", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:1>", "<sample:4>"}}, 3), new String[][]{{"getHeight", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:1>", "<sample:6>"}, false, 6, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFF", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<null>", "<sample:5>", "<null>"}}, 2), new String[][]{{"setWidth", "double", "2"}, {"getWidth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:5>", "<sample:3>"}, false), new String[][]{{"setWidth", "double", "1"}, {"setWidth", "double", "4"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=Infinity, height=0.0] {getHeight=0.0, getWidth=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:5>", "<null>", "<sample:5>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:7>", "<sample:6>"}}, 1), new String[][]{{"setWidth", "double", "5"}, {"setWidth", "double", "4"}, {"setHeight", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=Infinity, height=-Infinity] {getHeight=-Infinity, getWidth=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:6>", "<sample:7>", "<sample:9>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:4>", "<sample:7>"}}, 2), new String[][]{{"getWidth", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<null>", "<sample:0>", "<sample:6>"}, false, 0, null, 1), new String[][]{{"setHeight", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=0.0, height=-1.0] {getHeight=-1.0, getWidth=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:7>", "<sample:1>", "<sample:3>"}, false, 0, null, 3), new String[][]{{"setWidth", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<null>", "<sample:0>", "<sample:4>"}, false, 8, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:2>", "<sample:6>", "-1.0"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:5>", "<sample:7>", "-8.988465674311579E306"}}, 1), new String[][]{{"setWidth", "double", "7"}, {"getHeight", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<null>", "<sample:0>", "<sample:7>"}, false, 8, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:2>", "<sample:6>", "-1.0"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:5>", "<sample:7>", "-8.988465674311579E306"}}, 1), new String[][]{{"setWidth", "double", "7"}, {"getHeight", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<null>", "<sample:7>"}, false, 13, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:6>", "<sample:5>", "NaN"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:2>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<i:-1>"}}, 1), new String[][]{{"setWidth", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.0, height=0.0] {getHeight=0.0, getWidth=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:1>", "<i:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:2>", "<null>", "<sample:7>", "<sample:0>"}}, 3), new String[][]{{"getWidth", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:1>", "<i:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:2>", "<null>", "<sample:7>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:0>", "<sample:6>", "<sample:4>"}}, 3), new String[][]{{"setHeight", "double", "0"}, {"getHeight", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:1>", "<i:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:0>", "<sample:6>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:1>", "<i:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:0>", "<sample:6>", "<sample:4>"}}, 3), new String[][]{{"setHeight", "double", "0"}, {"getHeight", "", "4"}, {"setWidth", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=-Infinity] {getHeight=-Infinity, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:7>", "<sample:4>", "<sample:6>"}, false, 15, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:6>", "<sample:7>", "<sample:6>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:6>", "<sample:7>"}}, 2), new String[][]{{"setHeight", "double", "1"}, {"getWidth", "", "7"}, {"getHeight", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:5>", "<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:5>", "<sample:5>", "1.7976931348623157E308"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:7>", "<null>", "<sample:3>", "<null>"}}, 3), new String[][]{{"setWidth", "double", "5"}, {"setHeight", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=-1.0] {getHeight=-1.0, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:6>", "<sample:1>"}, false, 11, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<null>", "<sample:4>", "<sample:6>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:4>", "<sample:5>"}}, 1), new String[][]{{"setHeight", "double", "4"}, {"getHeight", "", "6"}, {"getHeight", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:4>", "<sample:4>", "<sample:4>"}, false, 8, new String[][]{{"org.jfree.chart.block.BorderArrangement", "clear", ""}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<null>", "<sample:4>", "<sample:7>", "<sample:4>"}}, 1), new String[][]{{"setHeight", "double", "4"}, {"getHeight", "", "6"}, {"setHeight", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=-Infinity] {getHeight=-Infinity, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:7>", "<null>", "<sample:4>"}, false, 11, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:1>", "<sample:3>", "<sample:7>", "<sample:5>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:4>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:7>", "<sample:7>", "1.0"}}, 3), new String[][]{{"getWidth", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:2>", "<sample:7>"}, false, 8, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:1>", "<sample:2>", "<sample:1>", "<sample:5>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:3>", "<sample:5>"}, {"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:1>", "<b:true>"}}, 1), new String[][]{{"setWidth", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=Infinity] {getHeight=Infinity, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:8>", "<sample:8>"}, false, 1, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:6>", "<sample:2>", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:0>", "<sample:3>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:7>", "<sample:5>", "<sample:1>"}}, 3), new String[][]{{"getWidth", "", "7"}, {"clone", "", "7"}, {"setWidth", "double", "0"}, {"setWidth", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.0, height=0.0] {getHeight=0.0, getWidth=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:6>", "<sample:8>"}, false, 3, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:1>", "<sample:2>", "<sample:6>", "<null>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:3>", "<sample:10>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:1>", "<sample:4>", "1.7976931348623157E308"}}, 2), new String[][]{{"setWidth", "double", "0"}, {"getHeight", "", "7"}, {"setHeight", "double", "5"}, {"getWidth", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:6>", "<sample:11>"}, false, 3, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:1>", "<sample:1>", "<sample:6>", "<null>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:3>", "<sample:10>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:1>", "<sample:4>", "1.7976931348623157E308"}}), new String[][]{{"setWidth", "double", "0"}, {"getHeight", "", "7"}, {"setHeight", "double", "5"}, {"getWidth", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:5>", "<sample:9>", "<sample:13>"}, false, 3, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:1>", "<sample:1>", "<sample:6>", "<null>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:5>", "<sample:10>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:1>", "<sample:4>", "Infinity"}}, 1), new String[][]{{"clone", "", "3"}, {"getHeight", "", "4"}, {"setHeight", "double", "5"}, {"setWidth", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=-Infinity] {getHeight=-Infinity, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:6>", "<null>"}, false, 0, null, 3), new String[][]{{"clone", "", "0"}, {"setWidth", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=Infinity, height=0.0] {getHeight=0.0, getWidth=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:1>", "<sample:7>"}, false, 11, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:12>", "<sample:0>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:2>", "<null>", "1.0"}}, 1), new String[][]{{"clone", "", "1"}, {"setHeight", "double", "0"}, {"clone", "", "5"}, {"setWidth", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=-Infinity] {getHeight=-Infinity, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:11>", "<sample:0>"}, false, 6, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:3>", "<sample:0>", "Infinity"}, {"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<i:-52>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:5>", "<sample:3>"}}, 2), new String[][]{{"clone", "", "1"}, {"setHeight", "double", "6"}, {"getHeight", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:4>", "<sample:0>"}, false, 5, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:5>", "<sample:0>", "Infinity"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:0>", "<null>"}, {"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<i:1>"}}, 3), new String[][]{{"clone", "", "1"}, {"setHeight", "double", "6"}, {"setHeight", "double", "1"}, {"getHeight", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFF", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:3>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:3>", "<sample:7>", "<sample:6>", "<sample:7>"}}, 2), new String[][]{{"setWidth", "double", "3"}, {"setHeight", "double", "6"}, {"getWidth", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:1>", "<sample:5>", "<sample:3>"}, false, 9, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:6>", "<sample:0>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:1>", "<sample:7>", "4.4942328371557893E307"}}, 3), new String[][]{{"setWidth", "double", "5"}, {"setWidth", "double", "2"}, {"setWidth", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.0, height=0.0] {getHeight=0.0, getWidth=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:6>", "<sample:5>", "<null>"}, false, 14, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:8>", "<sample:0>", "<sample:5>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:6>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:6>", "<sample:2>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:0>", "<null>", "<sample:2>"}}, 1), new String[][]{{"getHeight", "", "6"}, {"setWidth", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:6>", "<sample:4>"}, false, 2, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:6>", "<sample:2>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:6>", "<null>", "<sample:2>"}}, 3), new String[][]{{"getHeight", "", "6"}, {"setWidth", "double", "6"}, {"setWidth", "double", "0"}, {"setWidth", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:7>", "<sample:1>"}, false, 6, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:1>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:2>", "<sample:2>", "<sample:6>"}}, 1), new String[][]{{"setWidth", "double", "1"}, {"getWidth", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:3>", "<sample:8>"}, false, 8, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:6>", "<sample:6>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:0>", "<sample:1>", "<sample:8>"}}, 2), new String[][]{{"setWidth", "double", "1"}, {"getWidth", "", "1"}, {"setHeight", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:0>", "<sample:4>"}, false, 4, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:4>", "<sample:2>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:0>", "<sample:6>", "-Infinity"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:7>", "<sample:3>", "<sample:1>"}}, 2), new String[][]{{"setWidth", "double", "5"}, {"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=0.0] {getHeight=0.0, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:7>", "<sample:4>"}, false, 3, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:1>", "<sample:4>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:10>", "<sample:7>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "clear", ""}}, 1), new String[][]{{"setWidth", "double", "0"}, {"setHeight", "double", "6"}, {"getWidth", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:0>", "<sample:9>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:4>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:0>", "<sample:11>", "2.53035571137441888E17"}}, 3), new String[][]{{"setHeight", "double", "3"}, {"setWidth", "double", "0"}, {"getHeight", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:2>", "<sample:1>"}, false, 3, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:6>", "<null>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:3>", "<sample:4>", "<sample:4>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:2>", "<sample:11>", "2.5303557113744189E18"}}, 2), new String[][]{{"setHeight", "double", "0"}, {"setWidth", "double", "3"}, {"getHeight", "", "6"}, {"getHeight", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:6>", "<sample:5>"}, false, 3, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:6>", "<sample:5>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFR", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:6>", "<sample:2>", "<sample:5>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:2>", "<sample:12>", "0.0"}}, 3), new String[][]{{"setHeight", "double", "0"}, {"setWidth", "double", "3"}, {"getHeight", "", "6"}, {"getHeight", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<null>", "<sample:7>"}, false, 6, new String[][]{{"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:8>", "<null>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:0>", "<sample:6>", "<sample:3>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:5>", "<sample:6>", "NaN"}}, 2), new String[][]{{"setWidth", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=Infinity, height=0.0] {getHeight=0.0, getWidth=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeNN", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D"}, new String[]{"<sample:7>", "<sample:1>"}, false, 12, new String[][]{{"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:7>", "<null>"}, {"org.jfree.chart.block.BorderArrangement", "arrange", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:7>", "<sample:0>", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:18>", "<sample:5>", "1.01214228454976755E18"}}), new String[][]{{"getWidth", "", "7"}, {"clone", "", "3"}, {"getHeight", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:7>", "<sample:2>", "<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-1.0, height=0.0] {getHeight=0.0, getWidth=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<null>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFF", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<sample:5>", "<null>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:7>", "<sample:9>", "<sample:5>"}, false, 0, null, 2), new String[][]{{"getWidth", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "add", new String[]{"org.jfree.chart.block.Block", "java.lang.Object"}, new String[]{"<sample:2>", "<null>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:3>", "<sample:0>", "<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=-Infinity, height=-1.0] {getHeight=-1.0, getWidth=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrange", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:7>", "<sample:15>"}, false, 10, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFF", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint", "<null>", "<sample:1>", "<sample:4>"}}, 2), new String[][]{{"getHeight", "", "4"}, {"getWidth", "", "3"}, {"clone", "", "3"}, {"setWidth", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=1.0, height=0.0] {getHeight=0.0, getWidth=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFF", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:0>", "<sample:4>", "<sample:2>"}, false, 6, new String[][]{{"org.jfree.chart.block.BorderArrangement", "add", "org.jfree.chart.block.Block,java.lang.Object", "<sample:6>", "<s:b>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:4>", "<sample:7>"}, {"org.jfree.chart.block.BorderArrangement", "clear", ""}}, 1), new String[][]{{"getWidth", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "add", new String[]{"org.jfree.chart.block.Block", "java.lang.Object"}, new String[]{"<sample:5>", "<null>"}, false, 6, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeFN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double", "<sample:6>", "<sample:2>", "1.7976931348623157E308"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeRR", new String[]{"org.jfree.chart.block.BlockContainer", "org.jfree.data.Range", "org.jfree.data.Range", "java.awt.Graphics2D"}, new String[]{"<sample:4>", "<sample:1>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeNN", "org.jfree.chart.block.BlockContainer,java.awt.Graphics2D", "<sample:1>", "<sample:6>"}}, 3), new String[][]{{"setWidth", "double", "4"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Size2D", actual.getClass().getName());
  assertEquals("Size2D[width=Infinity, height=0.0] {getHeight=0.0, getWidth=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.block.BorderArrangement", "org.jfree.chart.block.BorderArrangement", "arrangeFR", new String[]{"org.jfree.chart.block.BlockContainer", "java.awt.Graphics2D", "org.jfree.chart.block.RectangleConstraint"}, new String[]{"<sample:18>", "<sample:7>", "<sample:6>"}, false, 9, new String[][]{{"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:7>", "<sample:5>", "<sample:4>", "<sample:2>"}, {"org.jfree.chart.block.BorderArrangement", "arrangeRR", "org.jfree.chart.block.BlockContainer,org.jfree.data.Range,org.jfree.data.Range,java.awt.Graphics2D", "<sample:4>", "<sample:3>", "<sample:4>", "<sample:1>"}, {"org.jfree.chart.block.BorderArrangement", "equals", "java.lang.Object", "<s:fy>"}}, 3), new String[][]{{"clone", "", "2"}, {"setHeight", "double", "1"}, {"setWidth", "double", "5"}, {"getHeight", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
}
