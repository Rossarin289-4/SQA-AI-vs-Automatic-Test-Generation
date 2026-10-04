package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Line2D", "java.awt.geom.Line2D"}, new String[]{"<sample:6>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Shape", "java.awt.Shape"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Shape", "java.awt.Shape"}, new String[]{"<sample:7>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Shape", "java.awt.Shape"}, new String[]{"<sample:5>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "drawRotatedShape", new String[]{"java.awt.Graphics2D", "java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:7>", "<sample:2>", "NaN", "NaN", "0.5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "drawRotatedShape", new String[]{"java.awt.Graphics2D", "java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "<sample:3>", "NaN", "NaN", "0.5"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Line2D", "java.awt.geom.Line2D"}, new String[]{"<sample:7>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:2>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<sample:5>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<sample:5>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<sample:6>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"3.4028235E38", "0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"3.4028235E38", "0.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"Infinity", "-29.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "getPointInRectangle", new String[]{"double", "double", "java.awt.geom.Rectangle2D"}, new String[]{"0.5", "0.0", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "getPointInRectangle", new String[]{"double", "double", "java.awt.geom.Rectangle2D"}, new String[]{"1.0", "0.5", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"3.4028235E38", "-1.0"}, true);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"3.4028235E38"}, true);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "contains", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:2>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"8.5070587E37"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"8.5070587E37"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "intersects", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"NaN"}, true);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"0.0", "3.4028235E38"}, true), new String[][]{{"reset", "", "0"}, {"contains", "double,double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"-8.0", "3.4028235E38"}, true), new String[][]{{"reset", "", "0"}, {"contains", "double,double", "1"}, {"getPathIterator", "java.awt.geom.AffineTransform", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:0>", "Infinity", "0.0", "0.0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"Infinity"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Arc2D", "java.awt.geom.Arc2D"}, new String[]{"<sample:5>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Arc2D", "java.awt.geom.Arc2D"}, new String[]{"<sample:2>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "1.0", "NaN"}, true);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "1.0", "NaN"}, true, 0, null, 2), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:7>", "1.0", "NaN"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"0.0"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:6>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:2>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:2>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:3>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<null>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:4>", "1.7976931348623157E308", "0.0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"Infinity", "NaN"}, true), new String[][]{{"getWindingRule", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"Infinity", "NaN"}, true, 0, null, 1), new String[][]{{"getWindingRule", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<null>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"0.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "drawRotatedShape", new String[]{"java.awt.Graphics2D", "java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:1>", "<sample:0>", "NaN", "0.0", "Infinity"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "clone", new String[]{"java.awt.Shape"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"Infinity"}, true, 0, null, 3), new String[][]{{"contains", "double,double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-3.4028235E38", "3.4028235E38"}, true), new String[][]{{"contains", "double,double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-3.4028235E38", "3.4028235E38"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"Infinity", "-Infinity"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:1>", "<sample:4>", "1.0", "-1.0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:4>", "1.0", "-1.0"}, true);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"-62.0"}, true), new String[][]{{"getBounds", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=-62,y=-62,width=124,height=124] {getCenterX=0.0, getCenterY=0.0, getHeight=124.0, getMaxX=62.0, getMaxY=62.0, getMinX=-62.0, getMinY=-62.0, getWidth=124.0, getX=-62.0, getY=-62.0,...#215#574929899", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"-0.05"}, true, 0, null, 3), new String[][]{{"getBounds", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=-1,y=-1,width=2,height=2] {getCenterX=0.0, getCenterY=0.0, getHeight=2.0, getMaxX=1.0, getMaxY=1.0, getMinX=-1.0, getMinY=-1.0, getWidth=2.0, getX=-1.0, getY=-1.0, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"-0.025"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"0.44"}, true, 0, null, 3), new String[][]{{"getWindingRule", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"Infinity"}, true), new String[][]{{"getWindingRule", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"Infinity"}, true, 0, null, 1), new String[][]{{"getWindingRule", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"0.35"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"1.54"}, true, 0, null, 3), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"12.49"}, true, 0, null, 3), new String[][]{{"getCurrentPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[0.0, -12.49] {getX=0.0, getY=-12.489999771118164}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<sample:2>", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<sample:5>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<null>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"3.4028235E38"}, true), new String[][]{{"contains", "double,double", "7"}, {"lineTo", "float,float", "4"}, {"closePath", "", "5"}, {"getCurrentPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[0.0, -3.4028235E38] {getX=0.0, getY=-3.4028234663852886E38}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"3.4028235E38"}, true), new String[][]{{"contains", "double,double", "7"}, {"lineTo", "float,float", "4"}, {"closePath", "", "5"}, {"setWindingRule", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "getPointInRectangle", new String[]{"double", "double", "java.awt.geom.Rectangle2D"}, new String[]{"2.0", "-1.0", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-Infinity"}, true), new String[][]{{"setWindingRule", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"Infinity"}, true), new String[][]{{"contains", "double,double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"Infinity"}, true, 0, null, 2), new String[][]{{"contains", "double,double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-624.8"}, true, 0, null, 2), new String[][]{{"getBounds2D", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=-624.8,y=-624.8,w=1249.6,h=1249.6] {getCenterX=0.0, getCenterY=0.0, getHeight=1249.5999755859375, getMaxX=624.7999877929688, getMaxY=624.7999877929688, getMinX=-624.7...#335#279877793", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"1245.6"}, true, 0, null, 2), new String[][]{{"intersects", "java.awt.geom.Rectangle2D", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Ellipse2D", "java.awt.geom.Ellipse2D"}, new String[]{"<sample:6>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Ellipse2D", "java.awt.geom.Ellipse2D"}, new String[]{"<sample:6>", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Ellipse2D", "java.awt.geom.Ellipse2D"}, new String[]{"<sample:3>", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Shape", "java.awt.Shape"}, new String[]{"<sample:3>", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:7>", "NaN", "0.5", "Infinity"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"-3.4028235E38", "-3.4028235E38"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createLineRegion", new String[]{"java.awt.geom.Line2D", "float"}, new String[]{"<sample:2>", "NaN"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-3.4028235E38", "-3.4028235E38"}, true, 0, null, 3), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"Infinity", "-3.4028235E38"}, true, 0, null, 3), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "7"}, {"currentSegment", "double[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "contains", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "drawRotatedShape", new String[]{"java.awt.Graphics2D", "java.awt.Shape", "double", "float", "float"}, new String[]{"<null>", "<null>", "Infinity", "2.0", "-3.4028235E38"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Ellipse2D", "java.awt.geom.Ellipse2D"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createLineRegion", new String[]{"java.awt.geom.Line2D", "float"}, new String[]{"<sample:5>", "-53.25"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createLineRegion", new String[]{"java.awt.geom.Line2D", "float"}, new String[]{"<sample:7>", "0.5"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"Infinity"}, true), new String[][]{{"lineTo", "float,float", "1"}, {"contains", "double,double", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:4>", "-1.7976931348623157E308", "2.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:5>", "<sample:4>", "-1.7976931348623157E308", "17.0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Arc2D", "java.awt.geom.Arc2D"}, new String[]{"<sample:3>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"3.4028235E38", "-1.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Shape", "java.awt.Shape"}, new String[]{"<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "0.49999999999999994", "NaN"}, true), new String[][]{{"closePath", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.awt.geom.IllegalPathStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:4>", "<sample:6>", "NaN", "0.0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:6>", "-1.0", "0.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "clone", new String[]{"java.awt.Shape"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<null>", "-1.0", "1.7976931348623157E308"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"3.96", "0.05"}, true), new String[][]{{"setWindingRule", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"NaN", "NaN"}, true, 0, null, 3), new String[][]{{"transform", "java.awt.geom.AffineTransform", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"1.0", "2.0"}, true, 0, null, 2), new String[][]{{"getBounds2D", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=-2.0,y=-2.0,w=4.0,h=4.0] {getCenterX=0.0, getCenterY=0.0, getHeight=4.0, getMaxX=2.0, getMaxY=2.0, getMinX=-2.0, getMinY=-2.0, getWidth=4.0, getX=-2.0, getY=-2.0, isE...#211#112038073", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-5.0", "1.0"}, true), new String[][]{{"getBounds2D", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=-5.0,y=-5.0,w=10.0,h=10.0] {getCenterX=0.0, getCenterY=0.0, getHeight=10.0, getMaxX=5.0, getMaxY=5.0, getMinX=-5.0, getMinY=-5.0, getWidth=10.0, getX=-5.0, getY=-5.0,...#215#-138168449", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-50.12", "31.3"}, true), new String[][]{{"getBounds2D", "", "3"}, {"outcode", "java.awt.geom.Point2D", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-0.023", "9.47"}, true, 0, null, 3), new String[][]{{"getBounds2D", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=-9.47,y=-9.47,w=18.94,h=18.94] {getCenterX=0.0, getCenterY=0.0, getHeight=18.940000534057617, getMaxX=9.470000267028809, getMaxY=9.470000267028809, getMinX=-9.4700002...#331#-306061779", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Arc2D", "java.awt.geom.Arc2D"}, new String[]{"<sample:7>", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:7>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"NaN", "0.0"}, true), new String[][]{{"lineTo", "float,float", "2"}, {"getBounds2D", "", "2"}, {"outcode", "double,double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<null>", "-1.7976931348623157E308", "-8.5070587E36", "3.4028235E38"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "1.7976931348623157E308", "2.0", "3.4028235E37"}, true);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "1.7976931348623157E308", "2.0", "3.4028235E37"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:4>", "1.7976931348623157E308", "2.0", "3.4028235E37"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "0.5", "-2.0", "-3.4028235E37"}, true, 0, null, 3), new String[][]{{"contains", "java.awt.geom.Rectangle2D", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<sample:6>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"1.0"}, true), new String[][]{{"intersects", "java.awt.geom.Rectangle2D", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"1.0", "1.0"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "6"}, {"getRecursionLimit", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "clone", new String[]{"java.awt.Shape"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"3.4028235E37", "-8.5070587E36"}, true), new String[][]{{"lineTo", "double,double", "4"}, {"contains", "java.awt.geom.Point2D", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "intersects", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Line2D", "java.awt.geom.Line2D"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:2>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-1.0"}, true), new String[][]{{"getBounds2D", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=-1.0,y=-1.0,w=2.0,h=2.0] {getCenterX=0.0, getCenterY=0.0, getHeight=2.0, getMaxX=1.0, getMaxY=1.0, getMinX=-1.0, getMinY=-1.0, getWidth=2.0, getX=-1.0, getY=-1.0, isE...#211#-212312945", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"0.5"}, true), new String[][]{{"contains", "java.awt.geom.Rectangle2D", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<null>", "<sample:2>", "0.5", "-1.0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"0.0"}, true), new String[][]{{"append", "java.awt.Shape,boolean", "7"}, {"getCurrentPoint", "", "7"}, {"getX", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<null>", "-1.7976931348623157E308", "-8.5070587E36", "0.0"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:6>", "0.5", "2.0", "2.0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:6>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"NaN"}, true), new String[][]{{"getBounds2D", "", "7"}, {"getX", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"-8.5070587E36", "1.0"}, true, 0, null, 3), new String[][]{{"lineTo", "float,float", "1"}, {"contains", "java.awt.geom.Rectangle2D", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"-8.5070587E36"}, true), new String[][]{{"append", "java.awt.Shape,boolean", "5"}, {"getCurrentPoint", "", "2"}, {"setLocation", "float,float", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[-Infinity, -1.0] {getX=-Infinity, getY=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"3.4028235E37"}, true), new String[][]{{"clone", "", "4"}, {"getCurrentPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[0.0, 3.4028235E37] {getX=0.0, getY=3.4028234663852886E37}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"0.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"-8.5070587E36"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"0.5"}, true), new String[][]{{"contains", "double,double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"2.0"}, true, 0, null, 3), new String[][]{{"getBounds2D", "", "5"}, {"createUnion", "java.awt.geom.Rectangle2D", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"0.5"}, true), new String[][]{{"lineTo", "float,float", "4"}, {"moveTo", "float,float", "3"}, {"getWindingRule", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"Infinity"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "5"}, {"currentSegment", "float[]", "5"}, {"currentSegment", "float[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"3.4028235E38"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "getPointInRectangle", new String[]{"double", "double", "java.awt.geom.Rectangle2D"}, new String[]{"0.5", "-1.7976931348623157E308", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"0.5"}, true), new String[][]{{"getBounds", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=-1,y=-1,width=2,height=2] {getCenterX=0.0, getCenterY=0.0, getHeight=2.0, getMaxX=1.0, getMaxY=1.0, getMinX=-1.0, getMinY=-1.0, getWidth=2.0, getX=-1.0, getY=-1.0, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"0.0"}, true, 0, null, 3), new String[][]{{"getBounds2D", "", "5"}, {"getBounds", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=0,y=0,width=0,height=0] {getCenterX=0.0, getCenterY=0.0, getHeight=0.0, getMaxX=0.0, getMaxY=0.0, getMinX=0.0, getMinY=0.0, getWidth=0.0, getX=0.0, getY=0.0, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "clone", new String[]{"java.awt.Shape"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:4>", "Infinity", "-1.7976931348623157E308"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:2>", "NaN", "NaN"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-8.5070587E36", "Infinity"}, true), new String[][]{{"contains", "double,double", "6"}, {"getBounds", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=-2147483648,y=-2147483648,width=0,height=0] {getCenterX=-2.147483648E9, getCenterY=-2.147483648E9, getHeight=0.0, getMaxX=-2.147483648E9, getMaxY=-2.147483648E9, getMinX=-2.147483...#300#408291118", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "contains", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"0.0"}, true), new String[][]{{"lineTo", "float,float", "3"}, {"getCurrentPoint", "", "5"}, {"setLocation", "double,double", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[-1.0, 0.0] {getX=-1.0, getY=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:1>", "<null>", "0.0", "-1.7976931348623157E308"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "0.49999999999999994", "-3.4028235E38", "-3.4028235E38"}, true, 0, null, 3), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "0.49999999999999994", "-3.4028235E38", "-3.4028235E38"}, true), new String[][]{{"createTransformedShape", "java.awt.geom.AffineTransform", "6"}, {"contains", "double,double", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"Infinity", "2.0"}, true), new String[][]{{"setWindingRule", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"Infinity", "2.0"}, true, 0, null, 3), new String[][]{{"setWindingRule", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"0.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "-2.0", "0.5"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.FlatteningPathIterator", actual.getClass().getName());
  assertEquals("{getFlatness=1.0, getRecursionLimit=10, getWindingRule=1, isDone=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "1.0", "0.5"}, true, 0, null, 3), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.FlatteningPathIterator", actual.getClass().getName());
  assertEquals("{getFlatness=1.0, getRecursionLimit=10, getWindingRule=1, isDone=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:0>", "1.0", "0.5"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-0.0"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Shape", "java.awt.Shape"}, new String[]{"<null>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "intersects", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<null>", "-1.0", "-8.5070587E36", "0.0"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"36.37"}, true, 0, null, 1), new String[][]{{"transform", "java.awt.geom.AffineTransform", "5"}, {"setWindingRule", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"4.2535293E36", "-1.7014117E37"}, true), new String[][]{{"contains", "double,double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"2.0"}, true, 0, null, 2), new String[][]{{"contains", "java.awt.geom.Point2D", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"3.4028235E38", "-8.5070587E36"}, true, 0, null, 1), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"3.4028235E38", "-8.5070587E36"}, true, 0, null, 1), new String[][]{{"closePath", "", "7"}, {"getCurrentPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[-3.317753E38, -Infinity] {getX=-3.3177529557846924E38, getY=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"0.5", "-8.5070587E36"}, true, 0, null, 1), new String[][]{{"closePath", "", "7"}, {"getCurrentPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[8.5070587E36, -8.5070587E36] {getX=8.507058665963221E36, getY=-8.507058665963221E36}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"0.5", "8.5070587E36"}, true, 0, null, 1), new String[][]{{"closePath", "", "7"}, {"getCurrentPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[-8.5070587E36, 8.5070587E36] {getX=-8.507058665963221E36, getY=8.507058665963221E36}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"3.4028235E38", "Infinity"}, true, 0, null, 1), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:6>", "-1.0", "NaN"}, true), new String[][]{{"append", "java.awt.geom.PathIterator,boolean", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.awt.geom.IllegalPathStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:6>", "-1.7976931348623157E308", "0.0"}, true), new String[][]{{"getCurrentPoint", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"1.0", "NaN"}, true), new String[][]{{"trimToSize", "", "2"}, {"getPathIterator", "java.awt.geom.AffineTransform", "0"}, {"currentSegment", "double[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-3.4028235E38"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Line2D", "java.awt.geom.Line2D"}, new String[]{"<sample:6>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "contains", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:4>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Shape", "java.awt.Shape"}, new String[]{"<null>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-8.5070587E36"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "0"}, {"currentSegment", "double[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"0.5", "3.4028235E37"}, true), new String[][]{{"getBounds", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=-2147483648,y=-2147483648,width=2147483647,height=2147483647] {getCenterX=-1.0737418245E9, getCenterY=-1.0737418245E9, getHeight=2.147483647E9, getMaxX=-1.0, getMaxY=-1.0, getMinX...#321#992610971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"3.4028235E38", "0.5"}, true, 0, null, 2), new String[][]{{"getBounds", "", "5"}, {"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=-2147483648,y=-2147483648,width=2147483647,height=2147483647] {getCenterX=-1.0737418245E9, getCenterY=-1.0737418245E9, getHeight=2.147483647E9, getMaxX=-1.0, getMaxY=-1.0, getMinX...#321#992610971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Shape", "java.awt.Shape"}, new String[]{"<null>", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "1.0", "0.5", "1.0"}, true), new String[][]{{"trimToSize", "", "6"}, {"getBounds", "", "0"}, {"add", "java.awt.geom.Rectangle2D", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createLineRegion", new String[]{"java.awt.geom.Line2D", "float"}, new String[]{"<sample:1>", "NaN"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:5>", "<sample:4>", "-1.7976931348623157E308", "1.0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"NaN", "1.0"}, true, 0, null, 3), new String[][]{{"getWindingRule", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"-40.0"}, true, 0, null, 1), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"830.952"}, true, 0, null, 1), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:3>", "Infinity", "NaN"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.FlatteningPathIterator", actual.getClass().getName());
  assertEquals("{getFlatness=0.0, getRecursionLimit=10, getWindingRule=1, isDone=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "2.0", "2.0", "0.5"}, true, 0, null, 3), new String[][]{{"getBounds2D", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=0.0,y=0.0,w=0.0,h=0.0] {getCenterX=0.0, getCenterY=0.0, getHeight=0.0, getMaxX=0.0, getMaxY=0.0, getMinX=0.0, getMinY=0.0, getWidth=0.0, getX=0.0, getY=0.0, isEmpty=...#205#-1521548141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"NaN", "NaN"}, true, 0, null, 1), new String[][]{{"closePath", "", "1"}, {"intersects", "java.awt.geom.Rectangle2D", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-8.5070587E36", "3.4028235E37"}, true, 0, null, 3), new String[][]{{"contains", "java.awt.geom.Point2D", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"Infinity", "8.507058E35"}, true, 0, null, 3), new String[][]{{"createTransformedShape", "java.awt.geom.AffineTransform", "6"}, {"contains", "double,double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "intersects", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "1.0", "Infinity", "3.4028235E37"}, true), new String[][]{{"lineTo", "double,double", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.awt.geom.IllegalPathStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "-21.0", "3.4028235E37", "3.4028235E38"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "-0.0", "-1.7976931348623157E308"}, true, 0, null, 2), new String[][]{{"getBounds2D", "", "7"}, {"getX", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "-62.0", "1.7976931348623157E308"}, true, 0, null, 2), new String[][]{{"getBounds2D", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=0.0,y=0.0,w=0.0,h=0.0] {getCenterX=0.0, getCenterY=0.0, getHeight=0.0, getMaxX=0.0, getMaxY=0.0, getMinX=0.0, getMinY=0.0, getWidth=0.0, getX=0.0, getY=0.0, isEmpty=...#205#-1521548141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "2.0", "1.7976931348623157E308"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "-1.7976931348623157E308", "1.0"}, true, 0, null, 3), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "2.0", "1.0"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "0.5", "3.4028235E37", "-1.0"}, true, 0, null, 2), new String[][]{{"moveTo", "double,double", "2"}, {"lineTo", "double,double", "3"}, {"reset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"NaN", "19.75"}, true, 0, null, 2), new String[][]{{"contains", "java.awt.geom.Point2D", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"NaN", "17.4"}, true, 0, null, 2), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"NaN", "2.0"}, true, 0, null, 2), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.FlatteningPathIterator", actual.getClass().getName());
  assertEquals("{getFlatness=1.0, getRecursionLimit=10, getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "1.9320000000000002", "-0.2505"}, true), new String[][]{{"getBounds2D", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=0.0,y=0.0,w=0.0,h=0.0] {getCenterX=0.0, getCenterY=0.0, getHeight=0.0, getMaxX=0.0, getMaxY=0.0, getMinX=0.0, getMinY=0.0, getWidth=0.0, getX=0.0, getY=0.0, isEmpty=...#205#-1521548141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-3.4028235E38"}, true, 0, null, 3), new String[][]{{"getBounds2D", "", "6"}, {"createIntersection", "java.awt.geom.Rectangle2D", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"-1.0", "3.4028235E38"}, true, 0, null, 2), new String[][]{{"getCurrentPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[-3.4028235E38, 3.4028235E38] {getX=-3.4028234663852886E38, getY=3.4028234663852886E38}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"Infinity"}, true, 0, null, 1), new String[][]{{"intersects", "java.awt.geom.Rectangle2D", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "-1.0", "0.5"}, true), new String[][]{{"intersects", "java.awt.geom.Rectangle2D", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:0>", "-1.0", "-1.0"}, true), new String[][]{{"contains", "java.awt.geom.Point2D", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "-7.933999999999999", "20.0", "-6.805647E37"}, true), new String[][]{{"getBounds2D", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=0.0,y=0.0,w=0.0,h=0.0] {getCenterX=0.0, getCenterY=0.0, getHeight=0.0, getMaxX=0.0, getMaxY=0.0, getMinX=0.0, getMinY=0.0, getWidth=0.0, getX=0.0, getY=0.0, isEmpty=...#205#-1521548141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "-0.0", "-5.0", "Infinity"}, true, 0, null, 1), new String[][]{{"getBounds2D", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=0.0,y=0.0,w=0.0,h=0.0] {getCenterX=0.0, getCenterY=0.0, getHeight=0.0, getMaxX=0.0, getMaxY=0.0, getMinX=0.0, getMinY=0.0, getWidth=0.0, getX=0.0, getY=0.0, isEmpty=...#205#-1521548141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "0.9999999999999999", "-1.7976931348623157E308"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "2"}, {"currentSegment", "float[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"-3.4028235E38"}, true, 0, null, 2), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "7"}, {"currentSegment", "float[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<null>", "NaN", "-3.4028235E38", "-0.5"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"2.0", "0.5"}, true, 0, null, 3), new String[][]{{"moveTo", "double,double", "1"}, {"lineTo", "float,float", "2"}, {"getBounds2D", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=-2.5,y=-2.5,w=5.0,h=5.0] {getCenterX=0.0, getCenterY=0.0, getHeight=5.0, getMaxX=2.5, getMaxY=2.5, getMinX=-2.5, getMinY=-2.5, getWidth=5.0, getX=-2.5, getY=-2.5, isE...#211#90447911", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"NaN"}, true, 0, null, 1), new String[][]{{"getCurrentPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[0.0, NaN] {getX=0.0, getY=NaN}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"NaN"}, true, 0, null, 1), new String[][]{{"getCurrentPoint", "", "2"}, {"getX", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-1.0"}, true, 0, null, 2), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-1.0"}, true, 0, null, 2), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "0"}, {"currentSegment", "double[]", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "0.125", "Infinity", "Infinity"}, true), new String[][]{{"getBounds", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=0,y=0,width=0,height=0] {getCenterX=0.0, getCenterY=0.0, getHeight=0.0, getMaxX=0.0, getMaxY=0.0, getMinX=0.0, getMinY=0.0, getWidth=0.0, getX=0.0, getY=0.0, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "0.4", "NaN", "1.0"}, true, 0, null, 2), new String[][]{{"intersects", "java.awt.geom.Rectangle2D", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:1>", "-0.05", "-1.7976931348623157E308"}, true), new String[][]{{"getWindingRule", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:0>", "-0.036000000000000004", "1.7976931348623157E308"}, true), new String[][]{{"getWindingRule", "", "6"}, {"getPathIterator", "java.awt.geom.AffineTransform", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "-1.7976931348623157E308", "1.7976931348623157E308"}, true), new String[][]{{"transform", "java.awt.geom.AffineTransform", "0"}, {"clone", "", "0"}, {"getWindingRule", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"0.0"}, true, 0, null, 2), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.FlatteningPathIterator", actual.getClass().getName());
  assertEquals("{getFlatness=0.0, getRecursionLimit=10, getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:4>", "0.5", "0.0"}, true), new String[][]{{"getBounds", "", "3"}, {"getHeight", "", "3"}, {"getCenterY", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "-1.7976931348623157E308", "NaN"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"7.0", "1.0"}, true, 0, null, 1), new String[][]{{"contains", "double,double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"2.1", "NaN"}, true, 0, null, 1), new String[][]{{"contains", "java.awt.geom.Rectangle2D", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"-3.4028235E38"}, true, 0, null, 2), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "1"}, {"currentSegment", "double[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"0.0", "3.4028235E38"}, true, 0, null, 1), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-2.7", "-Infinity"}, true, 0, null, 1), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "1"}, {"getWindingRule", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-8.507059E35"}, true, 0, null, 1), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "1"}, {"getRecursionLimit", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"-0.984"}, true, 0, null, 3), new String[][]{{"append", "java.awt.Shape,boolean", "5"}, {"getPathIterator", "java.awt.geom.AffineTransform,double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"2.0"}, true, 0, null, 2), new String[][]{{"getCurrentPoint", "", "0"}, {"distance", "double,double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.23606797749979", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"-1.7014117E38"}, true, 0, null, 3), new String[][]{{"getCurrentPoint", "", "3"}, {"setLocation", "double,double", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[-Infinity, -1.0] {getX=-Infinity, getY=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"0.5"}, true, 0, null, 2), new String[][]{{"getBounds", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=-1,y=-1,width=2,height=2] {getCenterX=0.0, getCenterY=0.0, getHeight=2.0, getMaxX=1.0, getMaxY=1.0, getMinX=-1.0, getMinY=-1.0, getWidth=2.0, getX=-1.0, getY=-1.0, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"Infinity"}, true, 0, null, 1), new String[][]{{"lineTo", "double,double", "0"}, {"getPathIterator", "java.awt.geom.AffineTransform", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"Infinity"}, true, 0, null, 1), new String[][]{{"lineTo", "double,double", "0"}, {"getCurrentPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[-Infinity, -1.0] {getX=-Infinity, getY=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"NaN"}, true, 0, null, 1), new String[][]{{"getBounds", "", "1"}, {"add", "java.awt.Rectangle", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=0,y=0,width=6,height=7] {getCenterX=3.0, getCenterY=3.5, getHeight=7.0, getMaxX=6.0, getMaxY=7.0, getMinX=0.0, getMinY=0.0, getWidth=6.0, getX=0.0, getY=0.0, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"1.0"}, true, 0, null, 3), new String[][]{{"getBounds", "", "1"}, {"getCenterX", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"-13.3", "-0.0"}, true, 0, null, 2), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"12.61", "-Infinity"}, true, 0, null, 2), new String[][]{{"reset", "", "2"}, {"lineTo", "double,double", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.awt.geom.IllegalPathStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"NaN", "0.5"}, true, 0, null, 1), new String[][]{{"setWindingRule", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"-8.5070587E36", "2.0"}, true, 0, null, 2), new String[][]{{"reset", "", "4"}, {"getWindingRule", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"0.019"}, true, 0, null, 3), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
