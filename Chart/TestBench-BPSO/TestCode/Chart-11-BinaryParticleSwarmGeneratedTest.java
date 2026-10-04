package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Shape", "java.awt.Shape"}, new String[]{"<sample:6>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"-0.03"}, true);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"NaN"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "clone", new String[]{"java.awt.Shape"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<null>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "contains", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:5>", "<sample:7>", "0.5000000000000001", "-Infinity"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"3.4028235E38"}, true), new String[][]{{"getBounds", "", "7"}, {"getBounds", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=-2147483648,y=-2147483648,width=2147483647,height=2147483647] {getCenterX=-1.0737418245E9, getCenterY=-1.0737418245E9, getHeight=2.147483647E9, getMaxX=-1.0, getMaxY=-1.0, getMinX...#321#992610971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"-1.0"}, true);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Ellipse2D", "java.awt.geom.Ellipse2D"}, new String[]{"<sample:5>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:5>", "NaN", "-2.4000000000000004"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:1>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"0.0", "0.5"}, true);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createLineRegion", new String[]{"java.awt.geom.Line2D", "float"}, new String[]{"<sample:7>", "-1.0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "contains", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"NaN"}, true), new String[][]{{"getCurrentPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[0.0, NaN] {getX=0.0, getY=NaN}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "drawRotatedShape", new String[]{"java.awt.Graphics2D", "java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:2>", "<sample:0>", "-Infinity", "-1.7014117E38", "0.0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "drawRotatedShape", new String[]{"java.awt.Graphics2D", "java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:7>", "<sample:7>", "-1.7976931348623155E308", "1.0", "NaN"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Line2D", "java.awt.geom.Line2D"}, new String[]{"<sample:3>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Arc2D", "java.awt.geom.Arc2D"}, new String[]{"<sample:5>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "intersects", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"0.03", "1.0"}, true);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-3.4028235E38", "0.5"}, true), new String[][]{{"getWindingRule", "", "5"}, {"setWindingRule", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"NaN", "-Infinity"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "getPointInRectangle", new String[]{"double", "double", "java.awt.geom.Rectangle2D"}, new String[]{"0.0", "-0.0", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"2.0"}, true);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"-2.3"}, true), new String[][]{{"getBounds2D", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=-2.3,y=-2.3,w=4.6,h=4.6] {getCenterX=0.0, getCenterY=0.0, getHeight=4.599999904632568, getMaxX=2.299999952316284, getMaxY=2.299999952316284, getMinX=-2.29999995231628...#323#-860637595", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:6>", "Infinity", "0.25000000000000006"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"3.4028235E38"}, true), new String[][]{{"contains", "java.awt.geom.Rectangle2D", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<sample:4>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Line2D", "java.awt.geom.Line2D"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"-0.03"}, true), new String[][]{{"getWindingRule", "", "2"}, {"getWindingRule", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"-3.4028235E37", "-Infinity"}, true), new String[][]{{"getWindingRule", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:6>", "Infinity", "0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<null>", "<sample:6>", "Infinity", "-1.0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:1>", "<sample:1>", "-10.4", "0.5"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"50.86", "1.0"}, true), new String[][]{{"getWindingRule", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"Infinity", "0.5"}, true), new String[][]{{"setWindingRule", "int", "2"}, {"contains", "double,double", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"Infinity"}, true), new String[][]{{"getBounds", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=-2147483648,y=-2147483648,width=0,height=0] {getCenterX=-2.147483648E9, getCenterY=-2.147483648E9, getHeight=0.0, getMaxX=-2.147483648E9, getMaxY=-2.147483648E9, getMinX=-2.147483...#300#408291118", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Shape", "java.awt.Shape"}, new String[]{"<sample:4>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Ellipse2D", "java.awt.geom.Ellipse2D"}, new String[]{"<sample:3>", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Arc2D", "java.awt.geom.Arc2D"}, new String[]{"<sample:0>", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"-1.45"}, true), new String[][]{{"getBounds2D", "", "1"}, {"getFrame", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-1.4500000476837158,y=-1.4500000476837158,w=2.9000000953674316,h=2.9000000953674316] {getCenterX=0.0, getCenterY=0.0, getHeight=2.9000000953674316, getMaxX=1.4500000...#392#801475600", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"NaN"}, true), new String[][]{{"contains", "double,double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"-0.0"}, true, 0, null, 3), new String[][]{{"getBounds", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=0,y=0,width=0,height=0] {getCenterX=0.0, getCenterY=0.0, getHeight=0.0, getMaxX=0.0, getMaxY=0.0, getMinX=0.0, getMinY=0.0, getWidth=0.0, getX=0.0, getY=0.0, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:5>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Arc2D", "java.awt.geom.Arc2D"}, new String[]{"<sample:0>", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-1.7014117E38", "-0.5"}, true), new String[][]{{"contains", "double,double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"0.25"}, true), new String[][]{{"intersects", "java.awt.geom.Rectangle2D", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-5.6", "-1.0"}, true), new String[][]{{"getBounds2D", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=-5.6,y=-5.6,w=11.2,h=11.2] {getCenterX=0.0, getCenterY=0.0, getHeight=11.199999809265137, getMaxX=5.599999904632568, getMaxY=5.599999904632568, getMinX=-5.59999990463...#327#-1628641783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:2>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:6>", "<sample:3>", "NaN", "0.87"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:1>", "-0.59", "0.5000000000000001"}, true), new String[][]{{"intersects", "java.awt.geom.Rectangle2D", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:5>", "11.009", "-Infinity", "Infinity"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"NaN", "-1.055"}, true, 0, null, 2), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "drawRotatedShape", new String[]{"java.awt.Graphics2D", "java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:0>", "<sample:3>", "1.7976931348623157E308", "NaN", "0.495"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"1.0"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"-1.0"}, true), new String[][]{{"getCurrentPoint", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[0.0, 1.0] {getX=0.0, getY=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Shape", "java.awt.Shape"}, new String[]{"<sample:0>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"0.06"}, true), new String[][]{{"setWindingRule", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"0.5"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.FlatteningPathIterator", actual.getClass().getName());
  assertEquals("{getFlatness=1.0, getRecursionLimit=10, getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:1>", "<sample:5>", "Infinity", "0.25000000000000006"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"NaN", "-3.4028235E38"}, true), new String[][]{{"contains", "java.awt.geom.Point2D", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"0.0"}, true), new String[][]{{"contains", "java.awt.geom.Rectangle2D", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"2.0"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"NaN", "-0.03"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:6>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<null>", "-Infinity", "2.0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Ellipse2D", "java.awt.geom.Ellipse2D"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:10>", "<null>", "1.7976931348623157E308", "0.5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "-1.7976931348623158E307", "2.0"}, true);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Shape", "java.awt.Shape"}, new String[]{"<sample:10>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"NaN"}, true, 0, null, 2), new String[][]{{"setWindingRule", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"-1.0"}, true), new String[][]{{"clone", "", "0"}, {"getWindingRule", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:5>", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "contains", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:1>", "<sample:8>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"0.3"}, true, 0, null, 1), new String[][]{{"setWindingRule", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"3.4028235E38"}, true, 0, null, 2), new String[][]{{"moveTo", "double,double", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"-3.4028235E38"}, true, 0, null, 2), new String[][]{{"contains", "double,double", "0"}, {"closePath", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Arc2D", "java.awt.geom.Arc2D"}, new String[]{"<sample:2>", "<sample:11>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:4>", "-51.0", "-3.5953862697246315E307"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"-0.2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "drawRotatedShape", new String[]{"java.awt.Graphics2D", "java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:7>", "<sample:3>", "26.118000000000002", "-Infinity", "0.57"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"0.82", "-0.1"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createLineRegion", new String[]{"java.awt.geom.Line2D", "float"}, new String[]{"<sample:0>", "0.03"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"-0.3", "3.4028235E38"}, true), new String[][]{{"contains", "java.awt.geom.Rectangle2D", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-Infinity", "3.4028235E38"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createLineRegion", new String[]{"java.awt.geom.Line2D", "float"}, new String[]{"<sample:6>", "-0.015"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:1>", "-2.0", "2.0"}, true), new String[][]{{"contains", "double,double", "2"}, {"lineTo", "double,double", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.awt.geom.IllegalPathStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"-3.4028235E38"}, true, 0, null, 3), new String[][]{{"contains", "double,double", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:6>", "-1.7976931348623157E308", "-2.4000000000000004"}, true), new String[][]{{"getBounds2D", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=0.0,y=0.0,w=0.0,h=0.0] {getCenterX=0.0, getCenterY=0.0, getHeight=0.0, getMaxX=0.0, getMaxY=0.0, getMinX=0.0, getMinY=0.0, getWidth=0.0, getX=0.0, getY=0.0, isEmpty=...#205#-1521548141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Ellipse2D", "java.awt.geom.Ellipse2D"}, new String[]{"<sample:5>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "clone", new String[]{"java.awt.Shape"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-3.4028235E38", "NaN"}, true, 0, null, 2), new String[][]{{"moveTo", "float,float", "2"}, {"moveTo", "double,double", "7"}, {"lineTo", "double,double", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"20.056"}, true, 0, null, 1), new String[][]{{"getBounds", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=-21,y=-21,width=42,height=42] {getCenterX=0.0, getCenterY=0.0, getHeight=42.0, getMaxX=21.0, getMaxY=21.0, getMinX=-21.0, getMinY=-21.0, getWidth=42.0, getX=-21.0, getY=-21.0, isE...#211#1914038345", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "-0.49999999999999994", "1.7976931348623157E308"}, true), new String[][]{{"contains", "double,double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "clone", new String[]{"java.awt.Shape"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"0.34"}, true, 0, null, 1), new String[][]{{"getBounds", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=-1,y=-1,width=2,height=2] {getCenterX=0.0, getCenterY=0.0, getHeight=2.0, getMaxX=1.0, getMaxY=1.0, getMinX=-1.0, getMinY=-1.0, getWidth=2.0, getX=-1.0, getY=-1.0, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"0.015"}, true, 0, null, 3), new String[][]{{"closePath", "", "1"}, {"setWindingRule", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:4>", "-2.0", "-1.7976931348623155E307"}, true), new String[][]{{"getCurrentPoint", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"1.0", "NaN"}, true), new String[][]{{"getCurrentPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[-1.0, NaN] {getX=-1.0, getY=NaN}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"0.5"}, true, 0, null, 3), new String[][]{{"getBounds", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=-1,y=-1,width=2,height=2] {getCenterX=0.0, getCenterY=0.0, getHeight=2.0, getMaxX=1.0, getMaxY=1.0, getMinX=-1.0, getMinY=-1.0, getWidth=2.0, getX=-1.0, getY=-1.0, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"Infinity", "NaN"}, true), new String[][]{{"getBounds", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=-2147483648,y=0,width=0,height=0] {getCenterX=-2.147483648E9, getCenterY=0.0, getHeight=0.0, getMaxX=-2.147483648E9, getMaxY=0.0, getMinX=-2.147483648E9, getMinY=0.0, getWidth=0.0...#246#-1852909862", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "contains", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:0>", "4.9E-324", "8.988465674311579E307"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"Infinity", "-3.4028235E38"}, true, 0, null, 3), new String[][]{{"getBounds2D", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=-Infinity,y=-Infinity,w=Infinity,h=Infinity] {getCenterX=NaN, getCenterY=NaN, getHeight=Infinity, getMaxX=NaN, getMaxY=NaN, getMinX=-Infinity, getMinY=-Infinity, getW...#261#1530014065", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"NaN", "-37.03"}, true), new String[][]{{"reset", "", "0"}, {"lineTo", "float,float", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.awt.geom.IllegalPathStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"-0.03"}, true, 0, null, 2), new String[][]{{"getCurrentPoint", "", "1"}, {"distance", "java.awt.geom.Point2D", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Line2D", "java.awt.geom.Line2D"}, new String[]{"<sample:6>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Shape", "java.awt.Shape"}, new String[]{"<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"-2.0"}, true), new String[][]{{"contains", "double,double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "clone", new String[]{"java.awt.Shape"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"-2.0"}, true, 0, null, 3), new String[][]{{"contains", "java.awt.geom.Rectangle2D", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"NaN", "-15.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"1.7014117E38", "-35.0"}, true, 0, null, 3), new String[][]{{"moveTo", "float,float", "1"}, {"getBounds", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=-2147483648,y=-2147483648,width=2147483647,height=2147483647] {getCenterX=-1.0737418245E9, getCenterY=-1.0737418245E9, getHeight=2.147483647E9, getMaxX=-1.0, getMaxY=-1.0, getMinX...#321#992610971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:5>", "5.7", "-20.4"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.Line2D", "java.awt.geom.Line2D"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"NaN"}, true, 0, null, 3), new String[][]{{"setWindingRule", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<null>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"-3.4028235E38", "3.4028235E38"}, true, 0, null, 2), new String[][]{{"getBounds", "", "2"}, {"resize", "int,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=-2147483648,y=-2147483648,width=2147483647,height=2] {getCenterX=-1.0737418245E9, getCenterY=-2.147483647E9, getHeight=2.0, getMaxX=-1.0, getMaxY=-2.147483646E9, getMinX=-2.147483...#311#607321521", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"0.1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:7>", "22.018", "-1.2000000000000002"}, true), new String[][]{{"getWindingRule", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "intersects", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<sample:8>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:11>", "<sample:9>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"-3.4028235E38"}, true, 0, null, 3), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createLineRegion", new String[]{"java.awt.geom.Line2D", "float"}, new String[]{"<sample:5>", "-3.4028235E38"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-1.0"}, true, 0, null, 3), new String[][]{{"getWindingRule", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"0.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "Infinity", "NaN", "NaN"}, true);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:3>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"NaN", "-Infinity"}, true), new String[][]{{"getCurrentPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[NaN, NaN] {getX=NaN, getY=NaN}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"-0.03"}, true, 0, null, 2), new String[][]{{"getBounds2D", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=-0.03,y=-0.03,w=0.06,h=0.06] {getCenterX=0.0, getCenterY=0.0, getHeight=0.05999999865889549, getMaxX=0.029999999329447746, getMaxY=0.029999999329447746, getMinX=-0.02...#349#-244508391", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:0>", "Infinity", "8.0"}, true, 0, null, 3), new String[][]{{"getWindingRule", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"1.7014117E38", "0.37"}, true), new String[][]{{"moveTo", "float,float", "0"}, {"getCurrentPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[-Infinity, -1.0] {getX=-Infinity, getY=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"-0.25", "-0.1"}, true, 0, null, 1), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.FlatteningPathIterator", actual.getClass().getName());
  assertEquals("{getFlatness=0.0, getRecursionLimit=10, getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-3.4028235E38"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"Infinity"}, true), new String[][]{{"setWindingRule", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<sample:6>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"3.4028235E38"}, true, 0, null, 1), new String[][]{{"append", "java.awt.Shape,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"0.0", "-Infinity"}, true, 0, null, 3), new String[][]{{"contains", "java.awt.geom.Point2D", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"-3.4028235E38"}, true, 0, null, 3), new String[][]{{"intersects", "java.awt.geom.Rectangle2D", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"0.5"}, true), new String[][]{{"getWindingRule", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-Infinity", "0.5"}, true, 0, null, 3), new String[][]{{"getBounds", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=-2147483648,y=-2147483648,width=0,height=0] {getCenterX=-2.147483648E9, getCenterY=-2.147483648E9, getHeight=0.0, getMaxX=-2.147483648E9, getMaxY=-2.147483648E9, getMinX=-2.147483...#300#408291118", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-3.4028235E38", "0.5"}, true, 0, null, 3), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:3>", "-Infinity", "-1.7976931348623155E307"}, true, 0, null, 2), new String[][]{{"contains", "java.awt.geom.Rectangle2D", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-0.03"}, true, 0, null, 2), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"Infinity", "0.015"}, true), new String[][]{{"setWindingRule", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "NaN", "1.0"}, true), new String[][]{{"append", "java.awt.geom.PathIterator,boolean", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.awt.geom.IllegalPathStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:1>", "NaN", "0.0", "-1.0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-0.48", "0.56"}, true, 0, null, 3), new String[][]{{"append", "java.awt.Shape,boolean", "5"}, {"getWindingRule", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<null>", "<sample:9>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:0>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-1.7014117E38", "-0.03"}, true, 0, null, 3), new String[][]{{"trimToSize", "", "4"}, {"getPathIterator", "java.awt.geom.AffineTransform,double", "3"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.FlatteningPathIterator", actual.getClass().getName());
  assertEquals("{getFlatness=Infinity, getRecursionLimit=10, getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"NaN"}, true, 0, null, 2), new String[][]{{"contains", "java.awt.geom.Point2D", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"NaN", "Infinity"}, true, 0, null, 3), new String[][]{{"setWindingRule", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"0.25", "-36.06"}, true, 0, null, 2), new String[][]{{"getWindingRule", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"0.06"}, true, 0, null, 3), new String[][]{{"getWindingRule", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:5>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"0.5", "-Infinity"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"0.0", "NaN"}, true, 0, null, 1), new String[][]{{"getBounds2D", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=NaN,y=0.0,w=NaN,h=0.0] {getCenterX=NaN, getCenterY=0.0, getHeight=0.0, getMaxX=NaN, getMaxY=0.0, getMinX=NaN, getMinY=0.0, getWidth=NaN, getX=NaN, getY=0.0, isEmpty=t...#204#-1724244399", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"-20.7"}, true, 0, null, 1), new String[][]{{"contains", "double,double", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"-49.95", "-3.4028235E38"}, true, 0, null, 3), new String[][]{{"contains", "java.awt.geom.Rectangle2D", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:3>", "-2.400000000000001", "-3.4028235E38", "-0.03"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:7>", "0.5", "NaN"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"0.03", "0.5"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.FlatteningPathIterator", actual.getClass().getName());
  assertEquals("{getFlatness=0.0, getRecursionLimit=10, getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "0.25", "2.062"}, true, 0, null, 2), new String[][]{{"contains", "java.awt.geom.Rectangle2D", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "0.0", "-0.5"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "getPointInRectangle", new String[]{"double", "double", "java.awt.geom.Rectangle2D"}, new String[]{"0.0", "0.5000000000000001", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"-3.4028235E38", "-Infinity"}, true, 0, null, 3), new String[][]{{"getBounds2D", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=-Infinity,y=-Infinity,w=Infinity,h=Infinity] {getCenterX=NaN, getCenterY=NaN, getHeight=Infinity, getMaxX=NaN, getMaxY=NaN, getMinX=-Infinity, getMinY=-Infinity, getW...#261#1530014065", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "getPointInRectangle", new String[]{"double", "double", "java.awt.geom.Rectangle2D"}, new String[]{"0.444", "-1.0", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"3.4028235E38", "-0.015"}, true, 0, null, 1), new String[][]{{"getBounds2D", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=-3.4028235E38,y=-3.4028235E38,w=Infinity,h=Infinity] {getCenterX=Infinity, getCenterY=Infinity, getHeight=Infinity, getMaxX=Infinity, getMaxY=Infinity, getMinX=-3.402...#341#82838439", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "intersects", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"-3.4028235E38"}, true, 0, null, 1), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<sample:6>", "-1.2000000000000002", "-3.4028235E38", "0.03"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-Infinity"}, true, 0, null, 1), new String[][]{{"getWindingRule", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"3.4028235E38"}, true, 0, null, 3), new String[][]{{"getCurrentPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[0.0, 3.4028235E38] {getX=0.0, getY=3.4028234663852886E38}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:5>", "Infinity", "-0.5"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "1"}, {"currentSegment", "double[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"-3.4028235E38", "1.0"}, true, 0, null, 1), new String[][]{{"intersects", "java.awt.geom.Rectangle2D", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"0.001", "-0.5"}, true, 0, null, 3), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.FlatteningPathIterator", actual.getClass().getName());
  assertEquals("{getFlatness=0.0, getRecursionLimit=10, getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "0.5", "NaN"}, true, 0, null, 1), new String[][]{{"transform", "java.awt.geom.AffineTransform", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-1.0"}, true, 0, null, 2), new String[][]{{"setWindingRule", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.GeneralPath", actual.getClass().getName());
  assertEquals("{getWindingRule=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Shape", "java.awt.Shape"}, new String[]{"<null>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-0.0"}, true), new String[][]{{"getCurrentPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Float", actual.getClass().getName());
  assertEquals("Point2D.Float[0.0, 0.0] {getX=0.0, getY=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "-Infinity", "NaN"}, true), new String[][]{{"contains", "java.awt.geom.Point2D", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "intersects", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:9>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"0.5"}, true), new String[][]{{"getBounds2D", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=-0.5,y=-0.5,w=1.0,h=1.0] {getCenterX=0.0, getCenterY=0.0, getHeight=1.0, getMaxX=0.5, getMaxY=0.5, getMinX=-0.5, getMinY=-0.5, getWidth=1.0, getX=-0.5, getY=-0.5, isE...#211#-558254125", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createUpTriangle", new String[]{"float"}, new String[]{"NaN"}, true, 0, null, 1), new String[][]{{"getWindingRule", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "-3.5953862697246315E307", "0.5000000000000002"}, true), new String[][]{{"getBounds", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=0,y=0,width=0,height=0] {getCenterX=0.0, getCenterY=0.0, getHeight=0.0, getMaxX=0.0, getMaxY=0.0, getMinX=0.0, getMinY=0.0, getWidth=0.0, getX=0.0, getY=0.0, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:6>", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-0.15"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Float$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"Infinity"}, true, 0, null, 2), new String[][]{{"getBounds2D", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=-Infinity,y=-Infinity,w=Infinity,h=Infinity] {getCenterX=NaN, getCenterY=NaN, getHeight=Infinity, getMaxX=NaN, getMaxY=NaN, getMinX=-Infinity, getMinY=-Infinity, getW...#261#1530014065", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"9.0"}, true), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "1"}, {"getFlatness", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.GeneralPath"}, new String[]{"<sample:7>", "<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"3.4028235E38"}, true, 0, null, 2), new String[][]{{"getBounds2D", "", "1"}, {"getCenterY", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createRegularCross", new String[]{"float", "float"}, new String[]{"-0.03", "3.4028235E38"}, true, 0, null, 1), new String[][]{{"getWindingRule", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"1.7014117E38"}, true, 0, null, 2), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "org.jfree.chart.util.RectangleAnchor", "double", "double"}, new String[]{"<sample:3>", "<sample:4>", "0.05", "0.4930000000000001"}, true), new String[][]{{"contains", "double,double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"-3.4028235E37"}, true, 0, null, 3), new String[][]{{"getBounds2D", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=-3.4028235E37,y=-3.4028235E37,w=6.805647E37,h=6.805647E37] {getCenterX=0.0, getCenterY=0.0, getHeight=6.805646932770577E37, getMaxX=3.4028234663852886E37, getMaxY=3.4...#387#-1470654435", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiamond", new String[]{"float"}, new String[]{"Infinity"}, true, 0, null, 1), new String[][]{{"getBounds2D", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=-Infinity,y=-Infinity,w=Infinity,h=Infinity] {getCenterX=NaN, getCenterY=NaN, getHeight=Infinity, getMaxX=NaN, getMaxY=NaN, getMinX=-Infinity, getMinY=-Infinity, getW...#261#1530014065", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDiagonalCross", new String[]{"float", "float"}, new String[]{"-0.03", "0.2"}, true, 0, null, 2), new String[][]{{"getBounds2D", "", "5"}, {"add", "java.awt.geom.Rectangle2D", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "equal", new String[]{"java.awt.Polygon", "java.awt.Polygon"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createTranslatedShape", new String[]{"java.awt.Shape", "double", "double"}, new String[]{"<sample:3>", "-1.0", "0.49999999999999994"}, true), new String[][]{{"createTransformedShape", "java.awt.geom.AffineTransform", "0"}, {"getWindingRule", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "createDownTriangle", new String[]{"float"}, new String[]{"3.4028235E38"}, true, 0, null, 1), new String[][]{{"contains", "java.awt.geom.Rectangle2D", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "rotateShape", new String[]{"java.awt.Shape", "double", "float", "float"}, new String[]{"<null>", "-8.988465674311578E305", "Infinity", "NaN"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeUtilities", "org.jfree.chart.util.ShapeUtilities", "getPointInRectangle", new String[]{"double", "double", "java.awt.geom.Rectangle2D"}, new String[]{"-1.2000000000000004", "0.5000000000000001", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
